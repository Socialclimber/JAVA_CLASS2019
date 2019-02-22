public class ConstructorExample2{
	// constructor that takes arguments
	public ConstructorExample2(String n){
		System.out.println("Welcome to programming Mr. "+n);
	}
	// adding the main method
	public static void main(String[] args){
		// call the constructor by creating an object of the class
		new ConstructorExample2("Judas!");
	}
}