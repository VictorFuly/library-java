package domain.Users;

public class User {
    private String name;
    private int registration;

    public User (String name, int registration) {
        this.name = name;
        this.registration = registration;
    }

    public void displayInfo() {
        System.out.print("Name: " + name + " | Registration: " + registration);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public int getRegistration() {
        return this.registration;
    }
}
