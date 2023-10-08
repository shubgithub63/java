import java.util.*;



public class setBit {
    
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:-");
        int num=sc.nextInt();
        System.out.print("enter position want to access:-");
        int pos=sc.nextInt();
        
        int bitMask=1<<pos;
        
            System.out.println("number is:-"+(bitMask|num));
       
       
    }
}
