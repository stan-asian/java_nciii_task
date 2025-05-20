package TrainingGround.childClass;
import TrainingGround.parentClass.Animal;

public class Dog extends Animal{

    public Dog(boolean canBark, boolean canWalk, boolean canSwim, boolean canFly){
        super(canWalk, canSwim, canFly, canBark);
    }
}
