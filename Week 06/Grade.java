public class Grade {
    //variables
	private int numOfSubjects;
	private int markSum;
	private int average;
	private String grade; 
	//constructor
	public Grade(){
		numOfSubjects=0;
		markSum=0;
	}
	//set
	public void setNumOfSubjects(int numOfSubjects){
		this.numOfSubjects=numOfSubjects;
	}
	public void setMarks(int markSum){
		this.markSum=markSum;
	}
	//compute
	public void computeGrade(){
		average=markSum/numOfSubjects;
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
