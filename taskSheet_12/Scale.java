package taskSheet_12;

//INTERFACE
interface PointMethods{
    abstract void scale();
    abstract void print();
}

//PSVM
public class Scale {

    public static void main(String[] args) {

        Point p = new Point(32,32);
        int step = 0;
        while(step < 10){
            p.scale();
            p.print();
            step++;
        }
    }
}

// TOP-LEVEL CLASS
class Point implements PointMethods{
    private double x, y;

    // Constructor
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void scale(){
        this.x = this.x / 2;
        this.y = this.y / 2;
    }

    @Override
    public void print(){
        System.out.println("FINAL RESULT: " + "(" + x + ", " + y + ")");
    }

}