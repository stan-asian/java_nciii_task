
public class Sample {

    public static void main(String[] args) {
        Sample s = new Sample();
        int res = s.Multiply((a, b) -> a * b, 10, 10);
        System.out.println(res);

    }

    int Add(int x, int y) {
        return x + y;
    }

    @FunctionalInterface
    public interface Operation {
        int compute(int a, int b);
    }

    int Multiply(Operation op, int a, int b) {
        return op.compute(a, b);
    }
}