public class Student {
    private StudentInterface academicManagement;

    public Student(StudentInterface academicManagement) {
        this.academicManagement = academicManagement;
    }

    public void registerCourse() {
        academicManagement.registerCourse();
    }

    public void inquireGrades() {
        academicManagement.inquireGrades();
    }
}
