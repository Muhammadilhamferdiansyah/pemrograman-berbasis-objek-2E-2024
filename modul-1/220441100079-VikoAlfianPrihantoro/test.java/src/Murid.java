
import java.util.Scanner;

public class Murid {
    private String name;
    private String nim;
    private String department;
    private Address address;

    public Murid(String name, String nim, String department, Address address) {
        this.name = name;
        this.nim = nim;
        this.department = department;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display() {
        System.out.println("Nama: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("Department: " + department);
        System.out.println("Alamat: " + address.getStreet() + ", " + address.getCity() + ", " + address.getState());
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nama: ");
            String nameInput = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nimInput = scanner.nextLine();
            System.out.print("Masukkan departemen: ");
            String departmentInput = scanner.nextLine();
            System.out.print("Masukkan nama jalan: ");
            String streetInput = scanner.nextLine();
            System.out.print("Masukkan kota: ");
            String cityInput = scanner.nextLine();
            System.out.print("Masukkan provinsi: ");
            String stateInput = scanner.nextLine();
            
            // Membuat objek Address dengan input pengguna
            Address studentAddress = new Address(streetInput, cityInput, stateInput);

            // Membuat objek Murid dengan input pengguna
            Murid student = new Murid(nameInput, nimInput, departmentInput, studentAddress);

            // Menampilkan detail murid
            student.display();
        }
    }
}

