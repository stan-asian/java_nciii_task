package progChallenge.progChallenge_2;

public class numberToMonth {
    public static void main(String[] args) {
        int result = numberOfDaysInAMonth(4);
        System.out.println(result);
    }

    static int numberOfDaysInAMonth(int monthNum) {
        switch (monthNum) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                System.out.println("No month associate with the inputted number: " + monthNum);
                return monthNum; // Or throw an IllegalArgumentException
        }
    }
}
