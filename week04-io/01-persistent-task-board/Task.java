import java.time.LocalDate;
public class Task {
    private String id;
    private String title;
    private String subject;
    private Priority priority;
    private boolean done;
    private LocalDate createdDate;
    public enum Priority{
        LOW,
        MEDIUM,
        HIGH
    }
    public Task(String id,
            String title,
            String subject,
            Priority priority,
            boolean done){
        this.id = id;
        this.title = title;
        this.subject = subject;
        this.priority = priority;
        this.done = done;
        this.createdDate=LocalDate.now();
    }
    public String getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getSubject(){
        return this.subject;
    }
    public Priority getPriority(){
        return this.priority;
    }
    public boolean getDone(){
        return this.done;
    }
    public String getCreatedDate() {
        return this.createdDate.toString();
    }
    public void mark(){
        this.done=true;
    }
    public static Task fromTsv(String line) {
        String[] fields = line.split("\t", -1);

        if (fields.length != 6) {
            throw new IllegalArgumentException("一条任务必须有 6 个字段");
        }

        if (!fields[4].equals("true") && !fields[4].equals("false")) {
            throw new IllegalArgumentException("完成状态必须是 true 或 false");
        }

        Task task = new Task(
            fields[0],                     // id
            fields[1],                     // title
            fields[2],                     // subject
            Priority.valueOf(fields[3]),    // 字符串转枚举
            Boolean.parseBoolean(fields[4]) // 字符串转 boolean
        );

        // 使用文件里的原日期，覆盖构造方法生成的今天日期。
        task.createdDate = LocalDate.parse(fields[5]);

        return task;
    }
    public String toTsv() {
        return this.id + "\t"
            + this.title + "\t"
            + this.subject + "\t"
            + this.priority + "\t"
            + this.done + "\t"
            + this.createdDate;
    }
    @Override
    public String toString() {
        return "id:" + this.id
            + ", title:" + this.title
            + ", subject:" + this.subject
            + ", priority:" + this.priority
            + ", done:" + this.done
            + ", createdDate:" + this.createdDate;
    }
}
