package progChallenge.progChallenge_3;

public class Main {
    public static void main(String[] args) {
        String result = dayName(0);
        System.out.println(result);
    }

    static String dayName(int dayNum) {
        switch (dayNum) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid Input";
        }
    }
}
