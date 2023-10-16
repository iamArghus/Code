import javax.swing.JOptionPane;

public class returnMeanSumApp {
    public static void main(String[] args) {
    // user inputs some numbers, store in array
    // compute mean and sum
    // Return the mean and sum of an array of numbers

    //variables
    int howMany;
    double sum,average;
    //objects
    returnMeanSum rms = new returnMeanSum();
    //input
    howMany=Integer.parseInt(JOptionPane.showInputDialog(null, "How many numbers do you want to Sum and know the Mean of?",  "Sum And Mean",3));
    //array
    double[] numbers = new double[howMany];
    for (int i=0 ; i<numbers.length ; i++){
        numbers[i]= Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Number " + (i+1) ,"Sum and Mean",2));
    }
    //set
    rms.setNumbers(numbers);
    //compute
    rms.computeNumbers();
    //get
    sum=rms.getSum();
    average=rms.getAverage();
    //output
    JOptionPane.showMessageDialog(null,String.format("The Sum of your numbers is %.0f",sum) + "\n" + 
                                String.format("The Mean of your numbers is %.1f", average),"Sum and Mean",1);

    }
}
