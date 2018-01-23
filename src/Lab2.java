import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userNum;
		char userAnswer = 'Y';
		String userName;

		System.out.println("What's your name?");
		userName = scan.nextLine();

		while ((userAnswer == 'Y') || (userAnswer == 'y')) {
			// user inputs number
			System.out.println("Hey " + userName + ", please enter a number between 1 and 100: ");
			userNum = scan.nextInt();

			// validates that user enters a number between 1 and 100
			while ((userNum < 1) || (userNum > 100)) {
				System.out
						.println("Invalid entry. Come on, " + userName + ". Please enter a number between 1 and 100: ");
				userNum = scan.nextInt();
			}

			if ((userNum & 1) == 0) { // checks if userNum is even
				// if statement for even numbers between 2 and 24
				if ((userNum >= 2) && (userNum < 25)) {
					System.out.println("Way to go, " + userName + ". The number you entered is even and less than 25.");
				}
				// if statement for even numbers between 26 and 60
				else if ((userNum >= 26) && (userNum <= 60)) {
					System.out.println("Way to go, " + userName + ". The number you entered is even");
				}
				// else statement for even numbers over 60
				else {
					System.out.println("Way to go, " + userName + ". The number you entered is even and over 60");
				}
			}

			else {
				// if & else statements for odd numbers over 60
				if ((userNum >= 1) && (userNum <= 59)) {
					System.out.println("Way to go, " + userName + ". The number you entered is odd");
				} else {
					System.out.println("Way to go, " + userName + ". The number you entered is odd and over 60");
				}
			}

			System.out.println("Would you like to enter another number? Y/N");
			userAnswer = scan.next().charAt(0);
		}

		System.out.println("Goodbye, " + userName + ".");
	}

}
