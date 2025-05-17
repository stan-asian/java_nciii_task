import java.util.Scanner;

public class Operation{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Operation operation = new Operation();

        System.out.println("Enter Operation: ");
        String sign = scan.nextLine();

        System.out.println("Enter First Num: ");
        int num1 = scan.nextInt();
        System.out.println("Enter Second Num: ");
        int num2 = scan.nextInt();

        
        int add = operation.Addition(num1, num2);
        int subtract = operation.Subtraction(num1, num2);
        int multiply = operation.Multiplication(num1, num2);
        float divide = operation.Division(num1, num2);
        

        switch (sign) {
            case "add":
                System.out.print("ADDITION: " + add);
                break;
        
            case "subtract":
                System.out.print("SUBTRACTION: " + subtract);
                break;
        
            case "multiply":
                System.out.print("MULTIPLY: " + multiply);
                break;
        
            case "divide":
                System.out.println("DIVIDE: " + divide);
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