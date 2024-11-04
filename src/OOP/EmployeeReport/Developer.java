package OOP.EmployeeReport;

class Developer extends Employee {

    public String projectManage;
    private String Project;

    public Developer(String name, String address, double salary, String jobTitle, String Project) {
        super(name, address, salary, jobTitle);
        this.Project = Project;
    }

    public String getProject() {
        return Project;
    }

    public void setProject(String Project) {
        this.Project = Project;
    }

    @Override
    public double calculateBonus () {
        return getSalary() * 0.13;
    }

    @Override
    public String generateReport () {
        return "Performance Report for Developer " + getName() + "Good";
    }

    public String projectManage () {
        return "Developer" + getName() + "is Managing the Project" + getProject();
    }

}

