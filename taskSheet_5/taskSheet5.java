package taskSheet_5;

public class taskSheet5 {
    public static void main(String[] args) {
        largestNumber(10, 4, 3);
    }

    static void largestNumber(int x, int y, int z){
        if(x == y && y == z){
            System.out.println("All numbers are equal!");
        }else{
           if(x > y){
            if(x > z){
                System.out.println(x + " x is the Largest Number!");
            }
           }else{
            if(y > z){
                System.out.println(y + " y is the Largest Number!");
            }else{
                System.out.println(z + " z is the Largest Number!");
            }
           }
        }
    }
}
