package day7.EmployeeManagement.model;


public class Manager extends Employee {

    private double bonus;

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
