import java.util.*;
public class CountPosNeg {
    
      
    public static void main(String[] args){
      int positiveCount,negativeCount,zeroCount;
      positiveCount=negativeCount=zeroCount=0;
       System.out.println("number of element to be enter:"); 

       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int array[]=new int[n];
        for(int i=0;i<n;i++){
           array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
          if(array[i]>0)
            positiveCount++;
          else if(array[i]<0)
            negativeCount++;
          else
             zeroCount++;
        }
        System.out.println("count of positive number"+positiveCount);
        System.out.println("count of negative number"+negativeCount);
        System.out.println("count of zero number"+zeroCount);
    }
    
}
