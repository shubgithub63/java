public class recRevStr {
    public static void revStr(int num,String name){
        if(num==1){
            System.out.println(name.charAt(num-1));
            return;
        }
        System.out.println(name.charAt(num-1));
        revStr(num-1,name);
    }

public static void main(String[] args){
    String name="shubhranshu";
    int num=name.length();
    revStr(num,name);
}
}
