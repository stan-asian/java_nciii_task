package progChallenge.progChallenge_4;

public class progChalleng4 {
    public static void main(String[] args) {
        System.out.println("TESTING --(8)--");
        print(8);
        System.out.println("TESTING --(0)--");
        print(0);
        System.out.println("TESTING --(3)--");
        print(3);
        System.out.println("TESTING --(-3)--");
        print(-3);
    }

    static boolean isEven(int num) {
        if (num == 0) {
            return true;
        } else {
            return num % 2 == 0;
        }

    }

    static boolean isPositive(int num) {
        return num >= 0;
    }

    static boolean isZero(int num) {
        return num == 0;
    }

    static void print(int num) {
        System.out.println("IS EVEN: " + isEven(num));
        System.out.println("IS POSTIVE: " + isPositive(num));
        System.out.println("IS ZERO: " + isZero(num));
    }

}
