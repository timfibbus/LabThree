import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What are you called?");
		String name = scan.nextLine();
		
		System.out.println("Hello, " + name + ".");
		
		System.out.println("Enter a number between 1 and 100: ");
		int x = scan.nextInt();
		
		
		boolean even = false;

		if (x % 2 == 0) {
			even = true;

			if (even && x <= 25 && x >= 2) {
				System.out.println("Even and less than 25.");
			} else if (even && x >= 60 && x <= 100) {
				System.out.println(x + " is even.");
			} else if (even && x>=101 || x<=0) {
				System.out.println("This is an evil number.  Do not ever come here again, " + name + "!");
				System.exit(0);
			}
		}
		
		if (!even && x >= 60 && x <= 100) {
			System.out.println("Odd and over 60.");
		}	else if (!even && x >= 1 && x <= 59) {
				System.out.println("Odd.");
			}	else if (x<=0 || x>=100) {
				System.out.println("CURSE YE DARK SORCERIES AND HEXES! BEGONE!");
				System.exit(0);
			}
		
		System.out.println("Isn't that fascinating, " + name + "?");
		
		scan.close();
		
	}
}
