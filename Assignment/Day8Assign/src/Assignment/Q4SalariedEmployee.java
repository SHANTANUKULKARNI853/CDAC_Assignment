package Assignment;

class Q4SalariedEmployee extends Q4Employee {

    double basicSalary;

    Q4SalariedEmployee(String name, String mobile, String email, String department,
                     String designation, String dateOfJoining, double basicSalary) {

        super(name, mobile, email, department, designation, dateOfJoining);
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {

        double da = basicSalary * 0.10;
        double hra = basicSalary * 0.15;
        double pf = basicSalary * 0.12;

        return basicSalary + da + hra - pf;
    }

    void display() {

        super.display();

        System.out.println("Type = Salaried Employee");
        System.out.println("Basic Salary = " + basicSalary);
        System.out.println("Net Salary = " + calculateSalary());
    }
}
