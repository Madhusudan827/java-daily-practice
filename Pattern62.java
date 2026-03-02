public class Pattern62 {
   
   public static void inRtriangle(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
   } 
   public static void inLtriangle(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<n-i;j++){
           System.out.print("*");
        }
        System.out.println("");
    }
   }
    
   public static void main(String[] args) {
    
    inLtriangle(6);
   }  
}
