import java.util.Scanner;
public class Lcm{
   public static void main(String args []){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int a=sc.nextInt();
      System.out.println("enter b value");
      int b=sc.nextInt();
      int max=(a>b)?a:b;
      while(true){
         if(max%a==0 && max%b==0){
            System.out.println(max);
            break;
         }
         max++;
      }
   }
}