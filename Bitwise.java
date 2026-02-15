public class Bitwise {
    //1.even or odd
    public void evenorodd(int n){
       int bitMask=1;
       if((n&bitMask)==0){
        System.out.println("even");
       }else{
        System.out.println("odd");
       } 
       
   }
   //ith bit
   public void ibit(int n,int i){
    if((n&1<<i)==0){
        System.out.println("0");
    }else{
        System.out.println("1");
    }
   }
   //set bit
   public int setbit(int n,int i){
    return (n|1<<i);
   }
   //clear ith bit
   public int  clearbit(int n,int i){
   
    int k=~(1<<i);
       return n&k;
   }
   //update ith bit
   public int  updateBit(int n,int i,int b){
    if(b==0){
      return clearbit(n,i);  
    }else{
        return setbit(n, i);
    }

   }
   //clear last ith bit
   public int clearLastbit(int n,int i){
     return (n&(~0<<i));
   }
   //Multiply a number by 2 using bit operation
   public int Multiply(int n){
    int mul=n<<1;
    return mul;
   }
   //Divide a number by 2 using bit operation
   public int divide(int n){
    return (n>>1);
   }
   //swap with out temp
   public void swap(int a,int b){
    b=a^b;
    a=b^a;
    b=b^a;
    System.out.println(a);
    System.out.println(b);
    }
    // Find the ith bit of a number
    public int getith(int n,int i){
     int bitMask=(1<<i);
     if((n&bitMask)==0){
        return 0;
     }else{
        return 1;
     }
    }
    // Set the ith bit of a number to 1
    public int setith(int n,int i){
        return (n|(1<<i));
    }
    //clear Range of bits
    public int clearRangeOfBits(int n,int i,int j){
      int a=(~0<<j+1);
      int b=(1<<i)-1;
      int bitMask=a|b;
     return bitMask&n;    
    }
    public boolean powerof2(int n){
        return (n&n-1)==0;
    }
    public int countSetsofBits(int n){
        int count1=0;
        int count2=0;
        int j=0;
        while(n>0){
            int bitMask=(1<<j);
            int leastCount=n&bitMask;
            if(leastCount==1){
                count1++;
            }else{
               count2++;
            }
            j++;
        }
        return count1;
    }
       public  static void main(String args []){
      Bitwise bit=new Bitwise();
    System.out.println(bit.countSetsofBits(7));
   }

}





// Set the ith bit of a number to 1

// Clear the ith bit of a number

// Toggle the ith bit of a number