package taskSheet_1_2_2;

public class MyDate {
    public static void main(String[] args) {

        DateTask date1 = new DateTask();
        DateTask date2 = new DateTask();
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        date1.setDay(0);
        date2.setDay(0);

       // display leapyears
        DateTask.leapYears();
    }
}