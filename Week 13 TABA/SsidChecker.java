/*


penultimate is 6 - Virgin Media Network
last digit  is 4 - MIA1 approach
penultimate is 6 - PW2

*/

public class SsidChecker {
    // Variables
    private String item;        // Stores the item user input
    private String sequence;    // Stores a substring that splits the numbers segment
    private String letters;     // Stores a substring that splits the vowels segment
    private String validity;    // Stores the output String
    private int numberCheck;    // Stores a number for comparison of ascending criteria
    private boolean provider;   // Stores a boolean for Validation of provider tag
    private boolean dash;       // Stores a boolean for Validation of dash presence and position
    private boolean ascending;  // Stores a boolean for Validation of ascending numbers
    private boolean vowels;     // Stores a boolean for Validation of vowels
    private int vowelscount;    // Stores a count of the vowels
    private int[] numbersArray; // Stores an array of random integers
    private String[] passwords; // Stores an array of string for output passwords
    private int passwordlength; // Stores an integer for lenght of password to create
    // Stores an Array of alphabet letters for random selection
    private String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", 
    "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

    // Constructor
    public SsidChecker() { // this sets base values for variables
        validity = "";
        item = "";
        letters = "";
        provider = false;
        dash = false;
        ascending = false;
        vowels = false;
        passwordlength = 7;
        vowelscount = 0;
    }

    // Set
    public void setItem(String item) { // this sets the user input into the variable item
        this.item = item;
    }

    // Compute
    public void computeItem() {
        item = item.toUpperCase();  // This changes the user input to uppercase
        // This will check if the first two letter match the service provider VM
        if (item.substring(0, 2).equals("VM")) { 
            provider = true;        // this sets the variable provider to true if it matches VM
        } else {
            provider = false;       // this sets the variable provider to false if it does NOT
        }
        // This will check if the characters are dashes and if they are in the correct place
        if (item.charAt(2) == '-' && item.charAt(8) == '-') { 
            dash = true;    // sets the variable dash to true if the dashes are in the right place
        } else {
            dash = false;   // sets the variable dash to False if they are not dashes or not in the right place
        }

        sequence = item.substring(3, 8); // this separates the Number sequence into a substring
        numberCheck = 0; // This resets the comparator number to 0 if user wants to input a new item
        for (int i = 0; i < sequence.length(); i++) {   // for loop to check each character from substring to determine if they are ascending
            if (sequence.charAt(i) >= numberCheck) {    // this checks if each number is bigger or equal to the previous number
                numberCheck = sequence.charAt(i);       // this updates the number value if integer is bigger or equal
                ascending = true;   // if number is bigger ascending boolean is set and kept updated to "true"
            } else {                // in case the new number is NOT bigger or equal
                ascending = false;  // the booblean ascending is set to "false"
                break;              // and the loop is broken
            }
        }

        letters = item.substring(9);         // this separates the 3 letter sequence into a substring
        for (int i = 0; i < letters.length(); i++) {    // for loop to check if each letter is a vowel
            char c = letters.charAt(i);                 // this sets each letter into a character variable named c to be compared
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') { // this if statement checks if the variable c is a vowel
                vowels = true;      // if it is a vowel then the boolean is set to "true"
                vowelscount++;
            } else {                // if NOT a vowel this else statement will
                vowels = false;     // set the boolean to "false"
                break;              // then break the loop
            }
        }

        if (provider == true && dash == true && ascending == true && vowels == true && vowelscount==3) { // if all booleans are true
            validity = "The item entered is Valid !";     // this will print if all criteria is met
        } else { // if any boolean is false
            validity = "The item entered is NOT Valid !"; // this will print if any criteria is NOT met
        }
    }

    // Password /Set / Compute / Get
    public String[] computePassword(int numberOfPasswords, String ppsn) { // this method sets computes gets for password
        ppsn = ppsn.toLowerCase();                  // converts PPSN to lowercase
        passwords = new String[numberOfPasswords];  // this sets the size of the array passwords
        numbersArray = new int[numberOfPasswords];  // this sets the size of the array 
        int ppsndigits = Integer.parseInt(ppsn.substring(0, 7));

        for (int i = 0; i < numberOfPasswords; i++) {         // for loop that repeat for each numberOfPassword
            numbersArray[i] = (int) (Math.random() * 9 + 21); // for loop to generate random numbers for the array between 21 and 29 inclusive
            passwords[i] = "";                                // This initializes the password to avoid 'null'
            for (int j = 0; j < passwordlength; j++) {                      // for loop to create generate password/user IDs
                if (j < 4) {
                    passwords[i] += alphabet[(int) (Math.random() * 26)];   // this fills the first 4 characthers with random letters from alphabet array
                }
                if (j == 4) {
                    passwords[i] += "@"; // this adds a '@' after the 4 letters
                }
                if (j == 5) {
                    passwords[i] += ppsndigits % numbersArray[i]; // This calculates a reminder from psndigits and random array number 
                }
                if (j == 6) { 
                    // This adds two letters randombly selected from the letter portion of the PPSN that's how i understood it
                    // since the demo password outputted had different letters at the end which didnt really match 2 letters
                    passwords[i] += ppsn.charAt((int) (Math.random() * 2 + 7));
                    passwords[i] += ppsn.charAt((int) (Math.random() * 2 + 7));
                }
            }
        }
        return passwords;           // this returns the password array to the get method
    }
    // Get
    public String getValidity() {   // this method returns a string to tell if the item is valid or not
        return validity;
    }
}
