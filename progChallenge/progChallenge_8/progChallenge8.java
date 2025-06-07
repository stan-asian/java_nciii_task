package progChallenge.progChallenge_8;

import java.util.Scanner;

public class progChallenge8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any word (letters must be 5 up):  ");
        String input = scan.nextLine();

        scan.close();

        StringOperation op = new StringOperation(input);
        System.out.println("INPUT LENGTH:   " + op.StringLength());
        System.out.println("UPPERCASE   :   " + op.toUpperString());
        System.out.println("LOWERCASE   :   " + op.toLowerString());
        System.out.println("FIRST CHAR  :   " + op.firstChar());
        System.out.println("LAST CHAR   :   " + op.lastChar());
        System.out.println("SUBSTRING   :   " + op.subString());
    }
}

class StringOperation {
    private String input;

    StringOperation(String input) {
        this.input = input;
    }

    int StringLength() {
        return input.length();
    }

    String toUpperString() {
        return input.toUpperCase();
    }

    String toLowerString() {
        return input.toLowerCase();
    }

    char firstChar() {
        return input.charAt(0);
    }

    char lastChar() {
        return input.charAt(input.length() - 1);
    }

    String subString() {
        StringBuilder s = new StringBuilder();
        JUMPER: for (int i = 0; i < input.length(); i++) {
            if (input.length() < 5) {
                return "Can't form a substring";
            } else {
                if (i == 0 || i > 4) {
                    continue JUMPER;
                } else {
                    s.append(input.charAt(i));
                }
            }
        }
        return s.toString();
    }

}