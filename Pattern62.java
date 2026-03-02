public class Pattern62 {
   public static void rTriangle(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            if(j==0||i==n-1||i==j){
           
                System.out.print("*");
            }    
            else{
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }
   }
   public static void lTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }for(int j=1;j<=i;j++){
                if(j==1||i==n||i==j){
                 System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }
   } 
   public static void main(String[] args) {
     lTriangle(5); 
     rTriangle(5);
   }  
}
