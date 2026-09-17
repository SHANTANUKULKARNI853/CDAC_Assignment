package assignment;

class Q3Employee extends Q3Person {

    double salary;

    Q3Employee(int id, String name, String mobile, String email, double salary) {
        super(id, name, mobile, email);
        this.salary = salary;
    }

    void display() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Mobile = " + mobile);
        System.out.println("Email = " + email);
        System.out.println("Salary = " + salary);
    }
}
