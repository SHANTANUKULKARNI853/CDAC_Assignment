package Assignment;

class Q4Vendor extends Q4Employee {

    int noOfEmployees;
    double amount;

    Q4Vendor(String name, String mobile, String email, String department,
           String designation, String dateOfJoining,
           int noOfEmployees, double amount) {

        super(name, mobile, email, department, designation, dateOfJoining);
        this.noOfEmployees = noOfEmployees;
        this.amount = amount;
    }

    double calculateSalary() {
        return amount + amount * 0.18;
    }

    void display() {

        super.display();

        System.out.println("Type = Vendor");
        System.out.println("No Of Employees = " + noOfEmployees);
        System.out.println("Amount = " + amount);
        System.out.println("Amount with GST = " + calculateSalary());
    }
}
