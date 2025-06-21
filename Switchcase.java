public class Switchcase {

    public static void main(String[] args) {
        String name = "Arjun";

        switch (name) {
            case "Arjun":
                System.out.println("Hello, Arjun!");
                break;

            case "Harsh":
                System.out.println("Hi, Harsh!");
                break;

            case "Saaili":
                System.out.println("Hey, Saaili!");
                break;

            default:
                System.out.println("Name not found.");
        }
    }
}

