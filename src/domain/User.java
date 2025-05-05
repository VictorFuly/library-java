package domain;

public class User {
    private String name;
    private int registration;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public int getRegistration() {
        return this.registration;
    }
}
