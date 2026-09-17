package Assignment;

class Q3Employee {
    int employeeId;
    String name;

    Q3Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    void showData() {
        System.out.println("Employee ID = " + employeeId);
        System.out.println("Name = " + name);
    }
}
