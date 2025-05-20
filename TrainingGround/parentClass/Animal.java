package TrainingGround.parentClass;

public class Animal {

    boolean canWalk, canSwim, canFly, canBark;

    public Animal(boolean canWalk, boolean canSwim, boolean canFly, boolean canBark){
        this.canWalk = canWalk;
        this.canSwim = canSwim;
        this.canFly = canFly;
        this.canBark = canBark;
    }

    public void canFly(){
        if(this.canFly){
            System.out.println("This animal can Fly");
        }
        else{
            System.out.println("This animal cannot Fly");
        }
    }

    public void canSwim(){
        if(this.canSwim){
            System.out.println("This animal can Swim");
        }
        else{
            System.out.println("This animal cannot Swim");
        }
    }

    public void canWalk(){
        if(this.canWalk){
            System.out.println("This animal can Walk");
        }
        else{
            System.out.println("This animal cannot Walk");
        }
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
