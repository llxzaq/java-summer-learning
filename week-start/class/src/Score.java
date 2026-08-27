public class Score<T> {
    private final String courseName;
    private final String courseNumber;
    private final T value;

    public Score(String courseName, String courseNumber, T value) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.value = value;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public T getValue() {
        return value;
    }
    public static <T> void printArray(T[] values){
        for(int i=0;i<values.length;i+=1){
            T a=values[i];

            System.out.println(a);

        }

    }
}
