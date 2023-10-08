import java.util.*;
public class stringBuilder {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:-");
        String name=sc.nextLine();
        StringBuilder sb=new StringBuilder(name);
        //print string builder
        System.out.println(sb);
        //print chatrecter at any index
        System.out.println(sb.charAt(4));
        //set charecter at any index
        sb.setCharAt(4,'X');
        System.out.println(sb);
        //insert charecter at any index
        sb.insert(0,'S');
        System.out.println(sb);
        //delete any char or string
        //last index is exclusive
        sb.delete(2,4);
        System.out.println(sb);
        //add at the end
        sb.append(" Star");
        //length of string
        System.out.println(sb.length());


        
    }
    
}