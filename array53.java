import java.util.Arrays;
public class array53 {
   public static void desecendingofArray(int []n){
    for(int i=0;i<n.length-1;i++){
        for(int j=i+1;j<n.length;j++){
            if(n[i]<n[j]){
                int temp=n[i];
                n[i]=n[j];
                n[j]=temp;
            }
        }
    }
    System.out.println(Arrays.toString(n));
   } 
   public static void main(String args[]){
      int[] n={1,4,5,8,5,1,3};  
    desecendingofArray(n);
   }
}


