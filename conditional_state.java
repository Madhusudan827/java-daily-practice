{check a number if it is even or odd} 
public class conditional_state{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("even");
        }   
        else{
            System.out.println("odd");
        }
     }    
}
     */
/*2.{palindrome or not}
public class conditional_state{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("pa");
        }
        else{
            System.out.println("np");
        }
    }

}*/
/*{palindrome or not}
public class conditional_state{
    public static void main(String args[]){
        String s="madkm";
        String h=(s.charAt(0) ==s.charAt(4) && s.charAt(1)==s.charAt(3))? "palindrome":"notpalindrome";
         System.out.println(h);     
       
    }
} */

/*3.check +ve or -ve,zero
public class conditional_state{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            System.out.println("+ve");
        }
        else if(a<0){
            System.out.println("-ve");
        }
        else if(a==0){
            System.out.println("zero");
        }
        else{
            System.out.print("not define");
        }
    }
}*/
/*4. leap year or not
public class conditional_state{
    public static void main(String args[]){
        int year=2024;
        if(year%4==0  && year%100!=0){
            System.out.println("leap year");
        }
        else if(year%400==0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not year");
        }
}
}*/
/*5.anagram or not
public class conditional_state{
    public static void main(String args[]){
        String n="listent";
        String k="slientt";
        char []x=n.toCharArray();
        char []y=k.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        if(Arrays.equals(x,y)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }    
} */
/*6.armstrong
public class conditional_state {
     public static void main(String args []){
        String n="20";
        int h=Integer.parseInt(n);
        int power=n.length();
        int sum=0;
        for(int i=0;i<=power-1;i++){
            int k=n.charAt(i)-'0';
            sum+=Math.pow(k,power);
                            
        } 
        System.out.println(sum);  
        if(sum==h){
            System.out.println("a");
        }  
        else{
            System.out.println("not a");
        }
    } 
    
}*/
public class conditional_state{
    public static void main(String args[]){
        int number=7;
        int factorial=1;
        for(int i=0;i<number;i++){
            
            factorial*=(number-i);
        }
        if(number>0){
        System.out.println(number+"factorial is "+factorial);
        }
        else{
            System.out.println(0);
        }

    }
}