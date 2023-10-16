import javax.swing.JOptionPane;

public class OneEggBox {
	public static void main(String[] args){
		
		//variables
		int eggs;
		int boxSize;
		int numBoxes;
		int leftOverEggs;

		String bsp=" box";
		String lsp=" egg";
	
		//inputs
		// eggs = Integer.parseInt(JOptionPane.showInputDialog("How many eggs do you have?",null));

		//mk3 egg input
		eggs = Integer.parseInt(JOptionPane.showInputDialog("How many eggs do you have?",null));
		while (eggs <= 3){
			JOptionPane.showMessageDialog(null,"Come back when you have 4 or more eggs!");
			eggs =Integer.parseInt(JOptionPane.showInputDialog("How many eggs do you have?",null));
		}

		//mk3 Box Size input
		// boxSize = Integer.parseInt(JOptionPane.showInputDialog("What size boxes do you intend to buy?",null));  //mk3
		String[] sizeArray = {"4","6","12","18","24","30"};
		int size = JOptionPane.showOptionDialog(null,"What size boxes do you intend to buy?","Box Size Selection",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null, sizeArray, sizeArray);
		boxSize=Integer.parseInt (sizeArray[size]);

		//process

		numBoxes=eggs/boxSize;
		leftOverEggs=eggs%boxSize;

		//mk3 var plural switch
		if (numBoxes ==0 || numBoxes>=2){
			bsp=" boxes";
		}
		if (leftOverEggs ==0 || leftOverEggs>=2){
			lsp=" eggs";
		}

		//output
		// JOptionPane.showMessageDialog(null,"Number of boxes needed "+numBoxes); //MK1
		// JOptionPane.showMessageDialog(null,"Number of eggs left over "+leftOverEggs); //MK1
		// JOptionPane.showMessageDialog(null,"Number of boxes needed "+numBoxes + " eggs left over "+leftOverEggs); //Mk2
		
		if (eggs<boxSize) {
			JOptionPane.showMessageDialog(null,"You need more eggs before you can fill a box of that size !");
		}
		else {
			JOptionPane.showMessageDialog(null, "If You Have " + eggs + " eggs, \nYou will need to buy "+ numBoxes + bsp +", \nand you will have " + leftOverEggs + lsp + " left over.");
		}
}
}