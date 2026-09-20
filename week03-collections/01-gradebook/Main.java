import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Score<String> A = new Score<>("A", "math", 1);
        Score<String> B = new Score<>("B", "Chinese", 2);
        Score<Integer> C = new Score<>(90, "English", 3);
        Score<Integer> D = new Score<>(80, "history", 4);
        ArrayList<Score<?>> a = new ArrayList<>();

        a.add(A);
        a.add(B);
        a.add(C);
        a.add(D);

        System.out.println("=== 初始列表 ===");
        for (Score<?> score : a) {
            System.out.println(score);
        }

        System.out.println("=== 查询成功 ===");
        for (Score<?> score : a) {
            if (score.tell(3)) {
                System.out.println(score);
                break;
            }
        }

        System.out.println("=== 查询失败 ===");
        boolean found = false;
        for (Score<?> score : a) {
            if (score.tell(99)) {
                System.out.println(score);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("查不到课程号 99");
        }

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).tell(2)) {
                a.set(i, new Score<>("A", "Chinese", 2));
                break;
            }
        }

        System.out.println("=== 更新后列表 ===");
        for (Score<?> score : a) {
            System.out.println(score);
        }
    }
}
