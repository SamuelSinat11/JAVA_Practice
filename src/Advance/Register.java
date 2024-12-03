package Advance;

public class Register {
    private int id;
    private String firstName;
    private String lastName;
    private int Age;
    private String email;
    private String password;
    private String Address;

    public Register(int id, String firstName, String lastName, int age, String email, String password, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
        this.email = email;
        this.password = password;
        Address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Register{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Age=" + Age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
