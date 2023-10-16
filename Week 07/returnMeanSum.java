public class returnMeanSum {
    //variables
    private double numbers[];
    private double numberSum;
    private double average;
	//constructor

	//set
    public void setNumbers(double[] numbers){
        this.numbers=numbers;
    }
	//compute
    public void computeNumbers(){
        for (int i=0 ; i<numbers.length ; i++){
            numberSum += numbers[i];
        }
        average=numberSum/numbers.length;
    }
	//get
    public double getSum(){
        return numberSum;
    }
    public double getAverage(){
        return average;
    }
}
