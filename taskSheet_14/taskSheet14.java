package taskSheet_14;

public class taskSheet14 {
    public static void main(String[] args) {
        A a = new A();
        a.abstractMethod();
        System.out.println(a.sayHello("Maria"));

        B b = new B();
        b.abstractMethod();
        System.out.println(b.sayHello("Proline"));
    }
}

abstract class abstractClass {
    abstract void abstractMethod();

    String sayHello(String name) {
        return "Hello " + name;
    }
}

class A extends abstractClass {
    @Override
    void abstractMethod() {
        System.out.println("A's implementation of abstract method!");
    }
}

class B extends abstractClass {
    @Override
    void abstractMethod() {
        System.out.println("B's implementation of abstract method!");
    }
}