import javax.swing.JOptionPane;
public class HotelApp {
    public static void main(String[] args){
    //variables
    String inputAge,clientName,booking;
    int clientAge,roomCost,numNights;

    //objects
    Hotel h = new Hotel();
    //input
    clientName="Customer";
    inputAge=JOptionPane.showInputDialog(null,"Please enter your age");
        while (inputAge.isEmpty()){
            inputAge=JOptionPane.showInputDialog(null,"Please enter your age");
        }
    clientAge=Integer.parseInt(inputAge);
    numNights=0;
        if(clientAge >=18){
            clientName=JOptionPane.showInputDialog(null,"Please enter your Name");
            while (clientName.isEmpty()){
                clientName=JOptionPane.showInputDialog(null,"Please enter your Name");
            }
            numNights=Integer.parseInt(JOptionPane.showInputDialog(null,"How many night would you like to book?"));
            while (numNights<=0){
                numNights=Integer.parseInt(JOptionPane.showInputDialog(null,"Can't book less than 1 night. Come on son!\nHow many night would you like to book?"));
            }
        }
    roomCost=90;
    //set
    h.setClientAge(clientAge);
    h.setClientName(clientName);
    h.setNumberOfNights(numNights);
    h.setCostPerNight(roomCost);
    //compute
    h.computeBooking();
    //get
    booking=h.getBooked();
    //output
    JOptionPane.showMessageDialog(null,booking);
    }
}
