import java.util.Scanner;
public class StringConvert{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		// get input from the user
		String message = input.nextLine();
		char[] n = new char[message.length()];
		// Scan through the string and get the characters
		for(int i = 0 ; i < message.length() ; i++){
			// first character should be converted to uppercase
			if(i == 0){
				n[i] = Character.toUpperCase(message.charAt(i));
			// if character is   a space then the next character should be converted to uppercase
			}else if(message.charAt(i) == ' '){
				n[i] = ' ';
				n[i+1] = Character.toUpperCase(message.charAt(i+1));
				i++;
				// any other character should be added to the array as it is
			}else{
				n[i] = message.charAt(i);
			}
		}
		// resused the string variable and assigned it an empty string
		message = "";
		// concat the content of the array back to the String
		for(int i = 0; i<n.length ; i++)
			message += n[i];
		// print out the String
		System.out.println(message);
	}
}