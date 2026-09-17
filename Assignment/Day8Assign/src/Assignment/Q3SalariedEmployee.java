package Assignment;

class Q3SalariedEmployee extends Q3Employee implements Printable {
    double salary;

    Q3SalariedEmployee(int employeeId, String name, double salary) {
        super(employeeId, name);
        this.salary = salary;
    }

    public void print() {
        System.out.println("Salaried Employee");
        System.out.println("Employee ID = " + employeeId);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
    }
}
