import java.util.*;
public class updateBit{
    
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:-");
        int num=sc.nextInt();
        System.out.println("enter position want to access:-");
        int pos=sc.nextInt();
        System.out.println("enter operation:-");
        int oper=sc.nextInt();

        int bitMask=1<<pos;
        if(oper==1){
            System.out.println("number is:-"+(bitMask|num));
        }
        else{
            int newBitMask=~(bitMask);//cant update bit mask to negation of bit mask without new variable
            System.out.println("number is:-"+(newBitMask&num));
        }
       
    }
}
