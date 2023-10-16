public class PropertySuper{ //super
    //var
    private Object[] propertyNames = {  
        "1:  2000 Great Ocean Highway ",
        "2:  1337 Exceptionalists Way ",
        "3:  4 Hangman Ave ",
        "4:  4 Eclipse Towers, Apt 40 "};
    private String name;
    private String type;
    private int garagesize;

    //methods set name/type based on user input sends it to sub class
    public void setProperty(int input){ 
        if(input==0){
            type="2-Car Garage";
            name="2000 Great Ocean Highway";
            garagesize=2;
        }
        if(input==1){
            type="10-Car Garage";
            name="1337 Exceptionalists Way";
            garagesize=10;
        }
        if(input==2){
            type="Apartment with 6-Car Garage";
            name="4 Hangman Ave";
            garagesize=6;
        }
        if(input==3){
            type="Apartment with 10-Car Garage";
            name="Eclipse Towers, Apt 40";
            garagesize=10;
        }
    }
    //get
    public Object[] propertyNames(){// send names back for buttons
        return propertyNames;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getGaragesize() {
        return garagesize;
    }
}