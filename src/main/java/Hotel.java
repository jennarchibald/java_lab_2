import java.util.ArrayList;

public class Hotel {

    private ArrayList<BedRoom> bedRooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;

    public Hotel(ArrayList<BedRoom> bedRooms, ArrayList<DiningRoom> diningRooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedRooms = bedRooms;
        this.diningRooms = diningRooms;
        this.conferenceRooms = conferenceRooms;
        this.bookings = new ArrayList<>();
    }

    public int bedRoomCount() {
        return bedRooms.size();
    }

    public int diningRoomCount() {
        return diningRooms.size();
    }

    public int conferenceRoomCount() {
        return conferenceRooms.size();
    }

    public void checkGuestIntoBedRoom(BedRoom bedRoom, Guest guest) {
            bedRoom.addGuest(guest);
    }

    public void checkGuestOutOfBedRoom(BedRoom bedRoom, Guest guest) {
        bedRoom.removeGuest(guest);
    }

    public void checkGuestIntoDiningRoom(DiningRoom diningRoom, Guest guest) {
        diningRoom.addGuest(guest);
    }

    public void checkGuestOutOfDiningRoom(DiningRoom diningRoom, Guest guest) {
        diningRoom.removeGuest(guest);
    }

    public void checkGuestIntoConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.addGuest(guest);
    }

    public void checkGuestOutOfConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.removeGuest(guest);
    }
}
