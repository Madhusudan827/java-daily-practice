public class Palindrome {
    public static  void checkPalindrome(String n){
        String n2="";
        int len=n.length();
        for(int i=len-1;i>=0;i--){
            n2=n2+n.charAt(i);
        }
      
        if(n.equalsIgnoreCase(n2)){
          System.out.println("palindrome");
        }else{
            System.out.println("not Palindorme");
        }
    }
    public static void main(String args[]){
       checkPalindrome("madam"); 
    }
}
