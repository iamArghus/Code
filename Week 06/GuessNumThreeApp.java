import javax.swing.JOptionPane;
public class GuessNumThreeApp {
    public static void main(String[] args) {
        //var /constructor
        int guess=0;
        int goagain=0;
        int randomnum=0;
        String outcome;
        //object
        GuessNumThree guessNum;
        guessNum = new GuessNumThree();
        //input
        while(goagain==0){
            for(int i=1; i<=3; i++){
                guess=Integer.parseInt(JOptionPane.showInputDialog("Attempt "+i,"Guess a number from 1 to 10"));
                while (guess<=0 || guess>=11){
                guess=Integer.parseInt(JOptionPane.showInputDialog("Attempt "+i,"Guess a number from 1 to 10"));
                }
        //set        
        guessNum.setInput(guess);
        //compute
        guessNum.computeGuess();
        //get
        randomnum = guessNum.getRandom();
        outcome   = guessNum.getOutcome();
        //output
        if (guess==randomnum){
            JOptionPane.showMessageDialog(null, outcome + randomnum,"Attempt "+ i,2);
            break;
        }
        else{
            JOptionPane.showMessageDialog(null, outcome + randomnum,"Attempt "+ i,2);
        }
        }
        goagain = JOptionPane.showConfirmDialog(null,"Wanna go Again?","Again", JOptionPane.YES_NO_OPTION,3);
        if (goagain==1){ 
            JOptionPane.showMessageDialog(null,"Bye Bye !");
            break;
        }
        }
    }
}