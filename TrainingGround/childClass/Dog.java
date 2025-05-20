package TrainingGround.childClass;
import TrainingGround.parentClass.*;

public class Dog extends Animal{

    boolean canBark;

    public Dog(boolean canBark, boolean canWalk, boolean canSwim, boolean canFly){
        super(canWalk, canSwim, canFly);
        this.canBark = canBark;
    }

    public void canBark(){
        if(this.canBark){
            System.out.println("This animal can Bark");
        }
        else{
            System.out.println("This animal cannot Bark");
        }
    }
}
