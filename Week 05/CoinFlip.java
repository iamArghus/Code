import javax.swing.JOptionPane;
public class CoinFlip {
    public static void main(String[] args) {
        //var
        int choice=0;
        int random;
        String toss;
        //input
        Object[] options={"YES !","No Thanks"};
        choice=JOptionPane.showOptionDialog(null,"Let's Start","CoinTosser3000",
        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,1);
        
        //output
        while (true){
            if (choice==0){
                random=(int) (Math.random() * 2);
                if (random==0){
                toss="Heads !";
                }
                else { toss="Tails !";
                }
                    Object[] options2={"Again !","Exit !"};
                    choice=JOptionPane.showOptionDialog(null,"It Came Out "+toss,"CoinTosser3000",
                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options2,1);
                }
            if (choice==1){
                JOptionPane.showMessageDialog(null,"Bye Bye");
                break;
            }
        }
    }
}

    
    