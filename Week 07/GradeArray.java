public class GradeArray {
    //variables
	private int marks[];
	private int markSum;
	private int average;
	private String grade;

	//constructor
	public GradeArray(){
	}

	//set
	public void setMarks(int[] marks){
		this.marks=marks;
	}

	//compute
	public void computeGrade(){
		//for loop adding grades and compute average
		for (int i=0 ; i < marks.length ; i++){
			markSum += marks[i];
		}
		average= markSum/marks.length;
		
		// grading statements
		if (average>=97 && average<=100){
			grade="A+";
		}
		else if (average>=90 && average<97){
			grade="A";
		}
		else if (average>=80 && average<90){
			grade="B";
		}
		else if (average>=70 && average<80){
			grade="C";
		}
		else if (average>=60 && average<70){
			grade="D";
		}
		else if (average>=50 && average<60){
			grade="E";
		}
		else if (average>=0 && average<50){
			grade="F";
		}
		else {
			// this was for early version without input validation i believe it is obsolete now
			grade="Something went horribly wrong please try again !";
		}
	}
	//get
	public int getAverage(){
		return average;
	}
	public String getGrade(){
		return grade;
	}
}
