import javax.swing.JOptionPane;

public class PerYearPerHourApp {
	public static void main(String[] args){
		//variables
        double monthly, weekHour, perHour, yearlyDouble;
	
		//object
		PerYearPerHour pYpH;
		pYpH=new PerYearPerHour();
		//inputs
		monthly=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter your monthly wage"));
		weekHour=Double.parseDouble(JOptionPane.showInputDialog(null,"How many hour you work per week?"));
		//set
		pYpH.setMontly(monthly);
		pYpH.setWeekHour(weekHour);
		//compute
		pYpH.computeYearly();
		pYpH.computeWeekHour();
		//get
		yearlyDouble=pYpH.getYearly();
		perHour=pYpH.getWeekHour();
		//output
		JOptionPane.showMessageDialog(null,String.format("This is your yearly wages %.0f ", yearlyDouble));
		JOptionPane.showMessageDialog(null,String.format("This is your hourly wages %.2f", perHour));
	}
}