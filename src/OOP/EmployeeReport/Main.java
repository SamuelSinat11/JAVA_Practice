package OOP.EmployeeReport;

public class Main {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Heng", "Mean Chey", 1000 , "Super Leader", 10);
        Developer developer1 = new Developer("Sok", "Bong KoK", 700, "Web Developer", "Web Khmer24");
        Programmer programmer1 = new Programmer("Hakim San", "SR", 500, "FullStack Develop", "Java Spring Boot ");

        System.out.println("Manager Bonus " + manager1.calculateBonus() + "\n"+ manager1.generateReport() + "n" + manager1.manageProject());
        System.out.println("Developer Bonus " + developer1.calculateBonus() + "\n" + developer1.generateReport());
        System.out.println("Programmer Bonus " + programmer1.calculateBonus() +"\n" + programmer1.generateReport() + programmer1.getProgrammingLanguage());

    }
}
