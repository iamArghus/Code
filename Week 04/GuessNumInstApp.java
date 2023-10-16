import javax.swing.JOptionPane;
public class GuessNumInstApp {
    public static void main(String[] args) {
        //var /constructor
        int guess,outcome,goagain,randomnum;
        String input;
    
        //object
        GuessNumInst guessnum;
        guessnum = new GuessNumInst();
        //input
        while(true) {
            input=JOptionPane.showInputDialog("Enter a guess number from 1 to 10" ,0);
                while (input.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Enter a number !");
                    input=JOptionPane.showInputDialog("Enter a guess number from 1 to 10",0);
        }
        guess=Integer.parseInt(input);
        while (guess<=0 || guess>=11) {
            JOptionPane.showMessageDialog(null,"Please enter a number from 1 to 10");
            guess=Integer.parseInt(JOptionPane.showInputDialog("Enter a guess number from 1 to 10",0));
        }
        
        //set
        guessnum.setInput(guess);
        //compute
        guessnum.computeGuess();
        //get
        randomnum = guessnum.getRandom();
        outcome = guessnum.getOutcome();
        //output
        if (outcome==0){
            goagain = JOptionPane.showConfirmDialog(null,"Winner! You guessed right! it was "+ randomnum + ", Wanna go Again?","Result", 
            JOptionPane.YES_NO_OPTION, 2);
            }  
            else {
            goagain = JOptionPane.showConfirmDialog(null, "Nope! You guessed wrong! it was " + randomnum + ", Wanna go Again?","Result",
            JOptionPane.YES_NO_OPTION, 0);
            }
            if (goagain==1){
            break;
        }
        } 
    }
}
