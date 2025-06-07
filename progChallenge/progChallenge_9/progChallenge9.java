package progChallenge.progChallenge_9;

import java.util.Scanner;

public class progChallenge9 {
    public static void main(String[] args) {
        prompter("AA");
    }

    static void prompter(String letter) {
        String letterHolder = letter;
        while (letterHolder.length() > 1) {
            Scanner scan = new Scanner(System.in);
            System.out.println("ENTER ANY LETTER:   ");
            letter = scan.nextLine();
            letterHolder = letter;
        }

        // is Vowel

        switch (letterHolder.toUpperCase()) {
            case "A":
                System.out.println(letterHolder + " is a Vowel!");
                break;
            case "E":
                System.out.println(letterHolder + " is a Vowel!");
                break;
            case "I":
                System.out.println(letterHolder + " is a Vowel!");
                break;
            case "O":
                System.out.println(letterHolder + " is a Vowel!");
                break;
            case "U":
                System.out.println(letterHolder + " is a Vowel!");
                break;
            default:
                System.out.println(letterHolder + " is a Consonant!");
                break;
        }
    }

}
