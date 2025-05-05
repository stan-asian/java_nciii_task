// package progChallenge.sumAndAverage;

public class Main {
    public static void main(String[] args) {

        Main m = new Main();

        int[] arr = {1,2,3,4,5,6}; // sum: 15, avg: 3.00;
        System.out.println("SUM:    " + m.sum(arr));
        System.out.println("AVG:    " + m.avg(m.sum(arr), arr.length));
    }

    int sum(int[] arr){
        int tempMem = 0;
        for(int i = 0 ; i < arr.length ; i++){
            tempMem += arr[i];
        }
        return tempMem;
    }

    double avg(int callBack, int arrLength){
        return (double) callBack / arrLength;
    }
}