import javax.swing.JOptionPane;

public class CoinTosser3000 {
    public static void main(String[] args) {
        //var
        int choice;
        int random;
        int tossNum=0;
        boolean again=true;
        String toss;
        //input
        Object[] options={"YES !","NO !"};
        choice=JOptionPane.showOptionDialog(null,"Do you wanna flip a coin?","CoinTosser3000",
        JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.DEFAULT_OPTION,null,options,null);
        
        //output
        while (again==true){
            if (choice==0){
                tossNum++;
                random=(int) (Math.random() * 100 +1);
                if (random<50){
                    toss="Heads !";
                }
                else if(random>50){ 
                    toss="Tails !";
                }
                else{ 
                    toss="The coin landed on it's edge !";
                }
                Object[] options2={"Again !","Exit !"};
                choice=JOptionPane.showOptionDialog(null,"Toss # " + tossNum + "\n\n" + toss + "\n\n","CoinTosser3000",
                JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options2,1);
                }
            if (choice==1){
                JOptionPane.showMessageDialog(null,"Bye Bye");
                again=false;                
            }
        }
    }
}