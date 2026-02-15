class Person {
    String name;
    int age;
    void speak(){
        System.out.println("person is speaking");
    }
}
class Student{
    String name;
    int roll_no;
    int marks;
}
class Bank{
    String holder;
  private  float amount=27000;
    double balance;
    void Balance(int n){
     this.amount=amount-n  ;

    }
    void add( int k){
        this.amount=amount+k;
    }
    double get(){
        return amount;
    }
}
public class O_pratice{
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="madhu";
        p1.age=47;
        System.out.println(p1.name+"\n"+p1.age);
        p1.speak();
        Student s1=new Student();
        s1.name="madhu";
        s1.roll_no=345;
        s1.marks=457;
        System.out.println(s1.name+"\n"+ s1.roll_no+"\n"+s1.marks);
        Bank b1=new Bank();
        b1.holder="madhu";
        //b1.Balance(1000);
       // System.out.println(b1.amount);
       // b1.Balance(6000);
        //System.out.println(b1.amount);
        b1.add(40000);
        System.out.println(b1.get());
        


}
}