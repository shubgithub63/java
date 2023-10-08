import java.util.*;



public class funEligible {
    public static String eligible(int a){
       if(a>18)
        return "eligible";
    else
        return "notEligible";
     }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("person eligible for voting:-"+eligible(a));
       
    }
    
}