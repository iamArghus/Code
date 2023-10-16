public class Blood {
    //var
    private int age;
    private int blood;
    private String canDonate;
    //constructor

    //set
    public void setAge(int age) {
        this.age = age;
    }
    public void setBloodType(int blood) {
        this.blood = blood;
    }
    //compute
    public void computeBlood(){
        if(age >=18){
            if(blood==0){               //.equalsIgnoreCase("AB")){
                canDonate=" Blood Type 'AB' \n Can donate blood to AB.\n Can reveive blood from AB, A , B , O.";
            }
            else if(blood==1){          //.equalsIgnoreCase("A")){
                canDonate=" Blood Type 'A' \n Can donate blood to A, AB.\n Can reveive blood from A, O.";
            }
            else if(blood==2){          //.equalsIgnoreCase("B")){
                canDonate=" Blood Type 'B' \n Can donate blood to B, AB.\n Can reveive blood from B, O.";
            }
            else if(blood==3){          //.equalsIgnoreCase("O")){
                canDonate=" Blood Type 'O' \n Can donate blood to AB , A , B , O.\n Can only reveive blood from O.";
            }
            else {
                canDonate="Have a nice day !";
            }
        }       

    }
	//get
    public String getDonate(){
        return canDonate;
    }
}

