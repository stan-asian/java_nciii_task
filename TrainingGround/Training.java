package TrainingGround;
import TrainingGround.childClass.Dog;
import TrainingGround.parentClass.Animal;

public class Training {
    
    public static void main(String[] args) {
        Animal bruno = new Dog(true, true, false, false);
        bruno.canSwim();
        bruno.canFly();
        bruno.canWalk();
        bruno.canBark();
    }

}