interface A{
  void run();//what to do
  static void b(){
    System.out.println("hello world");
  }
  default void n(){
    System.out.println("hii");
  }
}
class Details implements A{
   public  void run(){ //how to do
    System.out.println("do running fast");
   }
  
}


public class OOPS5{
  public static void main(String args[]){
   A d=new Details();
    d.run();


    
  }
}

