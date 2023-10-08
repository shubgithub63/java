public class recurssion1 {
    public static void stringPermutation(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){//place a at chair
            char currChar=str.charAt(i);//a
            String newString=str.substring(0, i)+str.substring(i+1);//bc left
            stringPermutation(newString,permutation+currChar);//
        }
    }
    public static void main(String [] args){
        String str="abc";
        stringPermutation(str," ");


    }
}
