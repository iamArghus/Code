import javax.swing.JOptionPane;

public class CinemaTicketPriceArrayApp {
   public static void main(String[] args) {
        //variables

        //movie
        int[] movie = new int[1];
        String[] movieOption = {"John Wick: Chapter 4","Guardians of the Galaxy Vol. 3", "Fast X", "Evil Dead Rise"};
        int getMovie;
        //day
        int[] day = new int[1];
        String[] dayOption = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //experience
        int[] exp = new int[1];
        String[] expOption  = {" Standard 2D", "IMAX"};
        //tickets and prices
        int[] numTickets = new int [2]; // 0 under18    // 1 Over18;
        double[] pricerange1  = { 7.50,  9, 9.50, 12};
        /*weekdays  pricerange1[0] Under18 2D    7.50
                    pricerange1[1] Under18 IMAX  9
                    pricerange1[2] Over 18 2D    9.50
                    pricerange1[3] Over 18 IMAX 12      
                    */
        double[] pricerange2 = { 9.50, 11, 12.50, 14};
        /*weekends  pricerange2[0] Under18 2D    9.50
                    pricerange2[1] Under18 IMAX 11
                    pricerange2[2] Over 18 2D   12.50
                    pricerange2[3] Over 18 IMAX 14        
                    */
        double totprice;

        //object
        CinemaTicketPriceArray ticket;
        ticket = new CinemaTicketPriceArray();

        //input
        
        //Movie Selection
		int m = JOptionPane.showOptionDialog(null, "What movie would you like to watch ?",
		"Movie Selection", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, movieOption, 3);
        movie[0]=m;
         
        //Weendays or Weekend
        int d = JOptionPane.showOptionDialog(null, "When would you like to watch the movie?",
		"Day of the Week", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, dayOption, 3);
        day[0]=d;
        
        //Movie Experience Selection
		int x = JOptionPane.showOptionDialog(null, "Which theatre would you like to book?",
		"Movie Experience Selection", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, expOption, 1);
        exp[0]=x;

        //how many tickets
        numTickets[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tickets for Under18 // Students"));
        numTickets[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tickets for Over18?")); 

        //set
        ticket.setMovie(movie);
        ticket.setTime(day);
        ticket.setExperience(exp);
        ticket.setNumTickets(numTickets);
        ticket.setPrice1(pricerange1);
        ticket.setPrice2(pricerange2);
        //compute
        ticket.computePrice();
        //get
        getMovie=ticket.getMovie();
        totprice=ticket.getCost();
        //output
        JOptionPane.showMessageDialog(null, 
                                    "\nMovie___:" + movieOption[getMovie] +
                                    "\nDay_____:" + dayOption[d] +
                                    "\nTheatre__:" + expOption[x] +
                                    "\nUnder__18:" + numTickets[0] +
                                    "\nOver___18:" + numTickets[1] +
                                    String.format("\nThe total for your cinema tickets is : %.2f €", totprice),
                                    "Booking Summary",1);
    }
}