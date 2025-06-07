package progChallenge.progChallenge_11;

import java.util.Scanner;

public class progChallenge11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER STRING :");
        String input = scan.nextLine();
        scan.close();
        StringBuilder s = new StringBuilder(input);

        System.out.println("Length of the string: " + lengthOfTheString(s));
        System.out.println("First character: " + firstChar(s));
        System.out.println("Last character: " + lastChar(s));
        System.out.println("Index of first occurrence of 'a': " + indexReturnWithA(s));
        System.out.println("Substring (3 to 6): " + subString(s.toString()));

        StringBuilder appended = new StringBuilder(appending(s));
        System.out.println("After appending '123': " + appended);

        String inserted = insertString(appended);
        System.out.println("After inserting 'xyz' at index 4: " + inserted);

        StringBuilder deletedSub = deleteSubstring(new StringBuilder(inserted));
        System.out.println("After deleting substring index 2 to 4: " + deletedSub);

        StringBuilder deletedChar = deleteCharAtIndex(deletedSub, 8);
        System.out.println("After deleting character at index 8: " + deletedChar);

        StringBuilder reversed = reverseString(deletedChar);
        System.out.println("Reversed string: " + reversed);
    }

    static int lengthOfTheString(StringBuilder text) {
        return text.length();
    }

    static char firstChar(StringBuilder text) {
        return text.charAt(0);
    }

    static char lastChar(StringBuilder text) {
        return text.charAt(text.length() - 1);
    }

    static int indexReturnWithA(StringBuilder text) {
        return text.indexOf("a");
    }

    static String subString(String text) {
        if (text.length() < 7)
            return "Can't form a substring";
        return text.substring(3, 7); // 3 to 6 inclusive
    }

    static String appending(StringBuilder text) {
        text.append("123");
        return text.toString();
    }

    static String insertString(StringBuilder text) {
        text.insert(4, "xyz");
        return text.toString();
    }

    static StringBuilder deleteSubstring(StringBuilder text) {
        if (text.length() >= 4) {
            text.delete(2, 4);
        }
        return text;
    }

    static StringBuilder deleteCharAtIndex(StringBuilder text, int index) {
        if (index >= 0 && index < text.length()) {
            text.deleteCharAt(index);
        }
        return text;
    }

    static StringBuilder reverseString(StringBuilder text) {
        return text.reverse();
    }
}
