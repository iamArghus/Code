public class BeerBottle {
    //variables
    private int bn;
    private String bw=" bottles of beer on the wall";
    private String bws=" bottle of beer on the wall";
    private String bb=" bottles of beer,\n";
    private String bbs=" bottle of beer,\n";
    private String td="Take one down and pass it around, ";
    private String nm="No More";
    private String sp="_____________________________________________________________________\n";     // i loved the see the spacing, so i implemented it
    private String verse;
    //constructor
    public BeerBottle(){
        bn=0;
        verse="";
    }
    //set
    public void setBeer(int bn){
        this.bn = bn;
    }
    //compute
    public void computeMethod(){
        for (bn = 99; bn >=3; bn--){
            verse=verse + bn + bw + ", " + bn + bb + td + (bn-1) + bw + ",\n" + sp;
        }
        if (bn==2){
            verse=verse + bn + bw + ", "+ bn + bb + td + (bn-1) + bws + ",\n" + sp;
            bn=bn-1;
        }
        if (bn==1){
            verse=verse + bn + bws + ", "+ bn + bbs + td + nm + bw + ",\n" + sp;
            bn=bn-1;
        }
        if (bn==0){
            td="Go to the store and buy some more, 99";
            verse=verse + nm + bw + ", "+ nm + bb + td + bw + ".\n" + sp;
        }
    }
    //get   
    public String getVerse(){
        return verse;
    }
}
//     99 bottles of beer on the wall, 99 bottles of beer
// Take one down and pass it around, 98 bottles of beer on the wall