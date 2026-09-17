package selflearning;

class Q1College {

    String collegeName;
    Q1Student student;

    Q1College(String collegeName, Q1Student student) {
        this.collegeName = collegeName;
        this.student = student;
    }

    void displayStudentDetails() {
        System.out.println("College = " + collegeName);
        student.display();
    }
}