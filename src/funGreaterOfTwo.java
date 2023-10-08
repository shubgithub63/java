import java.util.*;
public class funGreaterOfTwo {
    public static int greaterOfTwo(int a,int b){
        if(a>b)
         return a;
        else
        return b;
     }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.println("greater of two number is:"+greaterOfTwo( a,b));

    }
    
}
