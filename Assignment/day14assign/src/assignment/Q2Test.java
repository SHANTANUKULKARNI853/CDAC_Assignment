/*2) . Use employee class to store id,name,sal,dept and designation.  
a. Use HashSet to store multiple employee objects. Add required functions in the appropriate 
class. 
No duplicate employee entries are allowed. -2 Employee objects are same if their id is same  
b.       
b. Use Treemap to store multiple Employee objects. Add required functions in the 
appropriate class. */
package assignment;

class Test {

    public static void main(String[] args) {

        Q2EmployeeService service = new Q2EmployeeService();

        Employee e1 =
                new Employee(101, "Rahul", 50000, "IT", "Developer");

        Employee e2 =
                new Employee(102, "Amit", 60000, "HR", "Manager");

        Employee e3 =
                new Employee(103, "Pratik", 45000, "IT", "Tester");

        Employee e4 =
                new Employee(101, "Rahul", 50000, "IT", "Developer");

        System.out.println("HASHSET:");

        service.addToHashSet(e1);
        service.addToHashSet(e2);
        service.addToHashSet(e3);
        service.addToHashSet(e4);

        service.displayHashSet();

        System.out.println("TREEMAP:");

        service.addToTreeMap(e1);
        service.addToTreeMap(e2);
        service.addToTreeMap(e3);
        service.addToTreeMap(e4);

        service.displayTreeMap();
    }
}
