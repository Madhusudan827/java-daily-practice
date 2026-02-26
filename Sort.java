import java.util.Arrays;
public class Sort {
    public static void bubbleSort(int []n){
        for(int i=0;i<n.length-1;i++){
            for(int j=0;j<n.length-1-i;j++){
                if(n[j]>n[j+1]){
                     int temp=n[j];
                     n[j]=n[j+1];
                     n[j+1]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(n));

    }
   
    }
    
    public static void main(String[] args) {
       int []n={5,4,6,2};
      selectionSort(n); 
    }
}
