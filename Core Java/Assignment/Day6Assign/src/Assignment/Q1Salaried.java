package Assignment;

class Q1Salaried extends Q1Employee {

    double salary;

    Q1Salaried() {
        super();
        salary = 0;
    }

    Q1Salaried(String name, int age, int employeeId, String department, double salary) {
        super(name, age, employeeId, department);
        this.salary = salary;
    }

    void displaySalaried() {
        displayEmployee();
        System.out.println("Salary = " + salary);
    }
}
