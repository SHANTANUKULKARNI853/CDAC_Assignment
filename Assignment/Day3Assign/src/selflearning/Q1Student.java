package selflearning;

class Q1Student {

    int id;
    String name;
    int marks;

    Q1Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student ID = " + id);
        System.out.println("Student Name = " + name);
        System.out.println("Marks = " + marks);
    }
}
