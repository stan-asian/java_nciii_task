package taskSheet_9;

public class taskSheet9{
    public static void main(String[] args) {
        System.out.println(add(3,4));
        System.out.println(subtract(3,4));
        System.out.println(multiply(3,4));
        System.out.println(divide(4,3));
    }

    static int add(int a, int b){
        return Math.addExact(a, b);
    }
    static int subtract(int a, int b){
        return Math.abs(Math.subtractExact(a, b));
    }
    static int multiply(int a, int b){
        return Math.multiplyExact(a, b);
    }
    static float divide(int a, int b){
        float result = a / b;
        System.out.println(result);
        return Math.floorDiv(a, b);
    }
}