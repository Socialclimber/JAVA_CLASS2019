/************************
 * Date: 22/02/2019     *
 * Title: Age Calculator*
 * Author: Class2019    *
 * Version: 1           *
 ************************/
// import scanner and use it to scan input from user
import java.util.Scanner;
// declare the clas
public class AgeCalculator1{
	// declare variables
	int thisYear = 2019;
	int userAge;
 // declare the constructor
	public AgeCalculator1(int yearOfBirth){
		this.userAge = thisYear - yearOfBirth;
	}

	// add the main method
	public static void main(String[] args){
		// ask user for input
		System.out.println("Enter your year of Birth");
		// create an object of the class
		Scanner input = new Scanner(System.in);
		// get value from user and assign to variable c
		//int c = input.nextInt();
		// create and object of the class
		AgeCalculator1 c1 = new AgeCalculator1(input.nextInt());
		// display info to the user
		System.out.println("Welcome to Java, your age is: "+c1.userAge);
		System.out.println(20%25);
	}
}