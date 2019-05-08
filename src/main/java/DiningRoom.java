import java.util.ArrayList;
import java.util.HashMap;

public class DiningRoom {

    private ArrayList<Integer> tables;
    private ArrayList<Guest> guests;

    public DiningRoom(ArrayList<Integer> tables){
        this.tables = tables;
        this.guests = new ArrayList<>();
    }

    public int capacity() {
        int capacity = 0;
        for (int i = 0; i < tables.size(); i++){
            capacity += tables.get(i);
        }
        return capacity;
    }


    public int guestCount() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }
}
