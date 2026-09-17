package Assignment;

class Q3Employee {

    private String empId;
    private String firstName;
    private String lastName;

    private static int counter = 100;

    Q3Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        generateCode();
    }

    Q3Employee(String firstName, String lastName, int counter) {
        this.firstName = firstName;
        this.lastName = lastName;
        Q3Employee.counter = counter;
        generateCode();
    }

    void generateCode() {
        String firstTwo = firstName.substring(0, 2);
        String lastTwo = lastName.substring(lastName.length() - 2);

        empId = firstTwo + lastTwo + (++counter);
    }

    public String getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "Employee ID = " + empId +
               "\nFirst Name = " + firstName +
               "\nLast Name = " + lastName;
    }
}
