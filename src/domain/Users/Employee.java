package domain.Users;

import domain.Library;

public class Employee extends User{
    private double salary;
    private Library library;

    public Employee(String name, int registration, Library library) {
        super(name, registration);
        this.library = library;
        salary = 0;
    }

    public Employee(String name, int registration, Library library, double salario) {
        this(name, registration, library);
        this.salary = salario;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Library: " + library.getName() + " | Salary: R$" + salary);
    }

    public Client registerClient(String name, int registration, Library library) {
        if (this.library != library) {
            System.out.println("This employee don't work in same library!");
            return null;
        }
        return new Client(name, registration, library);
    }

    public void removeClient(Client client) {
        if (library != client.getLibrary()) {
            System.out.println("This employee don't work in same library!");
            return;
        }
        library.removeCLient(client);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
