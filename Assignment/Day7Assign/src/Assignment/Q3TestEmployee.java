/*Create Employee POJo class with variables

String empId , firstName , lastName 



Write 2 parametrised Constructor which accept firstName , lastName 

Write generateCode() in Employee class and generate Employee Id 

First 2 letters from firstName 
, last 2 letters from lastName and number ( counter) 


From Main function create Employee Object and Display Employee Details*/


package Assignment;

class Q3TestEmployee {

    public static void main(String[] args) {

        Q3Employee e1 = new Q3Employee("Shantanu", "Kulkarni");
        Q3Employee e2 = new Q3Employee("Rahul", "Patil");
        Q3Employee e3 = new Q3Employee("Amit", "Sharma");

        System.out.println(e1);
        System.out.println();

        System.out.println(e2);
        System.out.println();

        System.out.println(e3);
    }
}
