    public class CinemaTicketPriceArray {
    //var
    private int[] movie;
    private int getMovie;
    private int[] day;
    private int[] exp;
    private int[] numTickets;
    private double[] price1;
    private double[] price2;
    private double getCost;

    //set
    public void setMovie(int[] movie) {
        this.movie = movie;
    }
    public void setTime(int[] day) {
        this.day = day;
    }
    public void setExperience(int[] exp) {
        this.exp = exp;
    }
    public void setNumTickets (int[] numTickets) {
        this.numTickets = numTickets;
    }
    public void setPrice1(double[] price1) {
        this.price1 = price1;
    }
    public void setPrice2(double[] price2) {
        this.price2 = price2;
    }
    //compute
    public void computePrice(){
        // Movie Selection
        if (movie[0]==0){
            getMovie=0;
        }
        else if (movie[0]==1){
            getMovie=1;
        }
        else if (movie[0]==2){
            getMovie=2;
        }
        else if (movie[0]==3){
            getMovie=3;
        }
        // weekdays under18 // over18 // 2D
        if ( day[0]>=0 && day[0]<=4 && exp[0]==0 ){  
            getCost = ( numTickets[0] * price1[0] ) + ( numTickets[1] * price1[2] );
        }
        // weekends under18 // over18 // 2D
        else if ( day[0]>=5 && day[0]<=6 && exp[0]==0 ){
            getCost = ( numTickets[0] * price2[0] ) + ( numTickets[1] * price2[2] );
        }
        // weekdays under18 // over18 // IMAX
        else if ( day[0]>=0 && day[0]<=4 && exp[0]==1 ){  
            getCost = ( numTickets[0] * price1[1] ) + ( numTickets[1] * price1[3] );
        }
        // weekends under18 // over18 // IMAX
        else if ( day[0]>=5 && day[0]<=6 && exp[0]==1 ){
            getCost = ( numTickets[0] * price2[1] ) + ( numTickets[1] * price2[3] );
        }
    }
    //get
    public int getMovie(){
        return getMovie;
    }
    public double getCost(){
        return getCost;
    }
}