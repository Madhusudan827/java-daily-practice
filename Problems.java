import java.util.*;

class Problem{
    //1.
  public int Sum(int a,int b){
    int sum=a+b;
    return sum;
  }
  //2.
  public int difference(int a,int b){
    int substract=a-b;
    return substract;
  }
  //3.
  public double product(int a,int b){
    int multiplication=a*b;
    return multiplication;
  }
  //4.
  public double Remainder(int a,int b){
    double remainder=a%b;
    return remainder;
  }
  //5.
  public double Quotient(int a,int b){
    double quotient =a/b;
    return quotient;
  }
  //6.
   void swap(int a,int b){
    int temp=0;
     temp=a;
     a=b;
     b=temp;
     System.out.println("a="+a);
     System.out.println("b="+b);
   }
   //7.even or odd.
   public void check(int a){
    System.out.println(a%2==0 ? a+" is even":a+" is odd");
   }
   //8.largest of two numbers
   public String Largest(int a,int b){
     String largest=(a>b)? a+"is largest":b+"is largest";
      return largest;
    }
    //9.largest of three numbers.
    public void Largestof3(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("a:"+a);
            
        }
        else if(b>a && b>c){
        System.out.println("b:"+b);
        }
        else if(c>a && c>b){
            System.out.println("c:"+c);
        }
        else{
        System.out.print(a+":"+"all are equal");
         }
    }
    //11. Check if a number is divisible by 5.
    public void divisibleof5(int a){
        if(a%5==0){
            System.out.println(a+" is divisible by 5");
        }
        else{
          System.out.println(a+" is not divisible by 5");
        }
    }

  //12. Check if a number is divisible by 2 and 3.
   public void divi(int a){
      if(a%2==0 && a%3==0){
        System.out.println(a+"is divisible by 3 and 2");
      }
      else if(a%2==0){
        System.out.println(a+"is divisible by 2");
      }
      else if(a%3==0){
        System.out.println(a+"is divisible by 3");
      }
      else{
        System.out.println("not divisible ");
      }
    }
  //13.convert celsius to fahrenheit.
    public void Fahrenheit(int c){
      double div=1.8;
      double fahrenheit=div*c+32;
      System.out.println("fahrenheit ="+(int)fahrenheit+"°f");
    }
  //14.convert  fahrenheit to celsius.
    public void Celsius(int f){
      double div=0.556;
      double celsius=div*(f-32);
      System.out.println("celsius ="+(int)celsius+"°c");
    }
    //15.find the area of rectangle
    public void AreaofRec(int l,int w){
      int area=l*w;
      System.out.println("area of rectangle :"+area);
    }
    //16.find the area of circle.
    public void Areaofcir(double r){
      double area=3.14*Math.pow(r,2);
      System.out.println("area of circle:"+area);
    }
    //17.simple interest
    public  void interestCalculator(int p,int r,int t){
      int principle_amount=p;
      int rate=r;
      int time=t;
      double simple_interest=(principle_amount*rate*time)/100;
      double total_amount=principle_amount+simple_interest;
      System.out.println("interest:"+simple_interest);
      System.out.println("total amount:"+total_amount);
    }
    //18.finding compund interest
    public void compundInterest(int p,double r,int t){
      int principal=p;
      double rate=r;
      int time=t;
      double amount=principal*Math.pow(1+rate/100.0,t);
      double compoundInterest=amount-principal;
      System.out.println((int)compoundInterest); 
    }
    //19.Check if a year is a leap year
    public void leapYear(int year){
      if(year%400==0){
        System.out.println(year+" is leap year");
      }
      else if(year%4==0 && year%100!=0){
        System.out.println(year+" is leap year");
      }
      else{
        System.out.println(year+" is not leap year");
      }

    }
    //21.check if a character is a vowel or consonat
    public void characterType(char c){
      c=Character.toLowerCase(c);
      if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
        System.out.println(c+" is vowel letter.");
      }else if(c>='a' && c<='z'){
        System.out.println(c+" is consonant letter.");
      }else {
        System.out.println(c+ " is not a letter");
      }
    }
    //22.find the ASCII value of a character
    public void ascii(char c){
      int Value=c;
      System.out.println(" ASCII value of "+c+" is "+ Value);
    }
    //23.square of a number
    public void sqrt(int n){ 
      double number=Math.sqrt(n);
      System.out.println("Square Root of a Number = "+number);
    }
    //26.sum of n natural numbers
    public void sumOfNatural(int n){
      int i=1;
      int sum=0;
      while(i<=n){
         sum+=i;
         i++;
      }System.out.println(sum);

  }
    //27.sum of n even numbers
    public void sum(int n){
      
      int even=0;
      int odd=0;
       for(int i=1;i<=n;i++){
        if(i%2==0){
          even+=i;
        }  
        else{
          odd+=i;
        }
      }
       System.out.println("Total sum of even numbers = "+even);
       System.out.println("Total sum of odd numbers = "+odd);
  }
  //28.sum of prime
  public boolean  ISprime(int n){
       boolean isPrime=true;
       if(n<=1){
        isPrime=false;
      }
      for(int i=2 ;i<=(int)Math.sqrt(n);i++){
        if(n%i==0){
           isPrime=false;
           break;
        }
      }
      return isPrime;
    }
  public void sumOfprime(int n){
    int sum=0;
     for(int i=2;i<=n;i++){
      boolean check=ISprime(i);
    if(check){
      sum+=i;
     }
    }
     System.out.println(sum); 
   }
   //29.factorial
   public int factorial(int n){
    int fact=1;
    
    while(n>1){
      fact*=n;
     
      n--;
    }
    return fact;
   }
  //30. Generate multiplication table of a number.
   public void table(int m){
    for(int i=1;i<=10;i++){
      System.out.println(m+"x"+i+"="+m*i);
    }
   }
   //31.Reverse a number
   public int num(int n){
      int lastDigit=0;
      int rev_num=0;
       while(n>0){
         lastDigit=n%10;
        n=n/10;
        rev_num=lastDigit+rev_num*10;
      }
      return rev_num;
    }
    //32.sum of digit
    public int  sumOfdigit(int n){
    int sum=0;
    while(n>0){
      int lastDigit=n%10;
      n=n/10;
      sum+=lastDigit;

    }return sum;
  }
    //33.Check if a number is palindrome.
    public void palindrome(String n){
     String name=n;
     int temp=0;
     int first=0;
     int lastDigit=name.length()-1;
     while(first<lastDigit){
       if(name.charAt(first)!=name.charAt(lastDigit)){
           temp=1;
           break;
       }
       lastDigit--;
       first++;
     }
     if(temp==1){
      System.out.println("not palindrome");
     }else{
      System.out.println("palindrome");
     }

     
     }
     public boolean p(int n){
      for(int i=2;i<(int)Math.sqrt(n);i++){
        if(n%i==0){
          return false;
        }
      }
      return true;
     }
    }
  
    
    public  class Problems{
    public static void main(String[] args){
       Problem problem=new Problem();
       Scanner sc=new Scanner(System.in);
       
       System.out.println(problem.p(36));

        }
}
