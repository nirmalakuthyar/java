// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class N1 {
    public static void main(String[] args) {
       String word1="Hello World";
       System.out.println(word1);
       String word2=reverse(word1);
       System.out.println(word2);

    }
    public static String reverse(String input1){
        String s1=input1;
        int len1= s1.length();
        /* System.out.println(len1);*/
        String s2="";
        for(int i=len1;i>0;i--){
            s2=s2+(s1.substring(i-1,i));

        }
               return s2;
    }


}