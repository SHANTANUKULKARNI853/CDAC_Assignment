package assignment;

import java.time.LocalDate;
import java.time.Period;

class Q2Employee {

    int empId;
    double basicSalary;
    String joiningDate;

    Q2Employee(int empId, double basicSalary, String joiningDate) {
        this.empId = empId;
        this.basicSalary = basicSalary;
        this.joiningDate = joiningDate;
    }

    void displayExperience() {

        LocalDate joinDate = LocalDate.parse(joiningDate);
        LocalDate currentDate = LocalDate.now();

        Period experience = Period.between(joinDate, currentDate);

        System.out.println("Employee ID = " + empId);
        System.out.println("Basic Salary = " + basicSalary);
        System.out.println("Joining Date = " + joiningDate);
        System.out.println("Experience = " +
                experience.getYears() + " Years " +
                experience.getMonths() + " Months " +
                experience.getDays() + " Days");
    }
}
