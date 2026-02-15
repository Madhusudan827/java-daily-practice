import java.util.*;
public class array2d {
    public static void Print(int n[][]){
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
              System.out.print(n[i][j]+" ");
            }
            System.out.println(" ");
            
        }

    }
    //2.sum of array
    public static void sum(int n[][]){
        int sum=0;
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                sum+=n[i][j];
               

            }
            
        }
       System.out.println();
    }
    // largest and small
    public static void largestAndSmallest(int n[][]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                if(largest<n[i][j]){
                    largest=n[i][j];
                }
                if(smallest>n[i][j]){
                    smallest=n[i][j];
                }
            }
        }
        System.out.format("largest is %d and smallest is %d",largest,smallest);
    }
    //3.row wise sum
    public static void rsum(int n[][]){
        Print(n);
        int sum=0;
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                sum+=n[i][j];
             

            }
            System.out.println(sum);
            sum=0;
        }
       System.out.println();
    }
    //4.sum of diagonal
    public static void diagonal(int n[][]){
        Print(n);
        int  ds=0;
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                if(i==j){
                    ds+=n[i][j];
                }
            }
           
        }
         System.out.println("d_sum"+ds);
    }
    //5.transpose
    public static void transpose(int n[][]){
        Print(n);
        for(int j=0;j<n[0].length;j++){
            for(int i=0;i<n.length;i++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println("");
        }
    }
    //6.sum OF two matrics
    public static void sumOfmatrix(int a[][],int b[][]){
        int c[][]=new int [3][3];
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
            for(int k=0;k<c[i].length;k++){
               System.out.print(c[i][k]+" "); 
            }
            System.out.println();

        }
    }    
        //7.reverse diagonal sum
    public static void revDiaSum(int a[][]){
            int sum=0;
            int n=a.length-1;
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    if(i+j==n){
                        sum+=a[i][j];
                    }

                }
            }
            System.out.println("Sum ="+sum);
    }
    //8.column wise sum
    public static void colSum(int a[][]){
        int colS=0;
        for(int j=0;j<a[0].length;j++){
            for(int i=0;i<a.length;i++){
                colS+=a[i][j];
            }
            
            System.out.println("colum("+j+")"+colS);
            colS=0;
            
        }
        System.out.println();
    }



    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int n=a.length,m=a[0].length;
        System.out.println("enter a elemets");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        // int b[][]=new int[3][3];
        // int k=b.length ,l=b[0].length;
        // System.out.println("enter b elements");
        // for(int i=0;i<k;i++){
        //     for(int j=0;j<l;j++){
        //         b[i][j]=sc.nextInt();
        //     }
        // }
        colSum(a);

        
 
    }
}
