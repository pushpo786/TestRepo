package basics;

public class ForEachLoop {
    public static void main(String[] args) {
        int [] myIntArray = {1,4,6,8,9,3,2,7,0,11};
        String[] phraseArray={"plus"};

        for(int x : myIntArray) {
            System.out.println(x);

            for (String word : phraseArray) {
                System.out.println(word);
            }
        }

    }
}
