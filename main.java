class main {
    // First interface
// First interface
interface Dancer {
    void dance();
}

// Second interface
interface Singer {
    void sing();
}

// Class implementing both interfaces
class Arjun implements Dancer, Singer {
    public void dance() {
        System.out.println("Arjun can dance.");
    }

    public void sing() {
        System.out.println("Arjun can sing.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Arjun s = new Arjun();
        s.dance();
        s.sing();
    }
}