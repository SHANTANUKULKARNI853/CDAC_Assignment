package Day3.src;
class Student {

    int rollNo;
    String name;

    // Object reference
    Course course;

    Student(int rollNo, String name, Course course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    void displayStudent() {

        System.out.println("Roll No     : " + rollNo);
        System.out.println("Name        : " + name);

        course.displayCourse();
    }
}