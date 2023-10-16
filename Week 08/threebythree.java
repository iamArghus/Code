public class threebythree {
    //variables
    private int[][] array;
	private int eachRowSum;
	private int eachColSum;
	private int totalSum;
	private String row;
	private String col;
	private String tot;

	//constructor
	public threebythree(){
		row = "";
		col = "";
		tot = "";
	}

	//set
	public void setArray(int[][] array){
		this.array=array;
	}
	
	//compute
	public void compute(){     //calculate the sum of each row / column then reset
		for( int i=0 ; i < array.length ; i++ ){
			for( int j=0 ; j < array[0].length ; j++ ){
				eachRowSum += array[i][j];
				eachColSum += array[j][i];
			}
			row += "Row " + (i+1) + "    sum " + eachRowSum + "\n";
			col += "Column " +  (i+1) + " sum " + eachColSum + "\n";
			totalSum += eachRowSum;
			eachRowSum=0;
			eachColSum=0;			
		}
		tot += "Total of every number is " + totalSum;
	}
	
	//get
	public String getRow(){
		return row;
	}
	public String getCol(){
		return col;
	}
	public String getTot(){
		return tot;
	}
}