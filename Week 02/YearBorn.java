import javax.swing.JOptionPane;

public class YearBorn {
    public static void main(String[] args) {
    /*
    input
    int=age;
    int=year
    output
    int yearBorn.
    */
    //vars
    int age;
    int year;
    int yearBorn;
    //in
    age =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age"));
    year=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Current Year"));
    yearBorn=year-age;
    //process
    JOptionPane.showMessageDialog(null,"You were Born in " + yearBorn);
}
     
}
