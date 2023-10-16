import java.util.Scanner;

public class Lab9App {
    public static void main(String[] args) {
        //variablesthe 
        String input;
        String output;
        
        //objects
        Lab9 w = new Lab9();
        Scanner i = new Scanner(System.in);    // Scanner
        
        // input = "Every broken clock is right twice a day !"; //test
        System.out.println("Please enter a String of your choosing !");
        input = i.nextLine();
        i.close();

        //set
        w.setInput(input);

        //compute
        w.compute();

        //get
        output=w.getOutput();

        //output
        System.out.println(output);
    }
}
//  I   String from a user // Assume the String can only take letters spaces and full stops

//  P   Counts the letters
//  P   Counts vowels
//  P   Stores a new String that only contains every second letter
//  P   Stores the positions of each space

//  O   Output a new String with all vowels are replaced/printed as exclamation points
//  XT  Output letter count
//  XT  Output vowel count
//  XT  Output space count
//  XT  Output position of each space
//  XT  Output String that only contains every other letter
//  XT  Output String that only contains every second letter