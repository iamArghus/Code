public class Email {
    //var
    private String output;
    private boolean username;
    private boolean domain;
    private boolean symbol;
    private boolean dot;
    private boolean ext;
    private int atindex;
    private int atcount;
    private int dotindex;

    //constructor
    public Email(){
        output="";
        username=false;
        domain=false;
        symbol=false;
        dot=false;
        ext=false;
        atcount=0;
    }

    public String computeEmail(String email, String[] extensions) {
        //THIS PART SHOWS WHAT THE USER INPUT WAS
        output += "The Email you entered was : " + email + ";\n";
        output += "Extensions Provided : ";
        for (int i=0; i<extensions.length; i++){
            output += extensions[i];
            if ( i < extensions.length-1) {
                output += " , ";
            }  
        }
        output += " : \n\n Validation Result :\n"; 

        //EVALUATING STRING
        for( int i=0; i<email.length(); i++){
            //check for @ presence
            if ( email.charAt(i) == '@' ){
                atindex = i + 1;
                atcount++;
            }
            else {
            }
            //setting position of '.'
            if (email.charAt(i) == '.'){
                dotindex = i + 1;
            }
        }
        
        //COMPUTING OUTPUT
        //validate if username is null
        output += "-  Username is not null : ";
        if ( email.charAt(0)!='@' ){
            username=true;
            output += "TRUE\n";
        }
        else{
            output += "FALSE\n";
            output += "**Error : Username cannot be null**\n";

        }
        //validate if domain is null
        int domainame = (dotindex-1) - atindex;
        System.out.println(email.substring(atindex, dotindex -1));
        output += "-  Domain is not null : ";
        if (domainame>=1){
            domain=true;
            output += "TRUE\n";
        }
        else{
            output += "FALSE\n";
            output += "**Error : Domain cannot be null**\n";
        }
        //validate @ presence
        output += "-  Email contains 1 '@' symbol : ";
        if ( atcount==1 ) {
            output += "TRUE\n";
            symbol=true;
        }
        else {
            output += "FALSE\n";
            output += "**Error : '@' symbol either missing or repeated**\n";
        }
        //validate . position
        output += "-  Dot '.' is before a 3 character extension : ";
        if (email.length()-dotindex == 3){
            dot=true;
            output += "TRUE\n";
        }
        else {
            output += "FALSE\n";
            output += "**Error : Extension length is incorrect**\n";
        }
        //check if extension matches one of the extension provided
        output += "-  Extension match : ";
        if (email.substring(dotindex).equals(extensions[0])
        ||  email.substring(dotindex).equals(extensions[1])
        ||  email.substring(dotindex).equals(extensions[2])){
            output += "TRUE\n";
            ext=true;
        }  
        else {
            output += "FALSE\n";
            output += "**Error : Extension not matching any of the provided extensions**\n";
        }

        //OUTPUT IS EMAIL VALID?
        if ( username==true && domain==true && symbol==true && dot==true && ext==true ){
            output += "\nThe Email is VALID !";
        }
        else {
            output += "\nThe Email is not VALID !";
        }

        System.out.println("username "+username);
        System.out.println("domain "+domain);
        System.out.println("symbol "+symbol);
        System.out.println("dot "+dot);
        System.out.println("ext "+ext);

        return output;
    }
}