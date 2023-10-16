import javax.swing.JOptionPane;

public class OddEvenArrayApp {
    public static void main(String[] args) {
        //variables
        int arraysize;
        int oddoreven;
        String output;
        int[] array;
        int[] subarray;
        
        //objects
        OddEvenArray oe = new OddEvenArray();
        
        //input //asking user for an array size equal or bigger then 2
        arraysize = Integer.parseInt(JOptionPane.showInputDialog(null, "What size would you like the array to be ? (>=2)", "Array Size",3));
        while(arraysize < 2){ 
            arraysize = Integer.parseInt(JOptionPane.showInputDialog(null, "What size would you like the array to be ? (>=2)", "Array Size",3));
        }                                                          
        array = new int[arraysize];
        subarray = new int[arraysize]; //this sets array size just to initialise subarray

        // Generated a random array with number range between 1 and 100
        for ( int i=0 ; i < array.length ; i++ ){ 
            array[i]=(int) (Math.random() * 100 +1);
        }
        //ODD or EVEN Choice
        String[] choise = { "EVEN","ODD" };
        oddoreven = JOptionPane.showOptionDialog(null, "Which one would you like me to return ?", "ODD or EVEN", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null, choise,choise[0]);
      
        //set compute get
        subarray=oe.setArray(array, oddoreven);

        //get string
        output=oe.getEven();

        //output
        System.out.println("The Random Number Array is : ");
        for ( int i=0 ; i < array.length ; i++){
            System.out.print( array[i] + " ");
        }
        System.out.println("\n" +  output );
        for ( int i=0 ; i < subarray.length ; i++){
            System.out.print(subarray[i] + " ");
        }        
    }
}
/* 
Create an instantiable class that sorts a given array 
into a subset array of either even or odd numbers. 
The class should have 1 method that accepts 2 parameters:

-An array of numbers
-An integer representing whether the subset array to be returned 
 will contain odd or even numbers (0= even, 1=odd) 
 
The same method should then sort the given array into a smaller array containing 
either all odd or all even numbers. This array should then be returned. */