public class AcademicManagement implements StudentInterface, StaffInterface, ProfessorInterface {
    @Override
    public void registerCourse() {
        System.out.println("학생이 수강신청을 합니다.");
    }

    @Override
    public void inquireGrades() {
        System.out.println("학생이 성적을 조회합니다.");
    }

    @Override
    public void setCourseRegistrationPeriod() {
        System.out.println("직원이 수강신청 기간을 설정합니다.");
    }

    @Override
    public void setGradeInquiryPeriod() {
        System.out.println("직원이 성적조회 기간을 설정합니다.");
    }

    @Override
    public void registerGrades() {
        System.out.println("교수가 성적을 등록합니다.");
    }

    @Override
    public void inquireAllGrades() {
        System.out.println("교수가 총 성적을 조회합니다.");
    }
}
