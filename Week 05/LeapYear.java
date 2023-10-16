public class LeapYear {
    //variables
    private int year;
    private String outcome;
    //constructor
    public LeapYear(){
		year=0;
	}
	//set
    public void setYear(int year){
        this.year = year;
    }
	//compute
    public void computeYear(){
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    outcome=" is a leap year.";
                } else {
                    outcome=" is not leap year.";
                }
            } else {
                outcome=" is a leap year.";
            }
        } 
        else {
            outcome=" is not leap year.";
        }
    }
        
    /*  
    •	The year must be evenly divisible by 4;
    •	If the year can also be evenly divided by 100, it is not a leap year;
    o	unless...
    o	The year is also evenly divisible by 400. Then it is a leap year.
    •	According to these rules, the years 2000 and 2400 are leap years,
        while 1800, 1900, 2100, 2200, 2300, and 2500 are not leap years.
    */

	//get
    public String getOutcome(){
        return outcome;
    }
}
