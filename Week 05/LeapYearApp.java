import javax.swing.JOptionPane;
public class LeapYearApp {
    public static void main(String[] args){
        //variables
        String input,outcome;
        int year,goagain;
        //objects
        LeapYear LY = new LeapYear();
        //input
        input=null;
        year=0;
        while (true) {
        try{
            input=JOptionPane.showInputDialog(null,"Enter a year to test for leap year");
            year = Integer.parseInt(input);
            if (year <= 0) {
                continue;
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a positive Number !" ,"Wrong Input" ,1);
            continue;
        }    
        //set
        LY.setYear(year);
        //compute
        LY.computeYear();
        //get
        outcome=LY.getOutcome();
        //output
        goagain=JOptionPane.showConfirmDialog(null,"Year "+year+outcome,"Wanna Go Again ?",JOptionPane.YES_NO_OPTION,3);
        System.out.println(year + goagain);

        if (goagain==1){
            break;
        }
        }

}
}
