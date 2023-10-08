import java.util.*;
    public class funFactorial {
       public static void factorial(int a ){
        if(a<0){
            System.out.println("invalid inpout");
            return;
        }
        
         int fact=1;
        for(int i=a;i>=1;i--){
            fact=fact*i;
        }  
             System.out.println("Factorial of number:"+fact);
        
        return;
       }
       public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        factorial(a);
       
       
    }
    
    
}
