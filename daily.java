import java.util.*;
// //public class daily{
//   //1.reverse..
//     public static void reverse(int n){
//              int num=n;
//              int rev=0;
//             while(n>0){
//               int k=n%10;
//                n=n/10;
//                int l=10*rev+k;

//                System.out.print(l);
//               }
//           return ;    
//       }
    
//     //2.fibonacci sequence
//     public static void Fibonacci(int n){
//       int num=n;
//       int f1=0;
//       int f2=1;
//       for(int i=1;i<=num;i++){
//          System.out.print(f1+" ");
//         int f=f1+f2;
//         f1=f2;
//         f2=f;
       
//       }
//       System.out.println();
//      // return f1;
//   }  
//  // 3.power of number without Math method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
//     public static int power(int b,int p ){
//       int base=b;
//       int power=p;
//       int n=1;
      
//       for(int i=1;i<=power;i++){
//        n=base*n;
//         //multiplaying number and it helps for finding power
//       }
//       return n;
//     }
//    // 4.sum of natural numbers
//    public static int sumOfNatural(int n){
//     int number=n;
//     int sum=0;
//     for(int i=1;i<=n;i++){
//       sum+=i;
//     }
//     return sum;
//    }
//   }

 interface lenovo{
     public void copy();
     public void paste();
     default void security(){
      System.out.println("hello");
      lenovo.sec();
     }
     static void sec(){
      
      System.out.println("bye");
      
     }
}
 
class hi implements lenovo{
   public void copy(){
    System.out.println("copy");
   }
   public void paste(){
    System.out.println("paste");
   }
  //  @Override
  //  public void security(){
  //   System.out.println("security");
  //  }
}
public class daily{
public static void main(String args []){
  hi obj=new hi();
  obj.copy();
  obj.paste();
  obj.security();
  
}

}