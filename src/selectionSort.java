import java.util.*;
public class selectionSort {
    public static void main (String[] args){
    Scanner scan =new Scanner(System.in);
     System.out.println("number of element:-");
    int n=scan.nextInt();
   
    int[] array=new int[n];
    for(int i=0;i<n;i++){
        array[i]=scan.nextInt();
    }
   // for(int i=0;i<n-1;i++){
        // int min=i;
       // for(int j=i+1;j<n;j++){//compare till last element
          // if(array[min]>=array[j]){
             // min=j;
          // }
       // }
       // int tras=array[min];
      // array [min]=array[i];
       // array[i]=tras;
for(int i=0;i<n-1;i++){
        int min=array[i];
        for(int j=i+1;j<n;j++){//compare till last element
           if(min>array[j]){
              min=array[j];
            }
        }
        int tras=min;
        min=array[i];
         array[i]=tras;

        
    }
    for(int i=0;i<n;i++){
        System.out.println(array[i]);
     }
   
    }
}
