package assignment;

class Q3ContractEmployee extends Q3Employee {

    Q3ContractEmployee(int id, String name, String mobile, String email, double salary) {
        super(id, name, mobile, email, salary);
    }

    void display() {
        super.display();
        System.out.println("Type = Contract Employee");
    }
}
