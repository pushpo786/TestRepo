package allLoops;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int [] myIntArray={1,2,3,4,5,6,7,8,9,10,11,12};
        String [] phraseArray={"plus"};

        for(int i: myIntArray){
            System.out.println(i);

            for(String word: phraseArray){
                System.out.println(word);
            }
        }
    }

}
