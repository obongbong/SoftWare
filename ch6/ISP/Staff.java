public class Staff {
    private StaffInterface academicManagement;

    public Staff(StaffInterface academicManagement) {
        this.academicManagement = academicManagement;
    }

    public void setCourseRegistrationPeriod() {
        academicManagement.setCourseRegistrationPeriod();
    }

    public void setGradeInquiryPeriod() {
        academicManagement.setGradeInquiryPeriod();
    }
}
