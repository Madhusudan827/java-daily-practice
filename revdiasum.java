import java.util.Scanner;

public class revdiasum{
    public static void array(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                
            }
        }

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
    }
}
