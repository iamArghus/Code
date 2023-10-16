import javax.swing.JOptionPane;

public class EmailApp {
    public static void main(String[] args) {
        //var
        String email, output;
        // String[] extensions = { "com" , "edu" , "org" };
        String[] extensions = new String[3];  // as lab 12 requested but i made a preset for testing

        //object
        Email em = new Email();

        //input
        do { 
            //email = "username@domain.com";
            email = JOptionPane.showInputDialog(null,"Please type in an email address to validate." ,null);
        } while ( email == null || email.length()<=6 || email.contains(" ") );

        //input extensions
        for ( int i=0 ; i<3 ; i++){
            do{
                extensions[i]= JOptionPane.showInputDialog(null, "Extension " + (i+1) , "Please enter a 3 character extension, number " + (i+1) , 3);
            } while( extensions[i].length()!=3 );
        }
        //set, compute, get
        output=em.computeEmail(email, extensions);
        //output
        int messagetype = 0;
        if (output.contains("The Email is VALID")){// this is here to change the icon for the Jpane if email is invalid to a red X
            messagetype = 1; 
        }
        JOptionPane.showMessageDialog(null, output, "Result", messagetype);

/*  Create an application that takes in 2 pieces of information from a user; 
x    - a single email address
x    - an array of 3 character domain extensions (eg com, edu, org). 

    These should be taken in as parameters into a single method. 
    This application only needs 2 methods; 
    1 that sets and computes and 1 that returns information.

    The method should then do the following to validate the email address:
x   -Check that there is an @ symbol in the email address
x   -Check that there is a . before the 3 character extension.
x   -Ensure that the domain extension is one of the 3 character Strings from the array
x   The method should return a String that states whether or not the email address is valid, and why.   */
    }
}