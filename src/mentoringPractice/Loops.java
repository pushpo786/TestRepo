package mentoringPractice;

public class Loops {
    public static void main(String[] args) {
        //For Loops

       // int i=10;
       /* for(i=10; i>0; i--){
            System.out.println(i);
        }
         for each loops using for
        int [] myintarray={1,2,3,4,5,6,7,8,9,10};
        for(int i:myintarray){
            System.out.println(i);

            String []word={"Hello World"};
            for(String phrase:word){
                System.out.println("word");
            }
        }
        //While loops
        int x=10;
        int y=15;
        while(x<=y){
            if(x!=y){
                System.out.println(x +" is less than "+y);
            }else{
                System.out.println(x + "is equal "+y);
            }
            x++;
        }*/

        //Do Whole loop
        int quizmarks=13;
        int homeworkmarks=19;
        do {
            quizmarks++;
            System.out.println("the value of quiz is: " +quizmarks);
        }while(quizmarks>homeworkmarks);



    }

}
