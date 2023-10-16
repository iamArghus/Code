public class PerYearPerHour {
    //variables
	private double monthly, weekHour, perHour, yearlyDouble;
		
    //set
    public void setMontly(double monthly){
        this.monthly=monthly;
    }
    public void setWeekHour(double weekHour){
        this.weekHour=weekHour;
    }
      
    //compute
    public void computeYearly(){
        yearlyDouble = monthly*12;
    }
    public void computeWeekHour(){
        perHour = monthly/4/weekHour;
    }
    
    //get
    public double getYearly(){
        return yearlyDouble;
    }
    public double getWeekHour(){
        return perHour;
    }
} 
	