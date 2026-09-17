package Assignment;

class Q4Employee {

    static int counter = 100;

    int id;
    String name;
    String mobile;
    String email;
    String department;
    String designation;
    String dateOfJoining;

    Q4Employee(String name, String mobile, String email, String department,
             String designation, String dateOfJoining) {

        id = ++counter;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.department = department;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
    }

    double calculateSalary() {
        return 0;
    }

    void display() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Mobile = " + mobile);
        System.out.println("Email = " + email);
        System.out.println("Department = " + department);
        System.out.println("Designation = " + designation);
        System.out.println("Date of Joining = " + dateOfJoining);
    }
}
