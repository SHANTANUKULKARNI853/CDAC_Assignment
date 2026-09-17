package Assignment;

class Q1Employee {

    int employeeId;
    String name;

    Q1Employee() {
        employeeId = 0;
        name = "Unknown";
    }

    Q1Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    Q1Employee getObject(Object o) {
        return new Q1Employee(employeeId, name);
    }

    void display() {
        System.out.println("Employee ID = " + employeeId);
        System.out.println("Employee Name = " + name);
    }
}
