package assignment;

class Q3Employee {

    int id;
    double salary;
    String name;

    Q3Employee(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    void display() {

        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
    }

    public String toString() {

        return id + "," + salary + "," + name;
    }
}