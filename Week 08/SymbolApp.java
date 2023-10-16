// import java.util.Scanner;

public class SymbolApp {
    public static void main(String[] args) {
        //variables
        int rows = 10;       //rows to print
        int col = 10;        //columns to print
        int[][] symbolArray = new int [rows][col];
        String result;

        //objects
        Symbol ds = new Symbol();                   //instatiable class
        // Scanner input = new Scanner(System.in);     // Scanner

        //input
        // System.out.println("Enter a symbol");   
        String symbol = "-";     // input.nextLine();
        // System.out.println(symbol);
        // input.close();
        
        //set
        ds.setSymbolArray(symbolArray);
        ds.setSymbol(symbol);

        //compute
        ds.compute();
        
        //get
        result=ds.getResult();

        //output
        System.out.println(result);
    }
}
