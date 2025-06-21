// Parent class
class Person {
    void speak() {
        System.out.println("Person can speak.");
    }
}

// First child class
class Arjun extends Person {
    void dance() {
        System.out.println("Arjun can dance.");
    }
}

// Second child class
class Rahul extends Person {
    void sing() {
        System.out.println("Rahul can sing.");
    }
}

// Main class
public class Hierarchicalinheritance{
    public static void main(String[] args) {
        Arjun s = new Arjun();
        s.speak(); 
        s.dance();  

        Rahul t = new Rahul();
        t.speak(); 
        t.sing();   
    }
}