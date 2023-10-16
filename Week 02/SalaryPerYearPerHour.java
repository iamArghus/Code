import javax.swing.JOptionPane;

public class SalaryPerYearPerHour {
    public static void main(String[] args){
		//variables
		double monthly, weekHour, hour, yearlyDouble;
		
		//inputs
		monthly  = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter your monthly wage"));
		weekHour = Double.parseDouble(JOptionPane.showInputDialog(null,"How many hour you work per week?"));

		//process  
		yearlyDouble = monthly*12;
		hour   = monthly/4/weekHour;
		int yearly = (int) yearlyDouble;
		//output
		JOptionPane.showMessageDialog(null,"Your yearly income is "+ yearly + "€");
		// JOptionPane.showMessageDialog(null,"You earn " + hour + "€ per hour"); //mk1
		JOptionPane.showMessageDialog(null,String.format("You earn %.2f € per hour", hour));
		//extra nonsense
		if(hour>16){
			JOptionPane.showMessageDialog(null,"That's very good! :)");
		}
		else if(hour>12){
			JOptionPane.showMessageDialog(null,"Nice! :)");
		}
		if(hour<9){
			JOptionPane.showMessageDialog(null,"That's Sad! :(");
		} 
	
	} 
}