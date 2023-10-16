import javax.swing.JOptionPane;

public class LargestNumberApp {
	public static void main(String[] args){

		/*  Create a preset array of numbers.
		Create a piece of code that chooses 
		the largest number from that array. */

		//variables
		int choise,howMany=6,biggie;
		int[] numbers = {4, 8, 15, 16, 23 , 42};
		String preset = " ",array = " ";
		//objects
		LargestNumber bn = new LargestNumber();
		//input
		// here i decided to tell the user the preset numbers
		for(int i=0 ; i<numbers.length ; i++){
			preset=preset+numbers[i] + " ";
		}
		// and here i decided to give the option for the user to enter their own set of numbers even if it's just one
		choise=JOptionPane.showConfirmDialog(null,"These are the preset numbers: " + preset + "\nWould you like to change them?", "Preset numbers",JOptionPane.YES_NO_OPTION, 3);
		if (choise==0){
			do{ howMany=Integer.parseInt(JOptionPane.showInputDialog(null, "How many numbers would you like to input?","New Numbers", 3));
			}
			while(howMany<1);
			numbers = new int[howMany];
			for(int n=0 ; n<numbers.length ; n=n+1){
			numbers[n]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter New Number " + (n+1),"New Numbers", 3));
		}
	}	
	//set
	bn.setArray(numbers);
	//compute
	bn.computeArray();
	//get
	biggie=bn.getBigNumber();
	array=bn.getArray();
	//output
	JOptionPane.showMessageDialog(null,"Current Array is: " + array + "\n" +   "The larger number in this array is: " + biggie + ".","The Largest Number",2);
	}
}