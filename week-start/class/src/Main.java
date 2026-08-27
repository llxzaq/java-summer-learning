public class Main {
    public static void main(String[] args) {
        Score<String> levelScore = new Score<>("高等数学", "MATH-001", "优秀");
        Score<Double> numericScore = new Score<>("大学英语", "ENG-001", 92.5);

        String level = levelScore.getValue();
        Double numericValue = numericScore.getValue();

        System.out.printf("%s（%s）：%s%n",
                levelScore.getCourseName(), levelScore.getCourseNumber(), level);
        System.out.printf("%s（%s）：%.1f%n",
                numericScore.getCourseName(), numericScore.getCourseNumber(), numericValue);
    }
}
