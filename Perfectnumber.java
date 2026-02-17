public class Perfectnumber {
    public void checkPN(int n){   //PN=Perfect Number
        int sum=0;              
         for(int i=1;i<=n/2;i++){
            if(n%i==0){
                   sum+=i;
            }
        }
        if(sum==n){
            System.out.println(n+"is Perfect Number");
        }
        else{
            System.out.println(n+"is not Perfect Number");
        }

    }
    public static void main(String args []){
        Perfectnumber obj=new Perfectnumber();
            obj.checkPN(28);
    }
}
