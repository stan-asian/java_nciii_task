package progChallenge.progChallenge_5;

import java.util.Scanner;

public class progChalleng5 {
    public static void main(String[] args) {
        int result = summation();
        System.out.println(result);
    }

    static int summation() {
        Scanner scan = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter size: ");
        int size = scan.nextInt();

        for (int i = 1; i <= size; i++) {
            System.out.println("Enter number in position " + i + ": ");
            int num = scan.nextInt();
            total += num;
        }
        scan.close();

        return total;

    }
}
