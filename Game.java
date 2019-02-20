//let's import the required classes
import java.util.Random;
import java.util.Scanner;

// declare my java class
public class Game{
	// add mainj method
	public static void main(String[] args){
		// create objects of the required classes
		Random r = new Random();
		Scanner s = new Scanner(System.in);

		int a = r.nextInt(10);
		int b = r.nextInt(20);
		 int c = a + b;

		 System.out.println("What is "+a+" + "+b+" ? :");
		 int ans = s.nextInt();

		 if(c == ans){
		 	System.out.println("Correct answer ");
		 }else{

		 	System.out.println("Wrong Answer: Correct answer is "+c);
		 }
	}
}