import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class SalaryCalculator {
    public static void main(String[] args) {
        String[] options = { "perHour","perWeek","perMonth","perYear" };
        String perMode = "";
        int start = JOptionPane.showOptionDialog(null,"Which one would you like to start from ?", "Mode Selection", 0, 3, null, options, options);
        switch (start) {
            case 0:
            perMode = "Per Hour";
            break;
            case 1:
            perMode = "Per Week";
            break;            
            case 2:
            perMode = "Per Month";
            break;
            case 3:
            perMode = "Per Year";
            break;
        }
        double input = Double.parseDouble(JOptionPane.showInputDialog(null,"How much " + perMode + " ?" ,null));
        int hours = Integer.parseInt(JOptionPane.showInputDialog(null, "How many hours per week ?","40"));
        double perHour=0;
        double perWeek=0;
        double perMonth=0;
        double perYear=0;
        switch (start) {
            case 0:
            perHour = input;
            perWeek = perHour * hours;
            perYear = perWeek * 52;
            perMonth = perYear / 12;
            break;
            case 1:
            perWeek = input;
            perHour = perWeek / hours;
            perYear = perWeek * 52;
            perMonth = perYear / 12;
            break;            
            case 2:
            perMonth = input;
            perYear = perMonth * 12;
            perWeek = perYear / 52;
            perHour = perWeek / hours;
            break;
            case 3:
            perYear = input;
            perMonth = perYear / 12;
            perWeek = perYear / 52;
            perHour = perWeek / hours;
            break;
        }
        
        DecimalFormat df = new DecimalFormat("#.##"); 
        String fPerHour = df.format(perHour);
        String fPerWeek = df.format(perWeek);
        String fPerMonth = df.format(perMonth);
        String fPerYear = df.format(perYear);

        JOptionPane.showMessageDialog(null, "If you get " + input + " € "+ perMode + " while working " + hours + " hours per week you will get:\n\n"
                                    + fPerHour + " € per Hour\n" + fPerWeek + " € per Week\n" + fPerMonth + " € per Month\n" + fPerYear + " € per Year\n", "Result", 1);
    }
}