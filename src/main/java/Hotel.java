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
    public int bookingsCount() {
        return bookings.size();
    }

    public void checkGuestIntoBedRoom(BedRoom bedRoom, Guest guest) {
        if (bedRoom.isVacant()){
            bedRoom.addGuest(guest);
        }
    }

    public void checkGuestOutOfBedRoom(BedRoom bedRoom, Guest guest) {
        bedRoom.removeGuest(guest);
    }

    public void checkGuestIntoDiningRoom(DiningRoom diningRoom, Guest guest, int numberInParty) {
        diningRoom.addGuest(guest, numberInParty);
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

    public Booking bookRoom(BedRoom bedRoom, Guest guest, int duration) {
        Booking booking = new Booking(bedRoom, duration, guest);
        bookings.add(booking);
        return booking;
    }

    public ArrayList<BedRoom> getVacantRooms() {
        ArrayList<BedRoom> vacancies = new ArrayList<>();
        for (BedRoom bedRoom : bedRooms){
            if (bedRoom.isVacant()){
                vacancies.add(bedRoom);
            }
        }
        return vacancies;
    }
}
