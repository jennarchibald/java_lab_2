import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int guestCount(){
        return guests.size();
    }


    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }
}
