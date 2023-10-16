import javax.swing.JOptionPane;
public class BloodApp {
    public static void main(String[] args) {
        //var
        int age,bloodType;
        String donate,input;
        String[] pick = {"AB", "A", "B", "O"};
        
        //object
        Blood b = new Blood();
        //input
        bloodType=-1;
        age=0;
        input = JOptionPane.showInputDialog(null, "Please enter your age:");
       
        while (true) {
            try {
                age = Integer.parseInt(input);
                if (age >= 18) {
                    //bloodType=JOptionPane.showInputDialog(null,"","AB,A,B,O");
                    bloodType = JOptionPane.showOptionDialog(null, "What is your Blood Type?",
                    "Blood Type Selection", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, pick, 1);
                    break;
                }
                else {
                    JOptionPane.showMessageDialog(null, "You must be 18 or older to continue.");
                    input = JOptionPane.showInputDialog(null, "Please enter your age:");
                }                   
            }
            catch (NumberFormatException e) {
                input = JOptionPane.showInputDialog(null, "Please enter your age:");
            }
        }

        // bloodType=0451;
        // input=JOptionPane.showInputDialog(null,"Please Enter your age");
        // while (input.isEmpty()){
        //     input=JOptionPane.showInputDialog(null,"Please Enter your age");
        //     }
        // age=Integer.parseInt(input);
        // if(age >=18){
        // //bloodType=JOptionPane.showInputDialog(null,"","AB,A,B,O");
        // bloodType = JOptionPane.showOptionDialog(null, "What is your Blood Type?",
        // "Blood Type Selection", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, pick,1);
        // }

        //set
        b.setAge(age);
        b.setBloodType(bloodType);
        //compute
        b.computeBlood();
        //get
        donate=b.getDonate();
        //output
        JOptionPane.showMessageDialog(null,donate);
        



    }
    
}
