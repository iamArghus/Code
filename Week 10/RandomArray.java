
public class RandomArray {
    //variables
    private int[] parameters;
    private int[] array;

	//constructor
    public RandomArray(){
    }

	//set
    public void setParameters(int[] parameters){
        this.parameters=parameters;
    }

	//compute
    public void compute(){
        array = new int[parameters[0]];     //this sets the output array size
        if (parameters[1] < parameters[2]){     // this will run if P1 < P2
            for( int i=0 ; i < parameters[0] ; i++ ){
                //loop to avoid a number below smaller number
                while( array[i] < parameters[1] ){  
                    array[i]=(int) (Math.random() *  parameters[2] +1 );
                }
            }
        }
        else if (parameters[1] > parameters[2]){// this will run if P1 > P2
            for( int i=0 ; i < parameters[0] ; i++ ){
                //loop to avoid a number below smaller number
                while( array[i] < parameters[2] ){
                    array[i]=(int) (Math.random() *  parameters[1] +1);
                }
            }    
        }
    }
    
	//get
    public int[] getArray(){
        return array;
    }
}