import javax.swing.JOptionPane;
import java.time.Year;
//The video suggested to look up java.util.Date, but i got an error saying it was deprecated, so i found this one instead. i have JDK 20
//Changed the Code to output the current age based only on the year of birth and then fetching current year online

public class HowOld {
        public static void main(String[] args) {   
             
    int y=Year.now().getValue();
    int yearBorn=Integer.parseInt(JOptionPane.showInputDialog(null,"What year where you born?"));
    int age= y - yearBorn ;
   
    //Integer.parseInt(JOptionPane.showInputDialog(null,"Enter current year"));
    //process
    JOptionPane.showMessageDialog(null,"You will be " + age + " years old after your birthday in " + y);


}
}