import java.util.*;
public class pattern {
    public static void main(String[]args){
   //pattern 1 rectangle
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
  // for(int i=0;i<n;i++){
     // for(int j=0;j<n;j++){
       // System.out.print("*");
     // }
     // System.out.println();
      
  // }
   //print hollow rectangle
   //for(int i=1;i<=n;i++){
     // for(int j=1;j<n+1;j++){
       // if(i==1||j==1||i==n||j==n){
        //    System.out.print("*"); 
       // }else{
        //     System.out.print(" ");
       // }
        
       // }
        // System.out.println();

     // }
     //pyramid at left side
      //for(int i=1;i<=n;i++){
         //for(int j=1;j<=i;j++){
           // System.out.print("*");
        // }
        // System.out.println(); 
     // }
      //inverted right pyramid
      //for(int i=n;i>=1;i--){
         //for(int j=1;j<=i;j++){
           // System.out.print("*");
         //}
         
        // System.out.println(); 
    //  }
      //pyramid at right
      //for(int i=1;i<=n;i++){
         //for(int j=1;j<=n-i;j++){
            
           // System.out.print(" ");
         //}
         //for(int j=1;j<=i;j++){
            
           // System.out.print("*");
         //}
         //System.out.println(); 
        //}
        //increasing number left pyramyd each row stare with 1
        //for(int i=1;i<=n;i++){
         //for(int j=1;j<=i;j++){
            
           // System.out.print(j+" ");
         //}
         
        // System.out.println(); 
        //}
        //inverted of above number 
        //for(int i=n;i>=1;i--){
         //for(int j=1;j<=i;j++){
            
           // System.out.print(j+" ");
         //}
         
         //System.out.println(); 
        //}
        //another way
        //for(int i=1;i<=n;i++){
         //for(int j=1;j<=n-i+1;j++){
            
           // System.out.print(j+" ");
         //}
         
         //System.out.println(); 
       // }
       //counting num pyramyd left
       // int k=1;
       //for(int i=1;i<=n;i++){
         //for(int j=1;j<=i;j++){
            
           // System.out.print(k+" ");
           // k++;
         //}
         
         //System.out.println(); 
        //}
        //print 
        //1
        //0 1
        //1 0 1
        //0 1 0 1
        //1 0 1 0 1
        //for(int i=1;i<=n;i++){
         //for(int j=1;j<=i;j++){
            //int sum=i+j;
            //if(sum%2!=0){
               // System.out.print("0 ");
            //}
            //else{
              //  System.out.print("1 ");
           // }
         //}
         
         //System.out.println(); 
        //}
         //for(int i=1;i<=n;i++){
          //for(int j=1;j<=i;j++){
             // System.out.print("*"); 
          //}
          
          //for(int j=1;j<=2*(n-i);j++){
             
            //  System.out.print(" "); 
          //}
          //for(int j=1;j<=i;j++){
             // System.out.print("*"); 
          //}
          //System.out.println(); 
        //}
        //for(int i=n;i>=1;i--){
          //for(int j=1;j<=i;j++){
            //  System.out.print("*"); 
          //}
         
          //for(int j=1;j<=2*(n-i);j++){
             
            //  System.out.print(" "); 
          //}
          //for(int j=1;j<=i;j++){
             // System.out.print("*"); 
          //}
          //System.out.println(); 
       // }
       //pattern 11 
       //        *****
       //       *****
       //      *****
       //     *****
       //    *****
       for(int i=1;i<=n;i++){
          for(int j=1;j<=n-i;j++){
            System.out.print(" ");
          }
          for(int j=1;j<=n;j++){
            System.out.print("*");
          }
          System.out.println();
       }
     }
 }

