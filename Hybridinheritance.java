// Interface 1
interface Dancer {
    void dance();
}

// Interface 2
interface Speaker {
    void speak();
}

// Base class
class Person implements Speaker {
    public void speak() {
        System.out.println("Person can speak.");
    }
}

// Child class
class Arjun extends Person implements Dancer {
    public void dance() {
        System.out.println("Arjun can dance.");
    }

    public void sing() {
        System.out.println("Arjun can sing.");
    }
}

// Main class
public class Hybridinheritance {
    public static void main(String[] args) {
        Arjun s = new Arjun();
        s.speak();  // from Person
        s.dance();  // from Dancer
        s.sing();   // in Arjun
    }
}