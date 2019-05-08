public class Booking {

    private BedRoom bedRoom;
    private int numberOfNights;
    private Guest guest;

    public Booking(BedRoom bedRoom, int numberOfNights, Guest guest) {
        this.bedRoom = bedRoom;
        this.numberOfNights = numberOfNights;
        this.guest = guest;
    }

    public BedRoom getBedRoom() {
        return bedRoom;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public Guest getGuest() {
        return guest;
    }
}
