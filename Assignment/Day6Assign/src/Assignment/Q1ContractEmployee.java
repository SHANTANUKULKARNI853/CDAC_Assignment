package Assignment;

class Q1ContractEmployee extends Q1Employee {

    double contractAmount;
    int contractDuration;

    Q1ContractEmployee() {
        super();
        contractAmount = 0;
        contractDuration = 0;
    }

    Q1ContractEmployee(String name, int age, int employeeId, String department, double contractAmount, int contractDuration) {
        super(name, age, employeeId, department);
        this.contractAmount = contractAmount;
        this.contractDuration = contractDuration;
    }

    void displayContractEmployee() {
        displayEmployee();
        System.out.println("Contract Amount = " + contractAmount);
        System.out.println("Contract Duration = " + contractDuration + " months");
    }
}
