/*use previously created Student class 
   add 1 variable inside that class Date birthDate 
   
  while creating Student class object accept data from user and store inside Date format variable */
package Assignment;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

class Q4Test {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = sc.next();

        System.out.println("Enter Marks 1:");
        int mks1 = sc.nextInt();

        System.out.println("Enter Marks 2:");
        int mks2 = sc.nextInt();

        System.out.println("Enter Marks 3:");
        int mks3 = sc.nextInt();

        System.out.println("Enter Birth Date (dd-MM-yyyy):");
        String dateString = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Date birthDate = sdf.parse(dateString);

        Q4Student s1 = new Q4Student(name, mks1, mks2, mks3, birthDate);

        System.out.println("\nStudent Details:");
        System.out.println(s1);

        sc.close();
    }
}
