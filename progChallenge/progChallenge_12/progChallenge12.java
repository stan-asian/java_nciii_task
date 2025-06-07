package progChallenge.progChallenge_12;

public class progChallenge12 {
    public static void main(String[] args) {

        Methods m = new Methods();

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println("SUM:    " + m.sum(arr));
        System.out.println("AVG:    " + m.avg(m.sum(arr), arr.length));
    }
}

class Methods {
    int sum(int[] arr) {
        int tempMem = 0;
        for (int i = 0; i < arr.length; i++) {
            tempMem += arr[i];
        }
        return tempMem;
    }

    double avg(int callBack, int arrLength) {
        return (double) callBack / arrLength;
    }
}