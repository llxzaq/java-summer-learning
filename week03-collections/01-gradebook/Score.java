public class Score<T> {
    private T value;
    private String name;
    private int number;

    public Score(T value, String name, int number) {
        this.value = value;
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public Score<T> changeValue(T value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "课程号=" + number
                + ", 课程名=" + name
                + ", 成绩=" + value;
    }

    public boolean tell(int number) {
        return this.number == number;
    }
}
