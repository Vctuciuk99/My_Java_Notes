import java.util.Scanner;
public class $canner {
	public static void main(String []args) {
		//Declare Scanner as "scanner"
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your favoirte animal?");
		//Declare user input as String
		String animal = scanner.nextLine();
		System.out.println("What is your favorite number?");
		/*when declaring user input as integer or double 
		always add "scanner.nextLine() at the end*/
		int num =  scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Your favorite animal is: "+animal);
		System.out.println("Your favorite number is: "+num);
		
	}
}
