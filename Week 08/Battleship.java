public class Battleship {
    //variables
	private char[][] usergrid;
	private char[][] userattackgrid;
	private char[][] compgrid;
	private char[][] compattackgrid;
	private String report;
	private int type;

	//constructor
	public Battleship(){
	}

	//set
	public void usergrid(char[][] usergrid){
		this.usergrid=usergrid;
	}
	public void userattackgrid(char[][] userattackgrid){
		this.userattackgrid=userattackgrid;
	}
	public void compgrid(char[][] compgrid){
		this.compgrid=compgrid;
	}
	public void compattackgrid(char[][] compattackgrid){
		this.compattackgrid=compattackgrid;
	}

	//compute
    public void compute(){
	//computer random ship placement and attack coordinates
	int compShipRow    = (int) (Math.random() * 3);
	int compShipColumn = (int) (Math.random() * 3);
	compgrid[compShipRow][compShipColumn]='X';  //  X is CompShip location
	int compAttackRow    = (int) (Math.random() * 3);
    int compAttackColumn = (int) (Math.random() * 3);
	compattackgrid[compAttackRow][compAttackColumn]='S';  //  S is CompAttack coordinate
	// here i convert the array into string to compare them
	String ua="";
	String cs="";
	String ca="";
	String us="";
	for ( int i=0 ; i<usergrid.length ; i++ ){
		for ( int j=0; j<usergrid[0].length; j++ ){
			ua += userattackgrid[i][j] + " " ;
			cs += compgrid[i][j] + " " ;
			ca += compattackgrid[i][j] + " " ;
			us += usergrid[i][j] + " " ;
		}
	}
	// System.out.println("user attack__" + ua); //for testing
	// System.out.println("comp ship____" + cs);
	// System.out.println("comp attack__" + ca);
	// System.out.println("user ship____" + us);

	// Win
	if (ua.equals(cs) && !ca.equals(us)) {
		report = "You have sunk the enemy ship !";
		type = 2;
	}
	// Lose
	else if (!ua.equals(cs) && ca.equals(us)) {
		report = "You were sunk by the enemy ship !";
		type = 0;
	}
	// Draw
	else if (ua.equals(cs) && ca.equals(us)) {
		report = "You shot each other at the very same time, everyone loses !";
		type = 0;
	}
	// Miss
	else{
		report = "You both missed, you could shoot again but have no rounds left !";
		type = 1;
	}
	}

	//get
	public String getReport(){
		return report;
	}
	public int getType(){
		return type;
		// type 0 red X
        // type 1 info I
        // type 2 warning !
        // type 3 question ?
	}
	
}