public class Teacher extends Person {

    private String department;
    private String courses;

    // Constructor
    public Teacher(String firstName, String lastName, String gender,
                   String department, String courses) {

        super(firstName, lastName, gender); // call parent constructor
        this.department = department;
        this.courses = courses;
    }

    // Getters
    public String getDepartment() {
        return department;
    }

    public String getCourses() {
        return courses;
    }

    // Setters
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() +
               ", Department: " + department +
               ", Courses: " + courses;
    }

    // equals method
    public boolean equals(Teacher t) {
        if (t == null) {
            return false;
        }

        return super.equals(t) &&
               this.department.equals(t.department) &&
               this.courses.equals(t.courses);
    }
}
