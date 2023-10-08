public class towerOfHanoiRec {
    public static void towerOfHanoi(int n,String scr,String help,String dest){//source,helper,destination
          if(n==1){
            System.out.println("transfer disk"+n+"from"+scr+"to"+dest);
        return;
          }
         towerOfHanoi(n-1,scr,dest,help) ;
         System.out.println("transfer disk"+n+"from"+scr+"to"+dest);
         towerOfHanoi(n-1,help,scr,dest) ;

          
    }
    public static void main(String[] args){
        int n=3;
        towerOfHanoi(n,"S","H","D");
        
    }    
}
