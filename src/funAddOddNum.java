import java.util.*;


public class funAddOddNum {
    public static int sumOfOdd(int a){
        if(a<0){
            return 0;
        }
       int sum=0;
       for (int i=1;i<=a;i++){
        if(i%2!=0)
            sum=sum+i;
        
        else
        sum=sum;
         
       }
       return sum;
     }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        int sum=sumOfOdd(a);
        System.out.println(sum);

    }
    
}
