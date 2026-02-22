import java.util.Scanner;

public class UserInput{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Please enter your full name: ");
		String fullName = scan.nextLine();
		
		System.out.print("Enter your address: ");
		String address = scan.nextLine();
		System.out.println("");
		System.out.println("");
		
		System.out.print("Enter your age: ");
		int age = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Enter your gender(M/F: ");
		char gender = scan.next().charAt(0);
		
		System.out.print("Are you happy to learn java?(True/false: ");
		boolean isHappy = scan.nextBoolean();
		
	
		System.out.printf("Hello %s , How are you today?%n",fullName);
		System.out.printf("Nice meeting you, you are living in %s%n" ,address);
		System.out.printf("%s, you are %d years old%n",fullName,age);
		System.out.printf("You are a %c%n ",gender);
		System.out.printf("Are you happy to learn java? %b%n ",isHappy);
	}
	
	
	
	
	
	
	
}


