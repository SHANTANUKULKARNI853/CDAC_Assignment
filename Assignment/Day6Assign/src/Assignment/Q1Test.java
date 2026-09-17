/*Create 

Person  , Employee , Salaried and ContractEmployee 
as shown in class  they are in is-a releationship 

and understand concept  of 

Super - for constructor 
Method Override 
TypeCasting of Non Primitive Datatype 
equals method (Override in every class)*/


package Assignment;

class Q1Test {

    public static void main(String[] args) {

        Q1Salaried s = new Q1Salaried("Shantanu", 25, 101, "IT", 50000);

        Q1ContractEmployee c = new Q1ContractEmployee("Rahul", 28, 102, "Development", 30000, 12);

        System.out.println("Salaried Employee");
        s.displaySalaried();

        System.out.println();

        System.out.println("Contract Employee");
        c.displayContractEmployee();
    }
}
