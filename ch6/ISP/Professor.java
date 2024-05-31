public class Professor {
    private ProfessorInterface academicManagement;

    public Professor(ProfessorInterface academicManagement) {
        this.academicManagement = academicManagement;
    }

    public void registerGrades() {
        academicManagement.registerGrades();
    }

    public void inquireAllGrades() {
        academicManagement.inquireAllGrades();
    }
}
