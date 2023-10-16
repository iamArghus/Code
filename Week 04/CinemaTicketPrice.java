public class CinemaTicketPrice {
    //var
    private int age;
    private int numTickets;
    private double price1;
    private double price2;
    private double cost;
    //set
    public void setAge (int age) {
        this.age = age;
    } 
    public void setNumTickets (int numTickets) {
        this.numTickets = numTickets;
    }
    public void setPrice1 (double price1){
        this.price1 = price1;
    }
    public void setPrice2 (double price2){
        this.price2 = price2;
    }
    //compute
    public void computePrice(){
        if (age < 18) {
            cost=numTickets * price1;
        } 
        else {
            cost=numTickets * price2;
        }
    }
    //get
    public double getCost() {
        return cost;
    }
}
