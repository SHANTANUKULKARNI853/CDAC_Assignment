package Assignment;

class Q1Employee extends Q1Person {

    int employeeId;
    String department;

    Q1Employee() {
        super();
        employeeId = 0;
        department = "Unknown";
    }

    Q1Employee(String name, int age, int employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID = " + employeeId);
        System.out.println("Department = " + department);
    }
}