public class Armstrong {
    public void armstrong(String num){
        int len=num.length();
        int sum=0;
        for(int i=0;i<len;i++){
            int k=num.charAt(i)-'0';
            sum+=(int)Math.pow(k,len);

        }if(sum==Integer.parseInt(num)){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
    public static void main(String args[]){
        Armstrong a=new Armstrong();
        a.armstrong("153");
    } 
}
