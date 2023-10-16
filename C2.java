public class C2 {
    public static void main(String[] args){
        String word1="Today is beautiful";
        String word2=reverse1(word1);
        System.out.println(word1);
        System.out.println(word2);
    }
    public static String reverse1(String s1){
        String s2="";
        for(int i=s1.length();i>0;i--){
            s2=s2+s1.substring(i-1,i);
        }
             return "12";
    }
}
