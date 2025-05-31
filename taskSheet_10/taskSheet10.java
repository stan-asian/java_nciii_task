package taskSheet_10;

public class taskSheet10 {
    public static void main(String[] args) {
        Student ana = new Student("Ana", "Bayan");
        ana.printFullName();
    }   
}

class Student{
    private String firstName;
    private String lastName;

    Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void printFullName(){
        System.out.println("My Name is " + this.firstName + " " + this.lastName);
    }
}