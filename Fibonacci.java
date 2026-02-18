public class Fibonacci {
    //fibonnaci number of a number
    public static  int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int f1=0;
        int f2=1;
        for(int i=2;i<=n;i++){
            int f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f2;
    } 
    // find fibonacci from 1 to n. 
     public static void printnto1(int num){
        for(int i=1;i<=num;i++){
              System.out.println(fibonacci(i));
        }
        
     }  
        
     

    public static void main(String args[]){
     printnto1(9);
    }
}
