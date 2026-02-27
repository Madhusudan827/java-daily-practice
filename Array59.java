import java.util.Arrays;
public class Array59 {
  public static void frequencyofArray(int []n){
       for(int i=0;i<n.length;i++){
         boolean alreadyseen=false;
         for(int j=0;j<i;j++){
            if(n[i]==n[j]){
                alreadyseen=true;
                break;
            }
         }
         if(alreadyseen){
            continue;
         }
         int count=0;
         for(int j=i;j<n.length;j++){
          
             if(n[i]==n[j]){
                 count++;
             }
         }
         System.out.println(n[i]+"="+count);
       }
     }
    
   
  public static void main(String args[]){
    int []n={2,1,2,3};
    frequencyofArray(n);
  }

}