
public class OddEven {
    //var
    private int uinput,outcome;
    //set
    public void setInput(int uinput){
        this.uinput = uinput;
    }
    //compute
    public void computeOutcome(){
        if (uinput % 2 == 0){
            outcome=0;
        }
        else {outcome=1;
        }
    }  
    //output
    public int getOutcome(){
        return outcome;
    }

        
}