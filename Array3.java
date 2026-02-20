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
    public static void main(String args[]){
        int []n={1,2,3,4,5};
        System.out.println("min:"+largestandSmallest(n));
        System.out.println("sum of array="+sumofArray(n));
        System.out.println("Average of array="+averageofArray(n));
        
    }
}
