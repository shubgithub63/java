
import java.util.*;
public class check{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element:-");
        int input=sc.nextInt();
        int[] num=new int[input];
        for(int i=0;i<input;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Enter sum to be find:-");
        int sum=sc.nextInt();
        for(int i=0;i<input-1;i++){
            for(int j=i+1;j<input;j++){
                   if(num[i]+num[j]==sum){
                       System.out.print("["+i+","+j+"]");
         
                   }
            }
        }

        

    }
}
