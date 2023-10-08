import java.util.*;



public class circumference {
    public static double radCircum(int a){
       return 2*(Math.PI)*a;
     }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(radCircum(a));
       
    }
    
}