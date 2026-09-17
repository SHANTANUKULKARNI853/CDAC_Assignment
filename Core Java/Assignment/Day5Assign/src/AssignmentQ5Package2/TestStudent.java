/*use already created Student class and TestStudent class 
   keep both classes inside different package and access that*/

package AssignmentQ5Package2;

import AssignmentQ5Package1.Student;

class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student("Shantanu", 80, 75, 90);

        System.out.println(s1);
    }
}
