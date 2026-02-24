import java.util.Arrays;
public class array58 {
   public static void rotateKelement(int []n,int k){
    int len=n.length;
    int []cutPiece=Arrays.copyOf(n,k);
    int intial=0;
    int [] n1=new int[n.length-k];
     for(int i=k;i<n.length;i++){
          n1[intial]=n[i];
          intial++; 
     }
     int b=0;
     int []newArray=new int[n1.length+cutPiece.length];
      for(int j=0;j<newArray.length;j++){
         if(j<n1.length){
            newArray[j]=n1[j];
         }else{
            newArray[j]=cutPiece[b];
            b++;
        
         }
      }
     System.out.println(Arrays.toString(newArray));
   } 
   public static void main(String[] args) {
     int []n={1,2};
     rotateKelement(n,1);
   }
}
