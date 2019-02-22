// class declaration
public class ConstructorExample3{
	
	// add a constructor that takes two arguments
	public ConstructorExample3(String name, int age){
		// print a statement to the user
		System.out.println("Welcome "+ name+" Your age is "+age);
	}
	// let's add our main method
	public static void main(String[] args){
		// create an object of the class and make a call to the constructor.
		// make sure to pass arguments to the constructor
		new ConstructorExample3("Peter", 35);
	}
}