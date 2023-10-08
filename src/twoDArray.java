import java.util.*;
public class twoDArray {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("number of rows:-");
        int row=sc.nextInt();
        System.out.print("number of column:-");
        int col=sc.nextInt();
        int [][] array=new int[row][col];
        System.out.println("insert 2Darray element");
        for(int i=0;i<row;i++){
           for(int j=0;j<col;j++) {
              array[i][j]=sc.nextInt();
           }
        }
        System.out.println("2Darray is:-");

        for(int i=0;i<row;i++){
           for(int j=0;j<col;j++) {
              System.out.print(array[i][j]+" ");
           }
           System.out.println();
        }
    }
    
}
