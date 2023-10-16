public class GuessNumThree {
    private String outcome;
    private int random;
    private int userguess;
    //contructor
    public GuessNumThree(){
    }
    //set
    public void setInput(int userguess){
        this.userguess=userguess;
    }
    //compute
    public void computeGuess(){
        // random=5;     //for testing
        random=(int) (Math.random() * 10 + 1);
        // System.out.println(random);

        if (userguess==random){
            outcome="Winner! You guessed right! it was ";
            }  
        else {
            outcome="Nope! You guessed wrong! it was ";
            }
    }
    //get
    public int getRandom(){
        return random;
    }
    public String getOutcome() {
        return outcome;
    }
}