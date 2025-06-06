package taskSheet_16;

public class taskSheet16 {
    public static void main(String[] args) {
        Animal gori = new Gorilla();
        gori.feed(false);
        gori.groom();
        gori.pet();
    }
}

interface Animal {
    boolean feed(boolean timeToEat);

    void groom();

    void pet();
}

class Gorilla implements Animal {
    public boolean feed(boolean timeToEat) {
        // Put gorilla food into cage
        System.out.println("Put gorilla food into cage");
        return true;
    }

    public void groom() {
        // lather, rinse, repeat
        System.out.println("lather, rinse, repeat");
    }

    public void pet() {
        // Pet at your own risk!
        System.out.println("Pet at your own risk!");
    }
}
