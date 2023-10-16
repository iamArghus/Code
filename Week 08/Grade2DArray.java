public class Grade2DArray {
    //variables
	private int marks[][];
	private int eachYearSum=0;
	private int eachYearAverage;
	private int allYearSum=0;
	private int allYearAverage;
	private String summary="";

	//constructor
	public Grade2DArray(){
	}

	//set
	public void setMarks(int[][] marks){
		this.marks=marks;
	}
	
	//compute
	public void computeGrade(){
		for ( int i=0 ; i < marks.length ; i++){ // loop to compute averages
			for( int j=0 ; j < marks[0].length; j++ ){// loop to sum each year
				eachYearSum += marks[i][j];
			}
			eachYearAverage = eachYearSum / marks[0].length;//get an average out with each year/loop
			summary += "Year " + (i+1) + " average " + eachYearAverage + " %\n"; 
			allYearSum += eachYearSum;     					// adding up each year for the total
			eachYearSum=0;									//resetting before next year
		}
		allYearAverage = allYearSum / 20; 					// compute total average
		summary += "The total average is " + allYearAverage+ " %\n";   
		// System.out.print(summary);
	}
	
	//get
	public String getSummary(){
		return summary;
	}
}
