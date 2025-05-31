package taskSheet_8;

public class taskSheet8 {
    public static void main(String[] args) {
        System.out.println(sumOfAll(1,2,3,4,5));
    }

    static int sumOfAll(int... args){
        int counter = 0;
        int total = 0;
        while (counter < args.length) {
            int currentHoldValue = args[counter];
        
            for(int i = 0; currentHoldValue > i ; currentHoldValue--){
                total = total + currentHoldValue;
            }
            counter++;
        }
        return total;
    }
}
