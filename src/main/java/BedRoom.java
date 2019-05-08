import java.util.ArrayList;

public class BedRoom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private double nightlyRate;
    private boolean vacant;

    public BedRoom(int roomNumber, int capacity, String type, double nightlyRate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.type = type;
        this.nightlyRate = nightlyRate;
        this.vacant = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public int guestCount() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
        this.vacant = false;
    }

    public void removeGuest(Guest guest) {
        guests.remove(guest);
        this.vacant = true;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public boolean isVacant() {
        return vacant;
    }
}
