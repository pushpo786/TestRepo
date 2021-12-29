package inheritance;

public class BengalCat extends Cat{

   private String Looks;

    public BengalCat(int noOfLegs, String eats, boolean vegetarian, String color,String looks) {
        super(noOfLegs, eats, vegetarian, color);
        this.Looks="Leopard";
    }

    public String getLooks() {
        return Looks;
    }

    public void setLooks(String looks) {
        Looks = looks;


    }
}
