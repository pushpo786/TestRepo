package controlFlow;

public class Conditionals {


    public static void main(String[] args) {

        int quarter=25;
        int dime=10;
        int nickle=5;
        int penny=1;
        if(quarter>dime){
            System.out.println("quarter is greater than dime");
        }else if(dime>penny){
            System.out.println("dime is greater than penny");
        }else if(quarter>nickle){
            System.out.println("quarter is greater than nickle");
        }else{
            System.out.println("None of the conditions are met");
        }
        //we start the conditional using "if (condition) {}, for multi
    }
}
