package assignment;

class Q5Employee {

    int id;
    String name;
    double sal;

    Q5Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    void display() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + sal);
    }
}
