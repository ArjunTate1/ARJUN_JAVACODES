// Parent class
class Person {
    void speak() {
        System.out.println("Person can speak.");
    }
}

// Child class
class Arjun extends Person {
    void study() {
        System.out.println("Arjun is studying Java.");
    }
}

// Main class
public class Singleinheritance {
    public static void main(String[] args) {
        Arjun s = new Arjun();
        s.speak();   // Inherited from Person
        s.study();   // Own method of Arjun
    }
}