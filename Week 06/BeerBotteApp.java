public class BeerBotteApp {
public static void main (String[] args){
        //variables
        int beerWall;
        String nextVerse;
        //object
        BeerBottle beer = new BeerBottle();
        //input
        beerWall=99;
        //set
        beer.setBeer(beerWall);
        //compute
        beer.computeMethod();
        //get
        nextVerse=beer.getVerse();
        //output
        System.out.println(nextVerse);
    }   
}
