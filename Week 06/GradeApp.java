import javax.swing.JOptionPane;

public class GradeApp {
    public static void main(String[] args) {
        //variables
        int numOfSubjects=-1;
        int markSum=0;
        int average;
        int input;
        String grade;
        //objects
        Grade g = new Grade();

        //input
        numOfSubjects=Integer.parseInt(JOptionPane.showInputDialog(null, "How many subjects do you want to calculate?",  "Grade Calculator",3));
        while(numOfSubjects<1){
            JOptionPane.showMessageDialog(null,"To calulate an average you need at least 2 subjects");
            numOfSubjects=Integer.parseInt(JOptionPane.showInputDialog(null, "How many subjects?",  "Grade Calculation",3));
        }
        //System.out.print(numOfSubjects);

        for(int i=1;i<=numOfSubjects; i++){
            input=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the marks to calculate in a 0 to 100 format.",  "Marks for subject " + i,3));
            while (input<0 || input>100){
                input=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the marks to calculate in a 0 to 100 format.",  "Marks for subject " + i,3));
            }
            markSum=markSum+input;
            System.out.print(markSum);
        }
        //set
        g.setNumOfSubjects(numOfSubjects);
        g.setMarks(markSum);

        //compute
        g.computeGrade();
        // grade from A-F based on their results
        
        //get
        average=g.getAverage();
        grade=g.getGrade();
        //output
        JOptionPane.showMessageDialog(null,"Your marks average is : " + average + "\nYour grade is : " + grade, "Result",1);
    }
}
