public class MaxSum {
    //variables
    private int[] array;
    private int max,sum;

	//constructor
    public MaxSum(){
        max=0;
    }

	//set and compute
    public void setArray(int[]array){
        this.array=array;
        // for loop to compute the max and sum of the array
        for ( int i=0 ; i < array.length ; i++ ){
            sum += array[i];
            if( array[i] > max ){
                max=array[i];
    
            }
        }
    }

	//get
    public int[] getArray(){
        return array;
    }
    public int getMax(){
        return max;
    }
    public int getSum(){
        return sum;
    }
}
