public class Lab9 {
    //variables
	private String input;
	private int countletters, countvowels, countspace;
	private StringBuffer vowelbuffer, otherbuffer, secondbuffer, recombinebuffer;
	private String exclamationvowels,everyotherletter, everysecondletter, spacepositions, recombine;
	private String output;

	//constructor
	public Lab9(){
		countletters=0;
		countvowels=0;
		vowelbuffer = new StringBuffer();
		otherbuffer = new StringBuffer();
		secondbuffer = new StringBuffer();
		recombinebuffer = new StringBuffer();
		spacepositions="";
		recombine="";
		output="";
	}

	//set
	public void setInput(String input){
		this.input=input;
	}

	//compute
	public void compute(){
		for ( int i=0 ; i<input.length() ; i++ ){
			//counting the letters
			if (Character.isLetter( input.charAt(i) )){
				countletters++;
			}
			//counting vowel and vowel replacement
			char c = input.charAt(i);
			if ( c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
				 c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ) {
				countvowels++;
				vowelbuffer.append('!');
			}
			else {
				vowelbuffer.append( input.charAt(i) );
			}
			//print every other letter
			if (i % 2 == 0){
				otherbuffer.append(input.charAt(i));
			}
			else{
				otherbuffer.append(" ");
			}
			// print every second letter
			if (i % 2 != 0){
				secondbuffer.append(input.charAt(i));
			}
			else{
				secondbuffer.append(" ");
			}
	
			//count space
			if ( input.charAt(i) == ' ' ){
				countspace++;
				spacepositions += (i+1) + " ";
			}
		}
		//buffer to string
		exclamationvowels = vowelbuffer.toString();
		everyotherletter  = otherbuffer.toString();
		everysecondletter = secondbuffer.toString();

		//recombine
		if ( everyotherletter.length() > everysecondletter.length() ){
			for ( int i=0 ; i<everyotherletter.length() ; i++ ){
				if (i % 2 == 0){
					recombinebuffer.append(everyotherletter.charAt(i));
				}
				else {
					recombinebuffer.append(everysecondletter.charAt(i));
				}
			}
		}
		else {
			for ( int i=0 ; i<everysecondletter.length() ; i++ ){
				if (i % 2 == 0){
					recombinebuffer.append(everyotherletter.charAt(i));
				}
				else {
					recombinebuffer.append(everysecondletter.charAt(i));
				}
			}
		}
		recombine= recombinebuffer.toString();
		//summary
		output 	+= 	
		"Your Input Was         = " + input + "\n" +
		"Vowels replaced with ! = " + exclamationvowels + "\n" +
		"Letter count = " + countletters + "\n" +
		"Vowels count = " + countvowels + "\n" +
		"Space count  = " + countspace + "\n" +
		"Space were found at these columns =  " + spacepositions + "\n" + 
		"Your Input if we print every  other letter // " + everyotherletter + "\n" +
		"Your Input if we print every second letter // " + everysecondletter + "\n" +
		"Your Input stitched back togheter          // " + recombine;
	}

	//get
	public String getOutput(){
		return output;
	}
}