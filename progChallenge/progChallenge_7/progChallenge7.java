package progChallenge.progChallenge_7;

public class progChallenge7 {
    public static void main(String[] args) {
        multiplicationTable(10);
    }

    static void multiplicationTable(int size) {
        // Print column headers
        System.out.print("     ");
        for (int col = 1; col <= size; col++) {
            System.out.printf("%4d", col);
        }
        System.out.println();

        // Print separator
        System.out.print("     ");
        for (int col = 1; col <= size; col++) {
            System.out.print("----");
        }
        System.out.println();

        // Labeled outer loop
        TABLE: for (int row = 1; row <= size; row++) {
            System.out.printf("%3d |", row);
            for (int col = 1; col <= size; col++) {
                System.out.printf("%4d", row * col);

                // Example: stop printing if product reaches 50
                if (row * col >= 100) {
                    System.out.println("  <-- Reached 50, breaking TABLE");
                    break TABLE; // breaks the entire table
                }
            }
            System.out.println();
        }

    }
}
