import javax.swing.JOptionPane;

public class CinemaTicketPriceApp {
    public static void main(String[] args) {
        //var
        int age;
        int numTickets;
        double pricerange1;
        double pricerange2;
        double totprice;
        //object
        CinemaTicketPrice ticket;
        ticket = new CinemaTicketPrice();
        //input
        age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age:"));
        numTickets = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tickets you intend to purchase?"));
        pricerange1=10.0;
        pricerange2=15.0;      
        //set
        ticket.setAge(age);
        ticket.setNumTickets(numTickets);
        ticket.setPrice1(pricerange1);
        ticket.setPrice2(pricerange2);
        //compute
        ticket.computePrice();
        //get
        totprice=ticket.getCost();
        //output
        JOptionPane.showMessageDialog(null, "The total price for your cinema tickets is: € " + totprice);
    }
}
