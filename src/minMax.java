import java.util.*;
//find min max of array integer
public class minMax{
   
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.print("number of input:-");
        int input=sc.nextInt();
        int[] num=new int[input];
        for(int i=0;i<input;i++){
            num[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<input;i++){
            if(num[i]<min)
                  min=num [i];
            if(num[i]>max) 
                   max=num[i];     
               
        }
        System.out.println("maximum value is :-"+max);
        System.out.println("minimum value is :-"+min);


       
    }
}