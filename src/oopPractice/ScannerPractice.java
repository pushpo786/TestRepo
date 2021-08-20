package oopPractice;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        int[] sampleArray={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number:");

        int enteredNum=scanner.nextInt();

        for(int x: sampleArray){
            if (enteredNum==x){
                System.out.println(enteredNum + " is a match for value");
            }
        }

    }
}
