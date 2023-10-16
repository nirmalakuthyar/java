import java.util.ArrayList;
import java.util.List;

public class N2 {

    public static void main(String[] args){
        System.out.println("This is a program for encoding");
        String s1="AAAAABBBB";
        System.out.println(s1);
        int len1=s1.length();
        List<String>list1=new ArrayList<>();
        list1.add("A");
        list1.add ("B");
        list1.add("C");
        List<String>list2=new ArrayList<>();
        list2.add("01");
        list2.add("02");
        list2.add("03");
        String s2="";
        String s3="";
        int position= 0;

        for (int i=0;i<len1;i++){
            s2=s1.substring(i,i+1);
            position = list1.indexOf(s2);
            s3=s3+list2.get(position);
        }
        System.out.println(s3);
    }

}
