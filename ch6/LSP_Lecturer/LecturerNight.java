public class LecturerNight extends Lecturer {
    public LecturerNight() {
        lecturer = "야간 강사";
        charge = 135000;
    }

    @Override
    public void Lecturer() {
        System.out.println(lecturer);
        System.out.println("강사료: " + charge + "원\n");
    }
}
