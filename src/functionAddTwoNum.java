
import java.util.*;


public class functionAddTwoNum {
    public static int sumOfTwo(int a,int b){
        int sum=a+b;
        return sum;
     }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=sumOfTwo(a,b);
        System.out.println(sum);

    }
    
}