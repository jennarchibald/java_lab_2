import java.util.ArrayList;

public class DiningRoom {

    private ArrayList<Integer> tables;
    private ArrayList<Guest> guests;
    private String name;

    public DiningRoom(ArrayList<Integer> tables, String name){
        this.tables = tables;
        this.name = name;
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

    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }
}
