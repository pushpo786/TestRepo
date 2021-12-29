package inheritance;

public class Animal {
    private int noOfLegs;
    private String eats;
    private boolean vegetarian;

    public Animal(int noOfLegs, String eats, boolean vegetarian) {
        this.noOfLegs = noOfLegs;
        this.eats = eats;
        this.vegetarian = vegetarian;
    }
        public int getNoOfLegs(){
            return noOfLegs;
        }
        public void setNoOfLegs(int noOfLegs){
            this.noOfLegs=noOfLegs;
        }
        public String getEats(){
            return eats;
        }
        public void setEats(String eats){
            this.eats=eats;
        }
        public boolean isVegetarian() {
        return vegetarian;
        }
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
}


