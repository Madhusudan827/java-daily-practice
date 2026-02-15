import java.util.*;
public class Arrays{
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    //2.linear Search
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
     }
     //3.largest and Smallest
     public static int LargAndsmall(int n[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<n.length;i++){
            if(n[i]>largest){
                largest=n[i];
            }
            if(n[i]<smallest){
                smallest=n[i];
            }
        }
         System.out.println(smallest);
        return largest;
    }
    //4.binarySearch
    public static void binarySearch(int num[],int div){
        int thershold=6;
        int sum=0;
        for(int i=0;i<num.length;i++){
            int h=num[i]/div;
            if(num[i]%div!=0){
                h++;
            }
            sum+=h;
        }
        if(sum<=thershold){
            System.out.print("done");
        }
        else{
            System.out.println("not done");
        }
    }
    //5.reverse of an array
    public static void reverseArray(int n[]){
        int m[]=new int[n.length];
        int j=0;
        for(int i=n.length-1;i>=0;i--){
            m[j]=n[i];
            j++;
        }
        for(int k=0;k<m.length;k++){
            System.out.print(m[k]+" "); 
        }
        System.out.println("");
        System.out.print(m.length+"\n"+n.length);                                                                                                                  
     }
     //6.2nd method Reverse
     public static void reverse(int n[]){
        int first=0,last=n.length-1;
        while(first<last){
            int temp=n[first];
            n[first]=n[last];
            n[last]=temp;
            first++;
            last--;
        }
    }
    //7.pairs in an Array
    public static void pairsArray(int n[]){
        for(int i=0;i<n.length;i++){
            int sum=n[i];
            for(int j=i+1;j<n.length;j++){
                sum+=n[j];
                System.out.print("("+n[i]+","+n[j]+"sum"+"="+sum +")");
               
            }
           System.out.println("");
        }
        
    }
    //8.subArray
    public static void subArray(int num[]){
        int ts=0;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=1;j<num.length;j++){
             int end=j;
             for(int k=start;k<=end;k++){
                System.out.print(num[k]+"   ");
             }
             System.out.println(" ");
             ts++;

            }
            System.out.println(" ");
        }
        System.out.println(ts);
    }
    public static void main(String args[]){
            int num[]={2,4,6,8,10};
            pairsArray(num);
            
            
            
          
    }
}