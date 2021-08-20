package mentoringPractice;

public class TravelPlan {
    public static void main(String[] args) {
        travelExpense();
        shopping(200,300);
        outingCost();


    }
    public static void travelExpense() {
        int airfare = 1400;
        int hotelfare = 800;
        int foodcost = 700;
        int totalcost= airfare + hotelfare + foodcost;
        System.out.println(" this is my initial cost: "+totalcost);
    }


    public static void shopping(int nonessential, int essential) {

        int shopping= essential-nonessential;
        System.out.println(" only can effort essential "+shopping);

    }

    public static int outingCost(){
        int taxi=300;
        int siteseeingfee=200;
        int totalcost=taxi+siteseeingfee;
        System.out.println(" Love to roaming around but costly "+totalcost );
        return totalcost;
    }


}


