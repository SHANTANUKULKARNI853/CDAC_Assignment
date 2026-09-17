package assignment;

class Employee implements Comparable<Employee> {

    int id;
    String name;
    double sal;
    String dept;
    String designation;

    Employee(int id, String name, double sal, String dept, String designation) {
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

    public boolean equals(Object obj) {

        Employee e = (Employee) obj;

        return this.id == e.id;
    }

    public int hashCode() {

        return Integer.hashCode(id);
    }

    public int compareTo(Employee e) {

        return this.id - e.id;
    }
}
