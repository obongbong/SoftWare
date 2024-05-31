public class SRP_Test {
    public static void main(String[] args)
    {
        course course1 = new course();
        grade grade1 = new grade();

        course1.RegisterforCourses();
        course1.CheckTimetable();
        course1.Opensubject();

        grade1.view_cumulative_grades();
        grade1.view_grades();
        grade1.input_grade();
    }
}
