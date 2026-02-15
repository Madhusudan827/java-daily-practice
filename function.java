public class function {
    //1.sum
    public static int Sum(int a,int b){
        int sum=a+b;
        //System.out.println(sum);
        return sum;
    }
    //2.multiply
    public static int Multipy(int a,int b){
        int mul=a*b;
        //System.out.println(mul);
        return mul;
    }
    //3.factorial
    public static int factorial(int n){
     int fact=n;
     int f=1;
     for(int i=1;i<=n;i++){
        f*=i;
       }
    return f;
    }  
    //4.binomial factorial
    public static int bino(int n,int r){
        //int n; //n!
        //int r;  //r!
        int f=1; 
        int R=1;  
        int y=n-r; //(n-r)!
        int g=1;
        
        for(int i=1;i<=n;i++){
            f*=i;
        }
        for(int j=1;j<=r;j++){
             R*=j;
        }
        for(int k=1;k<=y;k++){
            g*=k;
        }
       int ncr=f/(R*g);
       return ncr;
    }
    
    //5.prime or not
       public static boolean prime(int n){
        int number =n;
        boolean isprime=true;
       
        if(number<2){
            //System.out.println(check);
            isprime=false;
        }
        else{
              
            for(int i=2;i<=number-1;i++){
                if(number%i==0){
                    isprime=false;
                    break;
                }
        
        }
            
       } 

      // System.out.println(isprime);
        return isprime;     
    }
    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
         if(prime(i)){
            System.out.print(i+" ");
         }
        }
        return;
    }
    //binary to decimal
    public static int binaryTodec(int n){
        int binary=n;
        int decimal=0;
        int power=0;
        while(binary>0){
            int lastDigit=binary%10;
            decimal+=(lastDigit*(int)Math.pow(2,power));
            power++;
            binary=binary/10;

        }
       
        return decimal;
    }
    //decimal to binary
    public static void decTobin(int n){
        int decimal=n;
        int binary=0;
        int power=0;
        while(decimal>0){
             int rem=decimal%2;
            binary=binary+rem*((int)Math.pow(10,power));
            decimal=decimal/2;
            power++;
         
        }
        System.out.println(binary);
      
        
    }
    
    public static void main(String args []){
      decTobin(22);
      
    }

}