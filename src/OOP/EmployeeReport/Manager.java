package OOP.EmployeeReport;

public class Manager extends Employee {

    private int numberOfSubordinates;
    public Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinates) {
        super(name, address, salary, jobTitle);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public String generateReport() {
        return "Performance manager every Good " + getName() ;
    }

    public String manageProject() {
        return "Manager" + getName() + "is managing the project ";
    }

}
