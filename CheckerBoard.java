public class CheckerBoard{
     // method 1
     static void checkerBoard(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i%2!=0){
                     if(j%2!=0){
                        System.out.print("B");
                     }else{
                    System.out.print("W");
                }
                
                    
                }else{
                    if(j%2!=0){
                        System.out.print("W");
                    }else{
                        System.out.print("B");
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    //method 2
    static void checkerBoard2(int n){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if((i+j)%2==0){
                    System.out.print("B");
                }else{
                    System.out.print("W");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    //method3
    static void checkerBoard3(int n){
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                if((i+j)%2==0){
                    System.out.print("B");
                }else{
                    System.out.print("W");
                }
                j++;
                System.out.print(" ");
            }
            i++;
            System.out.println();
        }

    }
    
    public static void main(String[] args) {
        int n=5;
    // checkerBoard(n);
     checkerBoard3(n);
    }       
}