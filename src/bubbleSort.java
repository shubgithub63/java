import java.util.*;
public class bubbleSort {
    public static void main (String[] args){
    Scanner scan =new Scanner(System.in);
     System.out.println("number of element:-");
    int n=scan.nextInt();
   
    int[] array=new int[n];
    for(int i=0;i<n;i++){
        array[i]=scan.nextInt();
    }
    for(int i=n;i>1;i--){
        for(int j=0;j<i-1;j++){
           if(array[j]>array[j+1]){
              int tras=array[j];
              array[j]=array[j+1];
              array[j+1]=tras;
            }
        }
    }
    
     for(int i=0;i<n;i++){
        System.out.println(array[i]);
     }
    }
}
