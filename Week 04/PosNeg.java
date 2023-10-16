import javax.swing.JOptionPane;
public class PosNeg {
    public static void main(String[] args) {
        while (true){
        int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number to test","Positive or Negative", 3));
        //System.out.print(input);

        if (input == 0){
            JOptionPane.showMessageDialog(null,"0 is Neither", "Positive or Negative", 0);
        }
        else if (input >0){
            JOptionPane.showMessageDialog(null,"That was a positive", "Positive or Negative", 2);
        }
        else if (input <0){
            JOptionPane.showMessageDialog(null,"That was a negative", "Positive or Negative", 2);
        }
        
    }
    }
    
}
