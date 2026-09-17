package AssignmentQ5Package1;

public class Student {

    private int studentId;
    private String name;
    private int mks1;
    private int mks2;
    private int mks3;

    private static int count = 100;

    public Student() {
        studentId = ++count;
        name = "Unknown";
        mks1 = 0;
        mks2 = 0;
        mks3 = 0;
    }

    public Student(String name, int mks1, int mks2, int mks3) {
        studentId = ++count;
        this.name = name;
        this.mks1 = mks1;
        this.mks2 = mks2;
        this.mks3 = mks3;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getMks1() {
        return mks1;
    }

    public int getMks2() {
        return mks2;
    }

    public int getMks3() {
        return mks3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMks1(int mks1) {
        this.mks1 = mks1;
    }

    public void setMks2(int mks2) {
        this.mks2 = mks2;
    }

    public void setMks3(int mks3) {
        this.mks3 = mks3;
    }

    public double getAverage() {
        return (mks1 + mks2 + mks3) / 3.0;
    }

    public String toString() {
        return "Student ID = " + studentId +
               "\nStudent Name = " + name +
               "\nMarks 1 = " + mks1 +
               "\nMarks 2 = " + mks2 +
               "\nMarks 3 = " + mks3 +
               "\nAverage Marks = " + getAverage();
    }
}