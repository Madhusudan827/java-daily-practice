class Parent {
    int x=10;
    Parent(){

    }
    Parent(int x){
        System.out.println("parent class");
    }
}
class Child extends Parent {
    int x=20;
    Child(){
        
        super(45);
         System.out.println("child class");
        
    }
}

public class HackerRank {
    public static void main(String[] args) {
      Parent s= new Child();
       
    }
}
