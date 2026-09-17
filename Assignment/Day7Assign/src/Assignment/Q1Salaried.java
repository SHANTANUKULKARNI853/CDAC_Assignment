package Assignment;

class Q1Salaried extends Q1Employee {

    double salary;

    Q1Salaried() {
        super();
        salary = 0;
    }

    Q1Salaried(int employeeId, String name, double salary) {
        super(employeeId, name);
        this.salary = salary;
    }

    @Override
    Q1Salaried getObject(Object o) {
        return new Q1Salaried(employeeId, name, salary);
    }

    void display() {
        System.out.println("Employee ID = " + employeeId);
        System.out.println("Employee Name = " + name);
        System.out.println("Salary = " + salary);
    }
}
