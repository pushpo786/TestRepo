package stringPractice;

public class PalindromeWithLoops {
    public static void main(String[] args) {
        String st="MOM";
        String st1="";
        for (int i=st.length()-1;i>=0;i--){
            st+=st.charAt(i);
        }
        if (st.equals(st1)){
            System.out.println("This is Palindrome");
        }else{
            System.out.println("This is not Palindrome");
        }
    }
}
