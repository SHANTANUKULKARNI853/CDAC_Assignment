package Day3.src;

class Course {

    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourse() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " months");
    }
}
