import javax.swing.JOptionPane;

public class GTApp {
    public static void main(String[] args){
        //var
        Object[] choise = {1,2,3,4};
        String[] parkcar= new String[1];
        String car="Dominator GTT";
        //method
        PropertySubclass own = new PropertySubclass(7); // 7 is a placeholder its so i can get propertynames
        //input to select property
        int input = JOptionPane.showOptionDialog(null, own.propertyNames(), "Select a property to buy", 2, 3, null, choise, choise);
        own = new PropertySubclass(input); // this is to set input
        //output
        own.owner();
        //park a car
        JOptionPane.showMessageDialog(null, "You park the car you are driving :\n" + car, "You drive to your new property", 3);
        parkcar[0]=car;
        own.parkCar(parkcar);
        //later on..
        Object[] option = {"Call mechanic","Start Walking"};
        int x = JOptionPane.showOptionDialog(null, "You are stranded, and on foot..", "Later on..",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option);
        if (x == 1){
            own.wasted();
            JOptionPane.showMessageDialog(null,"WASTED", "Bad News", 0);
        }
        else{
            own.mechanic();
            String[] parkedCars = own.getGarage();
            int valet = JOptionPane.showOptionDialog(null, "Which car would you like?" , "Valet Service", 2, 3, null, parkedCars, parkedCars);
            // Loop to prevent selection of a empty slot
            while (parkedCars[valet].contains("Empty Slot")){
                valet = JOptionPane.showOptionDialog(null, "Which car would you like?" , "Valet Service", 2, 3, null, parkedCars, parkedCars);
            }
            //here i overwrite car with the valet car even if its the same it might change in the future with another loop
            car = parkedCars[valet].substring(3);
            System.out.println( "** The Mechanic pulls up with your " + car + " **");
            own.delivery();
        }
    }       
}