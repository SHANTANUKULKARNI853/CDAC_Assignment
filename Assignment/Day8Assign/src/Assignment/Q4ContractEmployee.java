package Assignment;

class Q4ContractEmployee extends Q4Employee {

    int hoursWorked;
    double ratePerHour;

    Q4ContractEmployee(String name, String mobile, String email, String department,
                     String designation, String dateOfJoining,
                     int hoursWorked, double ratePerHour) {

        super(name, mobile, email, department, designation, dateOfJoining);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    double calculateSalary() {
        return hoursWorked * ratePerHour;
    }

    void display() {

        super.display();

        System.out.println("Type = Contract Employee");
        System.out.println("Hours Worked = " + hoursWorked);
        System.out.println("Rate Per Hour = " + ratePerHour);
        System.out.println("Salary = " + calculateSalary());
    }
}
