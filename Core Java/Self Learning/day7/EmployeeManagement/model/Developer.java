package day7.EmployeeManagement.model;


public class Developer extends Employee {

    private String language;

    public Developer(int id, String name, double salary, String language) {
        super(id, name, salary);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}