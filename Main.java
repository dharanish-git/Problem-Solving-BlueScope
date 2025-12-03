package general;


interface Animal {
    void sound();
}

// Class implementing the interface
class Dog implements Animal {
    public void sound() {
        System.out.println("classes and interfaces");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

