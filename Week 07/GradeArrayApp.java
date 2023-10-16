import javax.swing.JOptionPane;

public class GradeArrayApp {
    public static void main(String[] args) {
        //variables
        int numOfSubjects=-1;
        int average;
        String array = "The marks you submitted are:\n" ;
        String grade;
        //objects
        GradeArray g = new GradeArray();
        
        //input
        // 1/ ask user how many subjects?  2/ reject and loop input if below 1 but will allow one to get a grade 
        do {
            numOfSubjects=Integer.parseInt(JOptionPane.showInputDialog(null, "How many subjects do you want to calculate?",  "Grade Calculator",3));
            if (numOfSubjects <= 0){
                JOptionPane.showMessageDialog(null,"What are you even doing here ?!");
            }
        } while(numOfSubjects < 1);

        //array
        int[] marks = new int[numOfSubjects];
        
        // 1/ for loop to input marks* /2 validate input if below 0 or higher then 100
        for(int i=0 ;i < marks.length; i++){
            marks[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the marks to calculate in a 0 to 100 format.",  "Marks for subject " + (i+1),3));
            while (marks[i] < 0 || marks[i] > 100){
                marks[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the marks to calculate in a 0 to 100 format.",  "Marks for subject " + (i+1),3));
            }
        }

        //set
        g.setMarks(marks);

        //compute
        g.computeGrade();
        
        //get
        average=g.getAverage();
        grade=g.getGrade();

        //output
        //for loop to add the array integers and add them to a string.
        for (int a=0 ; a<marks.length ; a++){
            array += "Subject " +  (a+1) + ": " + marks[a] + "\n";
        }

        //final output
        JOptionPane.showMessageDialog(null,array + "Your marks average is : " + average + "\nYour current grade is : " + grade, "Grade Calculation",1);

    }
}
