package Day6.src;//90–100 → A 
// 75–89 → B 
// 60–74 → C 
// 40–59 → D 
// Below 40 → F 

public class Student {
	String name;
	int roleNum;
	int marks;

	public Student(String name, int roleNum, int marks) {
		this.name = name;
		this.roleNum = roleNum;
		this.marks = marks;

	}

	public void calculateGrade(){
		
		class Grade{
			public void showGrade() {
				if(marks >= 90 && marks <= 100) {
					System.out.println("Grade A");
					}
				else if(marks >= 75 && marks <= 89) {
					System.out.println("Grade B");
					}
				else if(marks >= 60 && marks <= 74) {
					System.out.println("Grade C");
					}
				else if(marks >= 40 && marks <= 59) {
					System.out.println("Grade D");
					}
				else {
					System.out.println("Grade F");
					}   
			}
		}
	}
	
	public void diplay() {
		System.out.println(name);
		System.out.println(roleNum);
		System.out.println(marks);
	}

}
