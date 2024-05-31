public class Main {
    public static void main(String[] args) {
        AcademicManagement academicManagement = new AcademicManagement();

        Student student = new Student(academicManagement);
        Staff staff = new Staff(academicManagement);
        Professor professor = new Professor(academicManagement);

        student.registerCourse();
        student.inquireGrades();

        staff.setCourseRegistrationPeriod();
        staff.setGradeInquiryPeriod();

        professor.registerGrades();
        professor.inquireAllGrades();
    }
}
