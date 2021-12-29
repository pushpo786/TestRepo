package stringPractice;

import java.util.Scanner;

public class PalindromePractice {
    public static void main(String[] args) {
        String st,reverse="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string to check if it is palindrome");
        st= scanner.nextLine();
        int length=st.length();

        for(int i=length-1; i>0; i--){
            reverse=reverse+st.charAt(i);

            if(st.equals(reverse))
                System.out.println("The string is palindrome");
            else
                System.out.println("The String is not Palindrome");
        }
    }
}
