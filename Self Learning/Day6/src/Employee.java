package Day6.src;

public class Employee extends Question1
{
	int id;
	String name;
	Department department;
	
	public Employee(int id, String name, Department department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	public void display() {
		System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        
        switch(department) {
        
    	case HR: 
    		System.out.println("hello, welcome in the HR department");
    		break;
    		
    	case IT: 
    		System.out.println("hello, welcome in the IT department");
    		break;
    		
    	case FINANCE: 
    		System.out.println("hello, welcome in the FINANCE department");
    		break;
    		
    	case SALES: 
    		System.out.println("hello, welcome in the SALES department");
    		break;
    		
    	case MARKETING: 
    		System.out.println("hello, welcome in the MARKETING department");
    		break;
    	}
	}	
}

