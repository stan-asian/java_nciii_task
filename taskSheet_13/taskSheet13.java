package taskSheet_13;

public class taskSheet13{
    public static void main(String[] args) {
            Car car1 = new Car("Toyota", "Camry", 2022, 4);
            String result = car1.displayDetails();
            System.out.println(result);
    }
}

class Vehicle{
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

}

class Car extends Vehicle{
    private int numberOfDoor;

    public Car(String make, String model, int year, int numberOfDoor) {
        super(make, model, year);
        this.numberOfDoor = numberOfDoor;
    }

    public String displayDetails(){
        return "\nCar Details: " +
                "\nMake Toyota: " + this.make +
                "\nModel: " + this.model +
                "\nYear :" + this.year +
                "\nNumber of Doors: " + this.numberOfDoor;
    }
}