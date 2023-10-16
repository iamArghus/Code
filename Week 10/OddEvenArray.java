public class OddEvenArray {
    //variables
    private int[] subarray;
    private int evencount;  //  0/EVEN 
    private int oddcount;   //  1/ODD
    private int subcount;
    private String output;

	//constructor
    public OddEvenArray(){
        evencount=0;
        oddcount=0;
        subcount=0;
    }
    
	//set compute get
    public int[] setArray(int[] array, int oddoreven){
      
        // this counts odd or even to set subarray size
        for ( int i=0 ; i < array.length ; i++ ){ 
            if ( oddoreven == 0 && array[i] % 2 ==0 ){
                evencount++;
            }
            if ( oddoreven == 1 && array[i] % 2 !=0 ){
                oddcount++;
            }
        }

        //here i set subarray size
        if (oddoreven == 0){
            subarray = new int[evencount];
        }
        else{
            subarray = new int[oddcount];
        }
    
        //This will fill the each array and set output message
        for ( int i=0 ; i < array.length ; i++ ){
            if ( oddoreven == 0 && array[i] % 2 ==0 ){
                subarray[subcount++]=array[i];
                output="These are the EVEN numbers : ";
            }
            else if ( oddoreven == 1 && array[i] % 2 !=0 ){
                subarray[subcount++]=array[i];
                output="These are the ODD numbers : ";
            }
        }

        // this will output a message if all numbers were of the opposite type
        if  ( oddoreven == 0 && subarray.length == 0 ){
            output="There was NO EVEN numbers !";
        }
        if ( oddoreven == 1 && subarray.length == 0 ){
            output="There was NO ODD numbers !";
        }

        return subarray;
        }
        public String getEven(){
            return output;
    }
}



