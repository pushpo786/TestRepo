import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        String fullName=getFullName();
        System.out.println(fullName);

    }
    public static String getFullName(){
        String fullName="";
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName= scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName=scanner.nextLine();

        fullName=(firstName +" "+ lastName);

        return fullName;


    }
}
