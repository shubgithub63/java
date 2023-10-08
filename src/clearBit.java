import java.util.*;



public class clearBit {
    
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println("enter position want to access");
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        int notBit=~bitMask;
        System.out.println("number obtained is :-"+(notBit&num));
       
    }
}
