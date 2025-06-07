package progChallenge.progChallenge_1;

public class scoreToGrade {
    public static void main(String[] args) {
        // TEST CASES
        char result1 = grading(101);
        System.out.println(result1);
    }

    static char grading(int grade) {

        if (grade < 60) {
            return 'F';
        } else if (grade < 70) {
            return 'D';
        } else if (grade < 80) {
            return 'C';
        } else if (grade < 90) {
            return 'B';
        } else if (grade <= 100) {
            return 'A';
        } else {
            System.out.println("THE VALUE EXCEED THE MAXIMUM GRADE");
            return 'A';
        }

    }
}
