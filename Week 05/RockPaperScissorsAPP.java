import javax.swing.JOptionPane;
public class RockPaperScissorsAPP {
    public static void main(String[] args){
        //variables
        int userpick,goagain;
        String useroutcome,compoutcome,outcome;
        //objects
        RockPaperScissors rps = new RockPaperScissors();
        //input
        while (true){
        String[] pick = {"Rock", "Paper", "Scissors"};
        userpick = JOptionPane.showOptionDialog(null, "Please pick one of the following!",
        "Pick", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, pick,1);
        //set
        rps.setUserPick(userpick);
        //compute
        rps.computeOutcome();
        //get
        outcome=rps.getOutcome();
        useroutcome=rps.getUserPick();
        compoutcome=rps.getCompPick();
        //output
        goagain=JOptionPane.showConfirmDialog(null,"You Chose "+useroutcome+", Computer Chose "+compoutcome+".\n"+outcome,"Wanna Go Again ?",JOptionPane.YES_NO_OPTION);
        if (goagain==1){
            break;
        }
        }
}
}

