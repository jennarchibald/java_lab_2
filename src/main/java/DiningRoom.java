import java.util.ArrayList;

public class DiningRoom {

    private ArrayList<Table> tables;
    private ArrayList<Guest> guests;
    private String name;

    public DiningRoom(ArrayList<Table> tables, String name){
        this.tables = tables;
        this.name = name;
        this.guests = new ArrayList<>();
    }

    public int capacity() {
        int capacity = 0;
        for (Table table : tables){
            capacity += table.getNumberOfChairs();
        }
        return capacity;
    }


    public int guestCount() {
        return guests.size();
    }

    public void addGuest(Guest guest, int numberInParty) {
        for (Table table : tables){
            if (table.getNumberOfChairs() >= numberInParty && !table.isOccupied()){
                table.addGuest(guest);
                guests.add(guest);
                return;
            }
        }
    }

    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }
}
