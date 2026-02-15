import java.util.*;
interface AccountHolders{
    String names[]={"prakash","akash","ramu","chilk","somu"};  //account_holders
}
class AccountNumbers{
    int numbers[]={11034,11035,11036,11037,11038};//account numbers
}
interface AccountBalance{
    int balance[]={2300,4000,5000,6000,7000};//account numbers

}
class Display extends AccountNumbers implements AccountHolders,AccountBalance {
    public boolean display(int AccountNo){ //parameter is account number
           int account_number=AccountNo; //customer account  number stored
           int lenOfAccountNo=numbers.length-1; // extending from class AccountNumbers
           int Account_holder=0;
           int index=0;
           String name="";
           int amount=0;
           for(int i=0;i<=lenOfAccountNo;i++){
             if(account_number==numbers[i]){
              index=i;
              return true;
                
            }
        }
        return false;
    }
}
class checking extends Display{
    public void check(){
        System.out.println(index);
    }
}
    


public class project005{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Display customer=new Display();
        checking c=new checking();
        System.out.println("enter account number:");
        int Account_Number=sc.nextInt();
        customer.display(Account_Number);
        System.out.println(c.check());
    }
    
}
