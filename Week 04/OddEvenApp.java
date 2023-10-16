import javax.swing.JOptionPane;
public class OddEvenApp {
    public static void main(String[] args) {
        while (true){
            //object
            OddEven oddeven;
            oddeven = new OddEven();
            //var /input
            int outcome;
            int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number to test","ODD or EVEN", 3));
            //set
            oddeven.setInput(input);
            //compute
            oddeven.computeOutcome();
            //get
            outcome=oddeven.getOutcome();
            //output
            if (outcome % 2 == 0){
                JOptionPane.showMessageDialog(null,"That number is EVEN","ODD or EVEN", 2);
            }
            else {
                JOptionPane.showMessageDialog(null,"That number is ODD","ODD or EVEN", 1);
            }
        }
    
    }
}
