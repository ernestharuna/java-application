public class Faculty extends Employee {
    private String officeHours;
    private Course[] teachingCourses;

    /**
     * @param name
     * @param ID
     * @param payRate
     * @param officeHours
     * @param teachingCourses
     */

    public Faculty(String name, int ID, double payRate, String officeHours, Course[] teachingCourses) {
        super(name, ID, payRate);
        this.officeHours = officeHours;
        this.teachingCourses = teachingCourses;
    }

    public String getOfficeHours() {
        return this.officeHours;
    }

    public void setOfficeHours(String hours) {
        this.officeHours = hours;
    }

    public Course[] getTeachingCourse() {
        return this.teachingCourses;
    }

    public void setTeachingCourses(Course[] teachingCourses) {
        this.teachingCourses = teachingCourses;
    }

    public static void main(String[] args) {

    }
}

/*
 * Faculty, that extends Employee, and has two additional variables; officeHours
 * of type String and teachingCourses, which is an array of Courses. Each course
 * has course code and course title. Write appropriate accessor, mutator and
 * toString methods for the class.
 */