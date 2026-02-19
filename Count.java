public class Count{
    public static void count(String s){
        int len=s.length();
        int vowels=0;
        int consonents=0;
        int digits=0;
        int others=0;
        for(int i=0;i<len;i++){
            char k=s.charAt(i);
            if(k>='a' && k<='z'){
                
               if(k=='a'|k=='e'|k=='o'|k=='i'|k=='u'){
                vowels+=1;
              }else {
                consonents++;
               }
            
            }else if(k>='0' && k<='9')
              {
               digits ++;
            }else {
                others++;
            }
            
        }
        System.out.println("consonents:"+consonents);
          System.out.println("digits:"+digits);
        System.out.println("vowels:"+vowels);
        System.out.println("others:"+others);
    }
    public static void main(String args[]){
           count("word1202#@$%");
    }
}