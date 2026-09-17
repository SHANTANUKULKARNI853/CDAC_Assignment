package Day6.src;
public class Company {
	static String companyName = "TCS";
	static String location = "Pune";
	
	Company(String companyName, String location){
		this.companyName = companyName;
		this.location = location;
	}
	
	static class Employee{
		int employeeId;
		String employeeName;
		
		Employee(int employeeId, String employeeName){
			this.employeeId = employeeId;
			this.employeeName = employeeName;
		}
		
		public void dispalyData() {
			System.out.println(employeeId);
			System.out.println(employeeName);
			System.out.println(companyName);
			System.out.println(location);
		}
		
	}
}
