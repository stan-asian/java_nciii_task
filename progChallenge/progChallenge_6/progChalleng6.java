package progChallenge.progChallenge_6;

public class progChalleng6 {
    public static void main(String[] args) {
        treeBuilder(10, "@");
    }

    static void treeBuilder(int rows, String symbol) {

        // Outer -> row builder
        for (int i = 1; i <= rows; i++) {

            // logic for spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // logic for symbol
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(symbol);
            }

            System.out.println();

        }
    }
}
