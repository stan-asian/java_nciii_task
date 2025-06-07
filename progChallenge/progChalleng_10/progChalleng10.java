package progChallenge.progChalleng_10;

public class progChalleng10 {
    public static void main(String[] args) {
        String sentence = "Hello World, I am Stanley Panag From Heavens Gate Arena!";
        int count = 1;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println(count);
    }
}
