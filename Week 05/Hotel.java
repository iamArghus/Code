public class Hotel {
    //variables
    private int numberOfNights=1;
    private int costPerNight;
    private int clientAge;
    private int totalCost;
    private String clientName;
    private String booking;
	//constructor

	//set
    public void setClientAge(int clientAge) {
        this.clientAge = clientAge;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
    public void setCostPerNight(int costPerNight) {
        this.costPerNight = costPerNight;
    }

	//compute
    public void computeBooking(){
        if(clientAge<18){
            booking="You are not old enough to book a hotel room with us.";
        }
        else if(clientAge >=18){
            totalCost=numberOfNights*costPerNight;
            booking="Hello "+ clientName + ",\n" + 
            "We can confirm your booking for " + numberOfNights + " nights.\n" +
            "The total cost amounts to " + totalCost + " €.";
        }
        else {
            booking="That is not a valid input"; //this was to reject if someone entered text in clientage but it doesnt work
        }

    }
	//get
    public String getBooked(){
        return booking;
    }
}
