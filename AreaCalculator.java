import java.util.Scanner;
public class AreaCalculator{
 	//declare required constants and variables
 	double pie = 22/7;
 	int r;// r is the radius and will gottern from the user
 	double area;
	public static void main(String[] args){
		System.out.println("Please, enter the radius of a circle");
		Scanner s = new Scanner(System.in);
		AreaCalculator ac = new AreaCalculator();
		// get the value of radius from user and assign to r
		ac.r = s.nextInt();
		// calculate the area and save in area variable
		ac.area = ac.pie * ac.r * ac.r;

		// Display info to the use
		System.out.println("The area of your circle is: "+ac.area+"m^2");
	}
}