import java.util.*;
public class Arrays1d {
    //1.read and print array
    public static void Array(int n[]){
        for(int i=1;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        
    }
    //2.sum of array
    public static int sumOfArray(int n[]){
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum+=n[i];
        }
        return sum;

    }
    //3.Average of array
    public static int average(int n[]){
       int sum=sumOfArray(n);
        int len=n.length;
        int Average=sum/len;
        return Average;
    }
    //3.largest of array
    public static int largest(int n[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<n.length;i++){
            if(largest<=n[i]){
                largest=n[i];
            }
            if(smallest>=n[i]){
                smallest=n[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
    //4.Count Even and odd Numbers
    public static int evenAndodd(int n[]){
        int even=0;
        int odd=0;
        for(int i=0;i<n.length;i++){
            if(n[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("even"+even);
        return odd;

    }
    //5.Count Positive, Negative, Zero
     public static int cpnz(int n[]){
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i=0;i<n.length;i++){
            if(n[i]>0){
                pos++;
            }
            else if(n[i]<0){
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.println("pos"+pos+"\n"+"neg"+neg);
        return zero;
    }
     //6.Copy One Array to Another
     public static void copy(int n []){
        int c[]=new int[n.length];
        for(int i=0;i<n.length;i++){
            c[i]=n[i];
        }
        for(int j=0;j<c.length;j++){
            System.out.print(c[j]+" ");
        }
        System.out.println(" ");

     }
     //7.reverse
     public static void reverse(int n[]){
        int first=0 ;
        int last=n.length-1;
        while(first<last){
            int temp=n[first];
            n[first]=n[last];
            n[last]=temp;
            first++;
            last--;
        }
        
     }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int array[] =new int[5];
        System.out.println("enter array");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }

        reverse(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+"");
        }
        System.out.println(" ");

        
    }
    
}
