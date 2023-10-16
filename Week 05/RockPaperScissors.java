public class RockPaperScissors {
    //variables
	private int userPick;
    private int compPick;
    private String outcome;
    private String userOutcome;
    private String computerOutcome;
    //constructor
	//set
    public void setUserPick(int userPick){
        this.userPick = userPick;
    }
	//compute
    public void computeOutcome(){        
        compPick=(int) (Math.random() * 3);
        //draw
        if(userPick==compPick){
            outcome="It was a DRAW !";
        }
        //userVSpc
        if(userPick==0){
            if (compPick==1){
                computerOutcome="Paper";
                outcome="You LOST !";
            }
            else if (compPick==2){
                computerOutcome="Scissors";
                outcome="You WON !";
            }
            userOutcome="Rock";
        }
        if(userPick==1){
            if (compPick==0){
                computerOutcome="Rock";
                outcome="You WON !";
            }
            else if (compPick==2){
                computerOutcome="Scissors";
                outcome="You LOST !";
            }
            userOutcome="Paper";
        }
        if(userPick==2){
            if (compPick==0){
                computerOutcome="Rock";
                outcome="You LOST !";
            }
            if (compPick==1){
                computerOutcome="Paper";
                outcome="You WON !";
            }
            userOutcome="Scissors";
        }
    }
    // User	    Computer	Result
    //0 Rock    1 Paper	    Lose
    //0 Rock	2 Scissors	Win
    //1 Paper	0 Rock	    Win
    //1 Paper 	2 Scissors	Lose
    //2 Scissor 0 Rock      Lose
    //2 Scissor 1 Paper     Win
	//get
    public String getOutcome(){
        return outcome;
    }
    public String getUserPick(){
        return userOutcome;
    }
    public String getCompPick(){
        return computerOutcome;
    }
}