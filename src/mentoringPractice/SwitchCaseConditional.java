package mentoringPractice;

public class SwitchCaseConditional {
    public static void main(String[] args) {
        String animal="Tiger";
        switch (animal){
            case "Cat":
                System.out.println("Cat lovers loves meowing sound");
                break;
            case "Dog":
                System.out.println("Dog barking like crazy when seeing unknown person");
                break;
            case "Cow":
                System.out.println("Cows meats are so good to eat");
                break;
            case "Monkey":
                System.out.println("Monkey's are so intelligent ");
                break;
            default:
                System.out.println("results are not expected");
        }
    }
}
