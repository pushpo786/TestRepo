package composition;



public class Room {

    Bedroom bedroom;
    MasterBedroom masterBedroom;
    Guestroom guestroom;
    LivingRoom livingRoom;



    public Room(Bedroom bedroom, MasterBedroom masterBedroom, Guestroom guestroom, LivingRoom livingRoom){
        this.bedroom=bedroom;
        this.masterBedroom=masterBedroom;
        this.guestroom=guestroom;
        this.livingRoom=livingRoom;


    }
}
