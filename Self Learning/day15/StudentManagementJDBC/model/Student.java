package day15.StudentManagementJDBC.model;

public class Student {

    private int rollNo;
    private String name;
    private String department;

    public Student(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo +
                ", Name: " + name +
                ", Department: " + department;
    }
}
