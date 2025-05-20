package TrainingGround;

import TrainingGround.childClass.Dog;

public class Training {
    
    public static void main(String[] args) {
        Dog bruno = new Dog(true, true, false, false);
        bruno.canSwim();
        bruno.canFly();
        bruno.canWalk();
        bruno.canBark();
    }

}
