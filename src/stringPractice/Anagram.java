package stringPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        isAnagram("RAFT","FART");
        isAnagram("CAT","ACT");
    }
    public static void isAnagram(String st1,String st2){
        String s1=st1.replaceAll("\\s","");
        String s2=st2.replaceAll("\\s","");
        boolean result=true;
        if (s1.equals(s2)){
            result=false;
        }else{
            char[] Arrays1=s1.toLowerCase().toCharArray();
            char[] Arrays2=s2.toLowerCase().toCharArray();
            Arrays.sort(Arrays1);
            Arrays.sort(Arrays2);
        }

        if (result){
            System.out.println(s1+ " and "+s2+" are anagrams");
        }else{
            System.out.println(s1+ " and "+s2+" are not anagrams");
        }
    }


}
