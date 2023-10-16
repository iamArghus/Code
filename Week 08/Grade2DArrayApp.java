import javax.swing.JOptionPane;

public class Grade2DArrayApp {
    public static void main(String[] args) {
        //variables
        int years = 4;
        int subjects = 5;
        String name;
        String summary;
        //array
        int[][] marks = new int[years][subjects];

        // for loop to generate student marks for predictable results this will output these averages y1=100,y2=90,y3=80,y4=70 on one line for comodity.
         int test = 100; for ( int i = 0; i < marks.length; i++ ) { for ( int j=0; j < marks[0].length; j++ ){ marks[i][j] = test; }  test -= 10; }

        //objects
        Grade2DArray g = new Grade2DArray();
        
        //input
        name=JOptionPane.showInputDialog(null, "May i ask for your name?", "Name Input" ,3);
        if (name==null || name.isEmpty() || name.isBlank()){
            name="User";
        }
        // 1/ for loop to input marks for each year /2 validate input if below 0 or higher then 100
        /* // uncomment for manual input
        for( int i=0; i < marks.length; i++ ){
            for( int j=0 ; j < marks[0].length; j++ ){
                marks[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "Dear " + name + ", Please enter the marks to calculate in a 0 to 100 format.", "Year " + (i+1) + " Marks for subject " + (j+1) ,3));
                while (marks[i][j] < 0 || marks[i][j] > 100){
                    marks[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "Dear " + name + ", Please enter the marks to calculate in a 0 to 100 format.",  "Year " + (i+1) + " Marks for subject " + (j+1) ,3));
                }       
            }
        }
        */

        //set
        g.setMarks(marks);

        //compute
        g.computeGrade();
        
        //get
        summary=g.getSummary();

        //output
        JOptionPane.showMessageDialog(null, "Dear " + name + ",\nThe results are in!\n" + summary, "Average Marks Calculation",1);
    }
}
