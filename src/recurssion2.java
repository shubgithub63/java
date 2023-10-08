public class recurssion2 {
    public static int countPath(int i,int j,int n,int m){
        if(i==n||j==m){
            return 0;
        }
        if (i==n-1&&j==m-1){
            return 1;
        }
        //move right
        int rightPath=countPath(i+1,j,n,m);
        
        //move down
        int downPath=countPath(i,j+1,n,m);
        

        return rightPath+downPath;


    }
    public static void main(String[] args){
        int n=3,m=3;
        
        System.out.println(countPath(0,0,n,m));
    }
}
