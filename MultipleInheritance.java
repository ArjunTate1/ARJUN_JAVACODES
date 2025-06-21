// First interface
interface Writer {
    void write();
}
// Second interface
interface Reader {
    void read();
}
// Class implementing both interfaces
class Arjun implements Writer, Reader {
    public void write() {
        System.out.println("Arjun is writing Java code.");
    }

    public void read() {
        System.out.println("Arjun is reading Java notes.");
    }
}
// Main class
public class MultipleInheritance {
    public static void main(String[] args) {
        Arjun s = new Arjun();
        s.write();
        s.read();
    }
}