public class recursion3{
    public static int setTiles(int n ,int m){
        if(n<m){
            return 1;
        }
        if(n==m){
            return 2;
        }
        //verticle
        int placeVerticle=setTiles(n-m,m);
        //horizxontal
        int placeHorizontal=setTiles(n-1,m);
        return placeVerticle+placeHorizontal;
    }
    public static void main(String[] args){
       int n=4,m=2;
       System.out.println(setTiles(n,m));
    }
    
    
}