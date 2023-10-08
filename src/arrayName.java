import java.util.*;
//take array name as input and print them on screen
public class arrayName{
   
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.print("number of name as input:-");
        int input=sc.nextInt();
        String[] names=new String[input];
        for(int i=0;i<input;i++){
            names[i]=sc.next();
        }
        System.out.println("input names are:-");
        for(int i=0;i<input;i++){
            System.out.println("name"+(i+1)+"is:-"+names[i]);
        }


       
    }
}