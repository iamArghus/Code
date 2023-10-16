import javax.swing.JOptionPane;

public class BattleshipApp {
    public static void main(String[] args) {
        //variables
        char[][] usergrid = new char[3][3];
        char[][] userattackgrid = new char[3][3];
        char[][] compgrid = new char[3][3];
        char[][] compattackgrid = new char[3][3];
        String report;
        int type;

        //objects
        Battleship bs = new Battleship();

        //input
        //player and computer grids gets populated by 0 == calm sea
        for ( int i=0; i<usergrid.length; i++ ){
            for ( int j=0; j<usergrid[0].length; j++ ){
                usergrid[i][j]='0';
                compgrid[i][j]='0';
                userattackgrid[i][j]='0';
                compattackgrid[i][j]='0';
            }
        }
        // player set anchor coordinates
        Object[] options = {1,2,3};
        int userShipRow   = JOptionPane.showOptionDialog(null, "In which row you wanna anchor your ship?", "Ship Placement",
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,1);
        int userShipColumn= JOptionPane.showOptionDialog(null, "In which column you wanna anchor your ship?", "Ship Placement",
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, 1);
		usergrid[userShipRow][userShipColumn]='S';  //  S is UserShip location
        // player attack coordinates 
        int userAttackRow   = JOptionPane.showOptionDialog(null, "At which angle you wanna aim you cannon?", "Cannon angle adjustment",
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,1);
        int userAttackColumn= JOptionPane.showOptionDialog(null, "At which tilt you wanna aim your cannon?", "Cannon tilt adjustment",
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, 1);
        userattackgrid[userAttackRow][userAttackColumn]='X';  //  X is UserAttack coordinates
       
        //set
        bs.usergrid(usergrid);
        bs.userattackgrid(userattackgrid);
        bs.compgrid(compgrid);
        bs.compattackgrid(compattackgrid);
       
        //compute
        bs.compute();
       
        //get
        report=bs.getReport();
        type=bs.getType();
        
        //output
        JOptionPane.showMessageDialog(null, report , "Impact report",type);
    }
}
