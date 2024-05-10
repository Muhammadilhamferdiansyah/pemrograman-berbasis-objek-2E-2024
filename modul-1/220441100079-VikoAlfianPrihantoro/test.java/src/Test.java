
import java.util.Scanner;

class Human {
    private String name;
    private int age;
    private String address;

    // parameterized constructor
    public Human(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void walk() {
        System.out.println(name + " sedang berjalan.");
    }

    public void run() {
        System.out.println(name + " sedang berlari.");
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

public class Test {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String nameInput = scanner.nextLine();
        System.out.print("Enter age: ");
        int ageInput = scanner.nextInt();
        System.out.print("Enter address: ");
        scanner.nextLine();
        String addressInput = scanner.nextLine();

        Human h1 = new Human(nameInput, ageInput, addressInput);
        h1.display();
        h1.walk();
        h1.run();
    }
}
