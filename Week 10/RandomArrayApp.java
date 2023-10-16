import javax.swing.JOptionPane;

public class RandomArrayApp {
    public static void main(String[] args) {
        //variables
        int[] parameters = new int[3];
        int[] array = new int[parameters[0]];
        String output="";
        
        //objects
        RandomArray ra = new RandomArray();
        
        //input array // array 0 arraysize ; array 1 start ; array 2 finish ; only accepts positive numbers
        parameters[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "What size would you like the array to be?", "Array Size", 3));
        while(parameters[0]<1){
        parameters[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "What size would you like the array to be?", "Array Size", 3));
        }
        parameters[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Where should the random range start?", "Random Range", 3));
        while(parameters[1]<1){
        parameters[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Where should the random range start?", "Random Range", 3));
        }
        parameters[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Where should the random range finish?", "Random Range", 3));
        while(parameters[2]<1 || parameters[2]==parameters[1]){
        parameters[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Where should the random range finish?", "Random Range", 3));
        }
        
        //set
        ra.setParameters(parameters);

        //compute
        ra.compute();

        //get
        array=ra.getArray();

        //output array conversion to string
        for(int i=0 ; i<parameters[0]; i++ ){
            output += array[i] + " " ; 
        }
        JOptionPane.showMessageDialog(null, "The Array Size you selected : " +  parameters[0] + "\n" +
                                            "The range start and finish  : " + parameters[1] + " and " + parameters[2] + "\n" +
                                            
                                            output, "Output" ,1);
    }
}
/*  Create an instantiable class that generates and returns
    an array of random numbers based on 3 parameters

    -How large the array should be
    -Where the random number range should start
    -Where the random number range should end */