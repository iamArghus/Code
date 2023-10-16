import javax.swing.JOptionPane;

public class MaxSumApp {
    public static void main(String[] args) {
        //variables
        int arraysize,max,sum;
        int[] array;

        //objects
        MaxSum ms = new MaxSum();

        //input
        arraysize = Integer.parseInt(JOptionPane.showInputDialog(null, "What size would you like the array to be ? (>=2)", "Array Size",3));
        while(arraysize < 2){ //ansking user for an array size ugual or bigger then 3 then generate random numbers between 1 and 100
            arraysize = Integer.parseInt(JOptionPane.showInputDialog(null, "What size would you like the array to be ? (>=2)", "Array Size",3));
        }
        array = new int[arraysize];
        // for loop to generate a random array with number between 1 and 10
        for ( int i=0 ; i < array.length ; i++ ){
            array[i]=(int) (Math.random() * 10 +1);
        }

        //set and compute
        ms.setArray(array);

        //get
        max=ms.getMax();
        sum=ms.getSum();

        //output
        System.out.println("Size of the array : " + arraysize);
        System.out.print("This is the array : ");
        for ( int i=0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }   
        System.out.print("\nThe max in the array : " + max);
        System.out.print("\nThe sum of the array : " + sum);
    }
}
/*  Create an instantiable class that returns the details of an array of numbers. 
    The class should contain 3 methods:

    -1 method that accepts as a parameter an array of integers. 
        This method should also calculate the sum of the array and the max value in the array
    -1 method that returns the max
    -1 method that returns the sum */