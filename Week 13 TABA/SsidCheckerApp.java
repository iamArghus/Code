/*


penultimate is 6 - Virgin Media Network
last digit  is 4 - MIA1 approach
penultimate is 6 - PW2

*/
/*
•	if the item is “VM-13599-AOU” then the compute method should determine that the item is valid
•	if the item is “VM-12578-EII” then the compute method should determine that the item is valid
•	if the item is “DM-12358-OUI” then the compute method should determine that the item is invalid
•	if the item is “VM-12328-OAI” then the compute method should determine that the item is invalid
•	if the item is “VM-15789-BAI” then the compute method should determine that the item is invalid
 */
import java.util.Scanner; // This imports the scanner class to allow for user input

public class SsidCheckerApp {
	public static void main(String[] args) {
		// Variables
		String item; 			// Stores the item user input
		String validity = ""; 	// Stores the output for va
		String another; 		// Stores the user choice to check for another item or not
		String ppsn; 			// Stores the ppsn input
		String[] passwords; 	// Stores the passwords returing from instantiable class
		int numberOfPasswords; 	// Stores the number of passwords the user wants

		// Objects
		SsidChecker ssid = new SsidChecker(); 	// Creates a new instance of SsidChecker class
		Scanner scan = new Scanner(System.in); 	// Creates a new Scanner object and set keyboard as input method

		// Input
		do { 	// this do/while loop will repeat until conditions are met
			System.out.println("Please type your new SSID in this format : PP-SSSSS-LLL");	// this prompt the user to input SSID in a certain format
			System.out.print("PP    - Service Provider should be VM - Virgin Media\n"			// this next line provides some user guidance for the input
							+ "SSSSS - 5 ascending digits which are allowed to repeat\n"
							+ "LLL   - 3 vowels also allowed to repeat\n"
							+ ">>> ");
			item = scan.nextLine(); 		// This uses scanner to set the variable item

			// Set
			ssid.setItem(item); 			// this line sets item to be sent over to SsidChecker class
			// Compute
			ssid.computeItem(); 			// this calls for the compute method from SsidChecker class
			// Get
			validity = ssid.getValidity();	// this line calls for a get method from SsidChecker class and stores it into a variable

			// Output
			System.out.println(validity);	// Print out if the item is valid or not
			// Next line adds an spacer then asks the user if they would like to enter a new item
			System.out.print("\nEnter 'yes' if you like to check another item\n"	
							+">>> ");
			another = scan.nextLine(); 								// This uses scanner to set the variable another
			if (another.equalsIgnoreCase("yes")) { 	// this checks if the input is equal to "yes" but ignoring capitalization
				continue;	// this allows the loop to repeat
			} else { 		// if anything other then yes is entered
				break; 		// the loop is broken
			}
		} while (true);		// this is the conditions for the do/while loop
		// Password input
		if (validity.equals("The item entered is Valid !")) {			// this is an addition of mine that only allows a user to proceed if the SSID is Valid
			System.out.print("How many passwords would you like to create ?\n"	// asks the user for the numberOfPasswords to be generated
							+">>> ");
			numberOfPasswords = Integer.parseInt(scan.nextLine());				// This scanner sets the variable for the numberOfPasswords
			System.out.print("Please enter your PPSN in this format : DDDDDDDPP\nDDDDDDD - 7 Digits\n" // This asks the user to input their PPSN
							+"PP      - 2 Letters\n"
							+">>> "); 
			ppsn = scan.nextLine(); // This uses scanner to set the variable ppsn

			// Password /Set / Compute / Get
			passwords = ssid.computePassword(numberOfPasswords, ppsn); 		// This sets, computes, gets, and assigns values to the passwords array
			// Password Output
			System.out.println("\nThese are the generated User IDs :"); 	// prints out the message for the user
			for (int i = 0; i < numberOfPasswords; i++) { 					// for loop to print out each password in the array
				System.out.println(passwords[i]);
			}
		} else { // this else statement informs the user they need to enter a valid SSID to proceed to password input
			System.out.println("You need to enter a Valid SSID to proceed !\n");
		}
		scan.close(); // This closes the scanner object
	}
}
