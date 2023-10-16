public class GuessNumInst {
    private int outcome;
    private int random;
    private int userguess;

    //set
    public void setInput(int userguess){
        this.userguess=userguess;
    }
    //compute
    public void computeGuess(){
        random=(int) (Math.random() * 10 + 1);
        if (userguess==random){
            outcome=0;
            }  
        else {
            outcome=1;
            }
    }
    //get
    public int getRandom(){
        return random;
    }
    public int getOutcome() {
        return outcome;
    }

}