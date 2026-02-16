import java.Scanner;

public class Gcd {
    //Method 1 to find gcd using for loop.
    public int gcd(int a,int b){
        int min=(a<b)?a:b;
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
             
            }

        }
        return 1;
    }
    //Method 2 to find gcd using euclidean method.
        public int gcd2(int a,int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
           
        }
        int gcd=(a!=0)?a:b;
        return gcd;
    }
    
    public static void main(String args []){
        Gcd g=new Gcd();
       
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt() ;
        
        

    }
}
