import java.util.*;
// bank data like accountnumbers,accountHolder,amount.
class Data{
    int accountNumber[]={1102,1103,1104,1105,1106};
    String accountHolder[]={"suresh","ramu","simha","rani","veera"};
    int amount[]={2700,2300,5600,6755,2300};
}
class Details extends Data{ //extending  bank data .
    public int getindex(int No){
        
        int index=-1; //intilize index as -1.
        int len=accountNumber.length; //length of account number..
        for(int i=0;i<len;i++){
            if(No==accountNumber[i]){
                index=i;
                break;
            }
            else{
                index=-1;
            }
        }
        return index;
    }
    
    // bank name ..
    public void bankName(){
        System.out.println("     "+"___Welcome T0___"+"     ");
        System.out.println("    "+"____ECO Bank____"+"    ");
    }
    // Available Services  in bank.
    public void bankfeatures(){
        System.out.println("Available bank services");
          
           System.out.println(" "+"1.Account details");
           System.out.println(" "+"2.check Balance");
           System.out.println(" "+"3.deposit Money");
           System.out.println(" "+"4.withdraw Money");
           System.out.println(" "+"5.Exit");
        }
    public void sendoff(){
        System.out.println("----------Thank You----------");
       
    }    

} 
//serverice logics.
class Bankfeatures extends  Details{
    //Sevice type showing Account details.
   public void Accountdetails(int number){
        int accNum=getindex(number);
        if(accNum>-1){
        System.out.println("Account number:"+accountNumber[accNum]);
        System.out.println("Account Holder:"+accountHolder[accNum]);
        System.out.println("Current balance:"+"   Rs."+amount[accNum]);
       }
       else{
        System.out.println("account details not found........");
       }

    }
    //Sevice type showing balance.
    void checkBalance(int number){
        int accNum=getindex(number);
        if(accNum>-1){
    
        System.out.println("current balance"+"     Rs."+(double) amount[accNum]);
       }
       else{
        System.out.println("account details not found........");
       }


    }
    //Sevice type deposit Money.
    void depositMoney(int depositAmount,int accNum){
          int i=getindex(accNum);
          if(i!=-1){
            int B=amount[i]+=depositAmount;
             System.out.print("current balance :  "+"Rs."+B);
          }
          else{
              System.out.println("enter valid account number.");
          }
    }
    //Sevice type withdrawal money.
    void withdrawMoney(int accNum,int withdrawAmo){
           int i=getindex(accNum);
           if(i!=-1){
           if(amount[i]>=withdrawAmo){
              int currentBalance= amount[i]-withdrawAmo;
               System.out.println("withdrawal amount"+"        Rs."+withdrawAmo);
               System.out.println("currrent balance"+"         Rs."+(double)currentBalance );
           }
            else{
               System.out.println("Insuffient balance");
           }
        }
        else{
            System.out.println("enter valid account number.");
        }  

    }
}
public class banking {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     Details call= new Details();  //object created,
     Bankfeatures b1=new Bankfeatures(); //object created.
     
     while(true){
     
        call.bankName();
        call.bankfeatures();
        System.out.println("Select and Enter your option");
        
        
        int option=sc.nextInt();
        if(option==1){
            System.out.println("you selected:    "+"Account details");
            System.out.print("enter account  number: ");
            int number=sc.nextInt();
            b1.Accountdetails(number);
            call.sendoff();
            break;
        }
        else if (option==2){
                System.out.println("you selected:    "+"check Balance");
                System.out.print("enter account  number: ");
                int number=sc.nextInt();
                b1.checkBalance(number);
                call.sendoff();
            }
        else if(option==3){
            System.out.println("you selected:    "+"deposit Money");
            System.out.print("enter account  number: ");
            int number=sc.nextInt();
            b1.Accountdetails(number);

            System.out.print("enter deposit amount: ");
            int amount=sc.nextInt();
            if(amount>=0){
            b1.depositMoney(amount,number);
            call.sendoff();
            }
            else{
                System.out.println("entered wrong..");
            }
        } 
        else if(option==4){
            System.out.println("you selected:    "+"4.withdraw Money");
            System.out.print("enter account  number: ");
            int number=sc.nextInt();
            b1.Accountdetails(number);
            System.out.print("enter  withdrawal amount: ");
            int amount=sc.nextInt();
            b1.withdrawMoney(number,amount);
            call.sendoff();
        }
        else if(option==5){
             System.out.println("thanking you and visit again");
             break;
        }
           
           
        else if(option>4 || option<=0){
            System.out.println("entered wrong option..!");
        }
        
      }
   }
} 

