import java.util.*;

class StudentMarksAnalysis{
  public void marks(){
  int marks[]={78,85,66,92,70};
  String name[]={"Raju","Sita","Aman","Neha","Kiran"};
   int max=Integer.MIN_VALUE;
   int min=Integer.MAX_VALUE;
   int max_index=0;
   int min_index=0;
   double sum=0;
  for(int i=0;i<marks.length;i++){
      sum+=marks[i];
       if(marks[i]>max){
        max=marks[i];
        max_index=i;
        }
        if(marks[i]<min){
          min=marks[i];
          min_index=i;
        }

  }
  System.out.printf("Highest Marks: %s- %d%n",name[max_index],max);
  System.out.printf("Lowest Marks: %s- %d%n",name[min_index],min);
  System.out.println("Average Marks: "+(double) (sum)/marks.length);
}

}


public class bat {
  public static void main(String args []){
    
       Scanner sc=new Scanner(System.in);
       String a=sc.nextLine();
       String b=sc.nextLine();
       System.out.println(a.sort());
    }
}

  