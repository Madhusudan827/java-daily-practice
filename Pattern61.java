public class Pattern61 {
    public static void square(int n,int k){
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                System.out.print("*"+" ");
            }
            System.out.println("\n");
        }
    }
    //second type
    public static void square1(int n,int k){
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                if(i==0 | j==0 | i==n-1| j==n-1){
                System.out.print("*"+"");
                }else{
                    System.out.print(" "+"");
                }
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
   
    

    public static void main(String args[]){
        square3(7,7);
    }
}
