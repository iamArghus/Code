public class Symbol {
    //variables
    private int[][] symbolArray;
	private String symbol;
	private String result = "";

	//constructor
	public Symbol(){
	}

	//set
	public void setSymbolArray(int[][] symbolArray){
		this.symbolArray=symbolArray;
	}
	public void setSymbol(String symbol){
		this.symbol=symbol;
	}

	//compute
	public void compute(){
		for( int i=0 ; i < symbolArray.length ; i++ ){
			for( int j=0 ; j < symbolArray[0].length ; j++ ){
				result = result + symbol + " ";
			}
			result = result + "\n";
		}
	}

	//get
	public String getResult(){
		return result;
	}
}