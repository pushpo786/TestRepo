package inheritance;

public class DriverAnimalInheritance {
    public static void main(String[] args) {
        Cat cat=new Cat(4,"catFood",false,"Brown");
        BengalCat bengalCat=new BengalCat(4, "dry cat food",false,"Brown","leopard");

        System.out.println("Cat has " + cat.getNoOfLegs() + "legs");
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat is vegetarian? " + cat.isVegetarian());
        System.out.println("Cat color is "+ cat.getColor());
        System.out.println("Bengal cat eats " + bengalCat.getEats());
        System.out.println("Bengal cat looks " + bengalCat.getLooks());
    }
}
