/************************
 * Date: 22/02/2019     *
 * Title: Age Calculator*
 * Author: Class2019    *
 * Version: 1           *
 ************************/
// declare the class
public class AgeCalculator{
	// declare variables
	int thisYear = 2019;
	int userAge;

	// declare the constructor
	public AgeCalculator(int yearOfBirth){
		// perform calculation
		this.userAge = thisYear - yearOfBirth;
	}

	// add the main method
	public static void main(String[] args){
		// create an object of the class
		AgeCalculator c = new AgeCalculator(1993);
		// display info to user
		System.out.println("Welcome to Java, your age is: "+c.userAge);
	}
}