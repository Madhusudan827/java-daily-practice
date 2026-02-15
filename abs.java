interface Property{
    void sound();
    void sleep();
} 
abstract class Animal implements Property{
    public abstract void sound();
   public void sleep(){
        System.out.println("animal is sleeping");
    }
}
class Dog extends Animal{
  public void sound(){
        System.out.println("dog barks");
        }
}
public class abs {
    public static void main(String args[]){
        Property a = new Dog();
        a.sound();
        a.sleep();
    }
}
