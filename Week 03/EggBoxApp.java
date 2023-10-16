//fix the code by figuring out what should be in the **** sections
import javax.swing.JOptionPane;

public class EggBoxApp {
	public static void main(String[] args){
		//variables
		int eggs;
		int boxSize;
		int numBoxes;
		int leftOverEggs;
		//objects
		EggBox egClass;
		egClass=new EggBox();
		//inputs
		eggs=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number of eggs"));
		boxSize=Integer.parseInt(JOptionPane.showInputDialog(null,"Please set the box size"));
		
		//set
		egClass.setEggs(eggs);
		egClass.setBoxSize(boxSize);
		//compute
		egClass.computeBoxes();
		egClass.computeLeftover();
		//get
		numBoxes=egClass.getBoxes();
		leftOverEggs=egClass.getLeftover();
		//output
		JOptionPane.showMessageDialog(null,"Number of boxes needed "+numBoxes + "\nNumber of eggs left over "+leftOverEggs);
	}
}