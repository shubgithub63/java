public class reverseString {
    public static void main(String[] args){
        StringBuilder name=new StringBuilder("Shubhranshu");
        
        System.out.println(name);
        System.out.println(name.length());
        
        for(int i=name.length();i>=1;i--){
            System.out.println(name.charAt(i-1));
        }
    }
}
