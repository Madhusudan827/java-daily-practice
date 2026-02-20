public class Count{
    public  static int countsWords(String str){
       String[] words=str.split("\\s+");
       return words.length;
    }
    public static void main(String[] args) {
        System.out.println(countsWords("my name  is  madhu . i am a student"));
    }
}
