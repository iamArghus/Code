public class threebythreeApp {
    public static void main(String[] args) {
        //variables
        // int rows = 3;                                        //array generator
        // int colums = 3;                                      //array generator
        // int[][] array = new int [rows][colums];              //array generator
        int[][] array = {{4,8,15},
                        {16,23,42},
                        {66,70,83}};
        String row;
        String col;
        String tot;

        //objectsg
        threebythree three = new threebythree();                //instatiable class

        //input
        //this prints the preset array or generates one if uncommented
        //int n=1;                                              //array generator
        for ( int i=0 ; i < array.length ; i++ ){  
            System.out.print ( "Row " + (i+1) + "     is " );
            for ( int j=0 ; j < array[0].length ; j++ ){
                // array[i][j]=n;                               //array generator
                // n=n+2;                                       //array generator
                System.out.print (array[i][j]+" ");
            }
            System.out.println("");
        }

        //set
        three.setArray(array);

        //compute
        three.compute();

        //get
        row=three.getRow();
        col=three.getCol();
        tot=three.getTot();

        //output
        System.out.println(row + col + tot);  
    }
}
