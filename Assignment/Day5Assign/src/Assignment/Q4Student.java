package Assignment;

import java.util.Date;
import java.text.SimpleDateFormat;

class Q4Student {

    private int studentId;
    private String name;
    private int mks1;
    private int mks2;
    private int mks3;
    private Date birthDate;

    private static int count = 100;

    Q4Student() {
        studentId = ++count;
        name = "Unknown";
        mks1 = 0;
        mks2 = 0;
        mks3 = 0;
        birthDate = null;
    }

    Q4Student(String name, int mks1, int mks2, int mks3, Date birthDate) {
        studentId = ++count;
        this.name = name;
        this.mks1 = mks1;
        this.mks2 = mks2;
        this.mks3 = mks3;
        this.birthDate = birthDate;
    }

    int getStudentId() {
        return studentId;
    }

    String getName() {
        return name;
    }

    int getMks1() {
        return mks1;
    }

    int getMks2() {
        return mks2;
    }

    int getMks3() {
        return mks3;
    }

    Date getBirthDate() {
        return birthDate;
    }

    void setName(String name) {
        this.name = name;
    }

    void setMks1(int mks1) {
        this.mks1 = mks1;
    }

    void setMks2(int mks2) {
        this.mks2 = mks2;
    }

    void setMks3(int mks3) {
        this.mks3 = mks3;
    }

    void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    double getAverage() {
        return (mks1 + mks2 + mks3) / 3.0;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        return "Student ID = " + studentId +
               "\nStudent Name = " + name +
               "\nBirth Date = " + sdf.format(birthDate) +
               "\nMarks 1 = " + mks1 +
               "\nMarks 2 = " + mks2 +
               "\nMarks 3 = " + mks3 +
               "\nAverage Marks = " + getAverage();
    }
}
