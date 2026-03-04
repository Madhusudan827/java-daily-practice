// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Diomand {
    public static void main(String[] args) {
        int n=4,m=3;
        for(int i=0;i<n;i++){
           for(int j=0;j<n-i;j++){
             System.out.print(" ");
           } for(int j=n;j>=n-i;j--){
            System.out.print("*");
           }for(int j=i;j>0;j--){
               System.out.print("*");
           }
           
           
           System.out.println(" ");
        }
        for(int k=0;k<m;k++){
            for(int j=k;j>=0;j--){
                System.out.print(" ");
            }for(int j=m-k;j>0;j--){
                System.out.print("*");
            }for(int j=0;j<m-k-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
