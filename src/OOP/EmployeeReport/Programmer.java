package OOP.EmployeeReport;

public class Programmer extends Employee {

    private String programmingLanguage;
    public Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);

        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

    @Override
    public String generateReport() {
        return "performance report for programming language: " + getName()+ "\n";
    }

    public void debug() {
        System.out.println("The Programming Language: " + getName() + "debug using " + getProgrammingLanguage());
    }
}
