import java.util.*;



public class getBit {
    
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println("enter position want to access");
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        if((bitMask&num)==0){
            System.out.println("bit was zero");
        }
        else
         System.out.println("bit was one");

       
    }
}