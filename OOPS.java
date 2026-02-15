import java.util.*;
class Student{
    String name; //property
    int marks;   //property
    void show(){
        System.out.println(name);
        System.out.println(marks);
    }
}
class Array{
      
      void evenOrnot(int n[][]){
        int even=0;
        int odd=0;
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                if(n[i][j]%2==0){
                   
                    even++;
                    
                  
                }
                else{
                  
                    odd++;
                    
                }
                  
            }
           
        }
        System.out.println("even="+even);
        System.out.println("odd="+odd);

      }
}
class Pen{
    private String color;
    private int tip;
    void setColor(String newcolor){
        this.color=newcolor;
    }
    void setTip(int newtip){
        this.tip=newtip;
    }
    String getColor(){
        return color;
    }


}
class StudentInfo{
    String name;
    int roll;
    int marks[];
   
    
    StudentInfo(int marks []){
        this.marks= marks;
    }
    StudentInfo(StudentInfo s2){
        this.marks=s2.marks;
    }
}
class Animal{
    void eat(){
        System.out.println("eats");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog is barking");
    }
}    
interface A{
    int b=56;
    void hi();
}
interface B{
    int f=45;
    void bye();
}
class C implements A,B{
         public void hi(){
            System.out.println("hi");
         }
         public void bye(){
            System.out.println("bye");
         }
         int j=f+b;
}
class g extends C{
    @Override
    public void hi(){
        System.out.println("joker");
    }

}

public class OOPS{
    public static void main(String[] args) {
         g k=new g();
         k.hi();
         k.bye(); 
         
         System.out.println(k.j);
    } 
         
    
}
