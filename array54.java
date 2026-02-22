public class array54 {
    public static int searchKey(int []n,int key){
       int i=0;
       while(i<n.length){
            if(n[i]==key){
                return i;
            }
            i++;
       }
       return -1;
    }
    //using recursion
    public static int searchKey(int []n,int key,int i){
        if(i==n.length){
            return -1;
        }
        if(n[i]==key){
            return i;
        }
      return  searchKey(n,key,i+1);
      
    }
    public static void main(String args[]){
        int [] n={3,4,6,9,7};
        System.out.println(searchKey(n,7,0));
    }

}
