public class LargestNumber {
    //variables
    private int numbers[];
    private int biggest;
    private String array=" ";

	//constructor
    public LargestNumber(){
    }
	//set
    public void setArray(int[] numbers){
        this.numbers = numbers;
    }
    //compute
    public void computeArray(){
        biggest = numbers[0];
        for(int b=0 ; b<numbers.length; b=b+1){
            if(numbers[b]>biggest){
            biggest=numbers[b];
        }
        array+=numbers[b] + " ";
        }
    }
	//get
    public int getBigNumber(){
        return biggest;
    }
    public String getArray(){
        return array;
    }
}
