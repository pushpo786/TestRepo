package inheritance;

public class Cat extends Animal{

    private String color;


    public Cat(int noOfLegs, String eats, boolean vegetarian, String color){
        super(noOfLegs, eats, vegetarian);
        this.color="white";


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

