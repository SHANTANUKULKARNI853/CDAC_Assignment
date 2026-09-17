package assignment;

class Q3SalariedEmployee extends Q3Employee {

    Q3SalariedEmployee(int id, String name, String mobile, String email, double salary) {
        super(id, name, mobile, email, salary);
    }

    void display() {
        super.display();
        System.out.println("Type = Salaried Employee");
    }
}
