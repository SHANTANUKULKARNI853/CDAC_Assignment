/*
4) Create MyDate class 
	add default Constructor  , parametrised Constructor 
	printDate Method
	
	add validateDate() method and write a code in that to validate date

	first check year -  if leap year then check month --  then day
	if date is incorrect then display InvalidDate message 
	and valid date then ValidDate message 

   write main function inside Test class 
*/


package Assignment;

class Q4Test {

    public static void main(String[] args) {

        Q4MyDate d1 = new Q4MyDate();
        d1.printDate();
        d1.validateDate();

        Q4MyDate d2 = new Q4MyDate(29, 2, 2024);
        d2.printDate();
        d2.validateDate();

        Q4MyDate d3 = new Q4MyDate(29, 2, 2023);
        d3.printDate();
        d3.validateDate();
    }
}
