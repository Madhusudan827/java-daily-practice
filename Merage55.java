import java.util.Arrays;
public class Merage55 {
   public static void merage(int []n,int[]m){
    int k=n.length+m.length;
    int []z=new int[k];
    int j=0;
     System.out.println(z.length);
     for(int i=0;i<z.length;i++){
        if(i<n.length){
            z[i]=n[i];
        }else if(i>=m.length){
            
            z[i]=m[j];
            j++;
        }
     }
     Arrays.sort(z);
     System.out.println(Arrays.toString(z));
   }  
   public static void main(String args[]){
      int []n={1,2};
      int []m={5,4};
      merage(n,m);
   }
}
