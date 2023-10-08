import java.util.*;
public class arrey {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of element:-");
        int input=sc.nextInt();
        int array[]=new int[input];
        System.out.println("Enter array elements");
        for(int i=0;i<input;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Enter number to be find:-");
        int num=sc.nextInt();

        for(int i=0;i<input;i++){
            if(array[i]==num)
              System.out.println("index of number is:-"+i);
        }
    }
    
}

