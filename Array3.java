import java.util.Arrays;
public class Array3 {
    public static int largestandSmallest(int [] n){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int len=n.length;
        for(int i=0;i<len;i++){
            if(max<=n[i]){
                max=n[i];
            }
            if(min>=n[i]){
                min=n[i];
            }
        }
        System.out.println("max:"+max);
        return min;
    }
    public static int  sumofArray(int []n){
        int len=n.length;
        int sum=0;
        int i=0;
        while(len>i){
              
                sum=sum+n[i];
               
                
             
              i++;
        }
       return sum;   
        
    }
    public static double  averageofArray(int [] n){
        int len=n.length;
        double average=sumofArray(n)/len;
        return average;

    }
    public static void reverseofArray(int [] ar){
       int i=0;
       int j=ar.length-1;
      
      
       while(i<j){
           //Swap condition
             int temp=ar[i];
             ar[i]=ar[j];
             ar[j]=temp;
             i++;
             j--;
        }
       for(int k=0;k<ar.length;k++){
        System.out.println(ar[k]);
       }
    }
    public static void duplicteElements(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i])==arr[j]){

                    System.out.print(arr[j]+" ");
                    break;
                }
            }
        }
        
    }
    public static void ascendingArray(int []arr){
      
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                   arr[i]=arr[i]+arr[j];
                  arr[j]=arr[i]-arr[j];
                  arr[i]=arr[i]-arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[]){
        int []n={100003,234567,678899,654221,999999,1};
        // System.out.println("min:"+largestandSmallest(n));
        // System.out.println("sum of array="+sumofArray(n));
        // System.out.println("Average of array="+averageofArray(n));
       // reverseofArray(n);
        //duplicteElements(n);
       ascendingArray(n);
        
    }
}
