package assignment;

class Q3Employee {

    int id;
    String name;
    double sal;
    String dept;
    String designation;

    Q3Employee(int id, String name, double sal, String dept, String designation) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
        this.designation = designation;
    }

    void display() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + sal);
        System.out.println("Department = " + dept);
        System.out.println("Designation = " + designation);
    }
}
