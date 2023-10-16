import java.awt.Toolkit;
 
public class PropertySubclass extends PropertySuper{ //sub
    //var
    private String[] mech ={
        "I'm on the clock, what you want, some wheels?",
        "What you need Boss, some wheels? I can bring em round!",
        "You need somethin', huh? One of your rides? Let me know!",
        "You callin' for some wheels? I'm Johnny-on-the-spot, I'll hook ya up!",
        "You're through to your garage, you, errr, need me to bring you a ride?" };
    private String[] mech2 ={
        "As promised!",
        "I warmed it up for ya!",
        "She's purrin'!",
        "Here she is!",
        "Scratch was already there, right!?}"};
    private int random = (int) (Math.random() * 5);
    private String mechanic;
    private String name;
    private String type;
    private String[] garage;
    private String[] parkcar;
    //constructor
    public PropertySubclass(int input){
        super.setProperty(input);
        name=super.getName();
        type=super.getType();
        super.getGaragesize();
        int garagesize = super.getGaragesize();
        garage = new String[garagesize];
    }
    //compute
    public void owner(){
        System.out.println("Text From Dinasty8  : Congratulations you are the new owner of this " + type + " located at " + name);
    }
    public void parkCar(String[] parkcar){
        for( int g=0 ; g<garage.length ; g++ ){
            if( g < parkcar.length ){
                garage[g]= (g+1) + "  " + parkcar[g];
            }
            else {
                garage[g]= (g+1) + "  " + "Empty Slot";
            }
        }
    }
    public void wasted(){
        System.out.println("*You walk until your legs start to give out*\n*you drop to the ground & lose conciousness*");
        Toolkit.getDefaultToolkit().beep();
    }
    public void mechanic(){ 
        System.out.println("** Phone Ringing **");
        Toolkit.getDefaultToolkit().beep();
        mechanic=mech[random];
        System.out.println("Merchanic : " + mechanic);
        System.out.println("");
        // for( int g=0 ; g<garage.length ; g++ ){
            //     System.out.println(garage[g]);
            // }
    }
    public void delivery(){
        mechanic=mech2[random];
        System.out.println("Merchanic : " + mechanic);
        System.out.println("");
    }
    //get
    public String[] getParkcar(){
        return parkcar;
    }
    public String[] getGarage() {
        return garage;
    }
}