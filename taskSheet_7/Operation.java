import java.util.Scanner;

public class Operation{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Operation operation = new Operation();

        System.out.println("Enter Number of the Corresponding Operation.");
        System.out.println("1: ADDITION");
        System.out.println("2: SUBTRACTION");
        System.out.println("3: MULTIPLICATION");
        System.out.println("4: DIVISION");
        System.out.print("ENTER A NUMBER HERE (1-4): ");
        int sign = scan.nextInt();

        System.out.println("Enter First Num: ");
        int num1 = scan.nextInt();
        System.out.println("Enter Second Num: ");
        int num2 = scan.nextInt();

        
        int add = operation.Addition(num1, num2);
        int subtract = operation.Subtraction(num1, num2);
        int multiply = operation.Multiplication(num1, num2);
        float divide = operation.Division(num1, num2);
        

        switch (sign) {
            case 1:
                System.out.println("Answer Using Addition: " + add);
                break;
        
            case 2:
                System.out.println("Answer Using Subtraction: " + subtract);
                break;
        
            case 3:
                System.out.println("Answer Using Multiplication: " + multiply);
                break;
        
            case 4:
                System.out.println("Answer Using Division: " + divide);
                break;
        }
    }   

    int Addition(int x, int y){
        return x + y;
    }
    int Subtraction(int x, int y){
        int result = x - y;
        return result < 0 ? result*-1 : result;
    }
    int Multiplication(int x, int y){
        return x * y;
    }
    float Division(int x, int y){
        return x / y == 0 ? 0 : x / y;
    }
    
}