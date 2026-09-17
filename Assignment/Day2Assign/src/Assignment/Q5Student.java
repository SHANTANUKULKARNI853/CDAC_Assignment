/*Create Student Class with variable 
	String name 
	int mks1 , mks2 , mks3 
	

	declare default and parameterised constrcutor 
	at the end display average marks with studentDetails */

package Assignment;

class Q5Student {

    String name;
    int mks1;
    int mks2;
    int mks3;

    Q5Student() {
        name = "Unknown";
        mks1 = 0;
        mks2 = 0;
        mks3 = 0;
    }

    Q5Student(String name, int mks1, int mks2, int mks3) {
        this.name = name;
        this.mks1 = mks1;
        this.mks2 = mks2;
        this.mks3 = mks3;
    }

    void studentDetails() {
        double average = (mks1 + mks2 + mks3) / 3.0;

        System.out.println("Student Name = " + name);
        System.out.println("Marks 1 = " + mks1);
        System.out.println("Marks 2 = " + mks2);
        System.out.println("Marks 3 = " + mks3);
        System.out.println("Average Marks = " + average);
    }

    public static void main(String[] args) {

        Q5Student s1 = new Q5Student("Shantanu", 80, 75, 90);

        s1.studentDetails();
    }
}
