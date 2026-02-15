import java.util.*;
class Data{
  private int id;
  private  String item;
  private  int price;
  Data(int id,String itm,int price){
    this.id=id;
    this.item=itm;
    this.price=price;
  }
  String getitem(){
    return this.item;
  }
  int getid(){
    return this.id;
  }
  int getPrice(){
    return this.price;
  
  }

}
class List {
    Data d1=new Data(1,"chicken 65",250);
    Data d2=new Data(2,"Chicken Lollipop",200);
    Data d3=new Data(3,"Chilli Chicken",350);
    Data d4=new Data(4,"Fish Fry ",470);
    Data d5=new Data(5,"Mutton Pepper Fry",1000);
    


  }

class Store extends List{
    List l=new List();
    void storing(int i){
    int leng=i;
    System.out.println(i);
    String itemsList []=new String[leng];
  
  }
}

class Menu{
  void menu(){
    System.out.println("1. Chicken 65        - ₹250");
    System.out.println("2. Chicken Lollipop  - ₹200");
    System.out.println("3. Chilli Chicken    - ₹350");
    System.out.println("4. Fish Fry          - ₹470");
    System.out.println("5. Mutton Pepper Fry - ₹1000");
  }
}

public class Hotel{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
    List L=new List(); //list class object created.
    Menu M=new Menu();//Menu class object created.
    Store s=new Store();// store class object created. 
    int len=0;
     M.menu();
    System.out.println("enter dish");
    while(true){
      String item=sc.nextLine();
      if(item.equalsIgnoreCase("stop")){
       break;
      }
      else{
       
        len++;
        
      }
    }
    s.storing(len);

  }
}