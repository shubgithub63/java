import java.util.*;
public class sortedOrNot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of element:-");
        int input=sc.nextInt();
        int array[]=new int[input];
        System.out.println("Enter array elements");
        for(int i=0;i<input;i++){
            array[i]=sc.nextInt();
        }
        boolean isAscending=true;
        for(int i=0;i<input-1;i++){
            if (array[i]>array[i+1]){
                 isAscending=false;
            }

        }
        if(isAscending==true)
           System.out.println("the array is sorted in ascending order");
        else
           System.out.println("the array is not sorted in ascending order");
        
    }
    
}
