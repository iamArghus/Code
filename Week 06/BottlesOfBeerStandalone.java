public class BottlesOfBeerStandalone {
    public static void main (String[] args){
        //variables
        int bn=99;
        String bw=" bottles of beer on the wall, ";
        String bws=" bottle of beer on the wall, ";
        String bb=" bottles of beer,\n";
        String bbs=" bottle of beer,\n";
        String td="Take one down and pass it around, ";
        String nm="No More";
        String verse="";
        //input
        //nothing to see here
        //process
        for (bn = 99; bn >=3; bn--){
            verse= bn + bw + bn + bb + td + (bn-1) + bw ;
            System.out.println(verse);
        }
        if (bn==2){
            verse= bn + bw + bn + bb + td + (bn-1) + bws ;
            bn=bn-1;
            System.out.println(verse);
        }
        if (bn==1){
            verse= bn + bws + bn + bbs + td + nm + bw ;
            bn=bn-1;
            System.out.println(verse);
        }
        if (bn==0){
            td="Go to the store and buy some more, 99";
            verse= nm + bw + nm + bb + td + bw ;
            System.out.println(verse);
        }
    }
}