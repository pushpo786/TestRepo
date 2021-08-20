package controlFlow;

public class EvenNumber {
    public static void main(String[] args) {
        EvenNumber obj=new EvenNumber();
        obj.sortEvenNumber(1,100);
        //obj.sortOddNumber(1,100);

    }
    public void sortEvenNumber(int number1 , int number2){
        for (int i = number1; i<=number2; i++){
            if (i % 2 == 0 ){
                System.out.print(i+", ");
            }
        }
    }
    public void sortOddNumber(int number1, int number2) {
        for (int i = number1; i <= number2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }

    }


}
