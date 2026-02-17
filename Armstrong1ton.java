public class Armstrong1ton {
    public static int  armstrong(int n){
        String s=Integer.toString(n);
        int len=s.length();
        int sum=0;
        for(int i=0;i<len;i++){
           int k=s.charAt(i)-'0';
           sum+=(int)Math.pow(k,len);
        }
        return sum;
    }
    public static int armstrong2(int n){
        String s=Integer.toString(n);
        int sum=0;
        int len=s.length();
         while(n>0){
          int temp=n%10;
          sum+=(int) Math.pow(temp,len);
           n=n/10;
        }
        return sum;
    } 
    public static void print1ton(int n){
        for(int j=1;j<=n;j++){
           if(armstrong2(j)==j){
               System.out.println(j+"is Armstrong number");
           }else{
            System.out.println(j+"not Armstrong number");
           }
            
        }
    }
    public static void main(String args[]){
          print1ton(10);
    }
}
