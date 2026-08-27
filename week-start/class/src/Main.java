public class Main {
    public static void main(String[] args) {
        Score<String> levelScore = new Score<>("高等数学", "MATH-001", "优秀");
        Score<Integer> numericScore = new Score<>("大学英语", "ENG-001", 92);
        String[] texts = {"优秀", "良好"};
        Integer[] numbers = {90, 85};

        Score.printArray(texts);
        Score.printArray(numbers);

    }
}
