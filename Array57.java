public class Array57 {
 

  public static  void secondLargest(int [] a){
    int len=a.length;
    int firstMax=Integer.MIN_VALUE;
    int secondMax=Integer.MIN_VALUE;
    int firstMin=Integer.MAX_VALUE;
    int secondMin=Integer.MAX_VALUE;
    
    for(int i=0;i<len;i++){
      if(a[i]>firstMax){
         firstMax=a[i];
      }
      if(a[i]<firstMin){
          firstMin=a[i];
      }
      
    }for(int i=0;i<len;i++){
        if(a[i]<firstMax && a[i]>firstMin && a[i]>secondMax){
         secondMax=a[i];
      }
       if(a[i]<firstMax && a[i]>firstMin && a[i]<secondMin){
           secondMin=a[i];
       }
        
    }
    System.out.println("firstMax="+firstMax);
    if(secondMax==Integer.MIN_VALUE){ 
    System.out.println("no second max"); 
    }else{ 
        System.out.println("secondMax="+secondMax); 
    } 
    System.out.println("firstMin="+firstMin); 
    if(secondMin==Integer.MAX_VALUE)
        { System.out.println("no second min"); 

        }
    else{ System.out.println("secondMin="+secondMin); 

      } 
    }
  public static void main(String args[]){
    int []n={1,2};
    secondLargest(n);
  }

} 

 


