import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.nio.file.Files;
import java.io.BufferedReader;
public class Main {
    public  static  void  main(String[] args)throws IOException{
        if (args.length > 0 && args[0].equals("list")) {
        // 1. 指定文件地址
        Path path = Path.of("data", "tasks.tsv");

        // 2. 显示本次实际读取的位置
        System.out.println("数据文件：" + path.toAbsolutePath());

        // 3. 调用加载方法，接收返回的任务表
        HashMap<String, Task> tasks = loadTasks(path);

        // 4. 输出数量和任务内容
        System.out.println("加载任务数：" + tasks.size());
        prAll(tasks);

        // 5. 结束 main，跳过下面的旧演示
        return;
    }
        HashMap<String, Task> tasks = new HashMap<>();
        HashSet<String> subjects=new HashSet<>();
        ArrayDeque<String> deque=new ArrayDeque<>();
        Task task1 = new Task(
                "1",
                "mimi",
                "java",
                Task.Priority.MEDIUM,
                false
        );
        Task task2 = new Task(
                "2",
                "数学作业",
                "math",
                Task.Priority.HIGH,
                false
        );
        Task task3 = new Task(
                "3",
                "Java复习",
                "java",
                Task.Priority.HIGH,
                false
        );
        Task task4 = new Task(
                "1",
                "mi",
                "java",
                Task.Priority.MEDIUM,
                false
        );
        System.out.println(task1.toTsv());
        String line=task1.toTsv();
        Task task5=Task.fromTsv(line);
        System.out.println(task5.toString());
        newTask(tasks, subjects,deque,task1);
        newTask(tasks, subjects,deque,task2);
        newTask(tasks, subjects,deque,task3);
        newTask(tasks, subjects,deque,task4);
        seekTask(tasks, "2").mark();
        while (!deque.isEmpty()) {
            String taskId = deque.poll();
            System.out.println("处理任务：" + taskId);
        }
        System.out.println("队列为空");
        System.out.println(subjects);
        List<Task> unfinishment =tasks.values()
        .stream()
        .filter(a->!a.getDone())
        .toList();
        for(Task task:unfinishment){
             System.out.println(task.toString());
        }
        List<String> high =tasks.values()
        .stream()
        .filter(a->a.getPriority()==Task.Priority.HIGH)
        .map(a -> a.getTitle())
        .toList();
        long count = tasks.values()
        .stream()
        .filter(task -> !task.getDone())
        .count();
        System.out.println(count);
        for(String title:high){
             System.out.println(title);
        }
    }
    public static void newTask(
            HashMap<String,Task> map,
            HashSet<String> subjects,
            ArrayDeque<String> deque,
            Task task){
        if(map.containsKey(task.getId())){
            System.out.println("id重复");
        }
        else{
            if(task.getDone()==false){
                deque.offer(task.getId());
            }
            map.put(task.getId(), task);
            subjects.add(task.getSubject());
        }
    }
    public static Task seekTask(
            HashMap<String,Task> map,
            String id){
        Task task=map.get(id);
        System.out.println(task.toString());
        return task;
    }
    public static void prAll(
            HashMap<String,Task> map){
        for(Task task:map.values()){
            System.out.println(task.toString());
        }
    }
    static HashMap<String, Task> loadTasks(Path path) throws IOException {
        HashMap<String, Task> tasks = new HashMap<>();
        Path parent = path.getParent();
        if (parent != null) {
            Files.createDirectories(parent);
        }


        if (!Files.exists(path)) {
            Files.createFile(path);
            return tasks;
        }


        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;

            while ((line = reader.readLine()) != null) {

                Task task = Task.fromTsv(line);


                if (tasks.containsKey(task.getId())) {
                    System.err.println("重复 id：" + task.getId());
                    continue;
                }


                tasks.put(task.getId(), task);
            }
        }



        return tasks;
    }
}
