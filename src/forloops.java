import java.util.*;
public class forloops {
    public static void main(String[] args) throws Exception {
        //print hellow 10 times
        System.out.println("number of times");
        Scanner sc= new Scanner (System.in);
        int input=sc.nextInt();
        for(int i=0;i<input;i++){
            System.out.println("hello java");
        }
        //print 0 to 10
        for(int j=0; j<input +1;j++){
           System.out.println(j);
        }
        //sum of input natral number
        int sum=0;
        for(int i=1;i<=input;i++){
            
            sum=sum+i;
        }
        System.out.println(sum);
         //table of number
         for(int i=1;i<11;i++){
            System.out.println(input*i);
         }



    }
    
}
