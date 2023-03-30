public class Course {
    private int code;
    private String title;

    public Course(int code, String title) {
        this.code = code;
        this.title = title;
    }

    public int getCourseCode() {
        return code;
    }

    public void setcode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "Course Code: " + code + "\nCourse Title: " + title;
    }
}
