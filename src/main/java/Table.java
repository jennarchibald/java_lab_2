import java.util.ArrayList;

public class Table {
    private int number;
    private int numberOfChairs;
    Guest guest;

    public Table(int number, int numberOfChairs) {
        this.number = number;
        this.numberOfChairs = numberOfChairs;
        this.guest = null;
    }

    public int getNumber() {
        return number;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public Guest guest() {
        return guest;
    }

    public void addGuest(Guest guest) {
        if (!isOccupied()) {
            this.guest = guest;
        }
    }

    public void removeGuest() {
        this.guest = null;
    }

    public boolean isOccupied() {
        return !(guest == null);
    }
}
