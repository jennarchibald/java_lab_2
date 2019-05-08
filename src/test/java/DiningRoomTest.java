import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;
    ArrayList<Table> tables;
    Table table;
    Table table0;

    @Before
    public void before(){
        tables = new ArrayList<Table>();
        table0 = new Table(0, 8);
        tables.add(table0);
        for (int i = 1; i < 5; i++){
            table = new Table(i, 4);
            tables.add(table);
        }


        diningRoom = new DiningRoom(tables, "Beefeater");
        guest = new Guest();
    }

    @Test
    public void hasCapacity(){
        assertEquals(24, diningRoom.capacity());
    }

    @Test
    public void hasGuests(){
        assertEquals(0, diningRoom.guestCount());
    }

    @Test
    public void canAddGuest(){
        diningRoom.addGuest(guest, 2);
        assertEquals(1, diningRoom.guestCount());
    }

    @Test
    public void cannotAddGuestIfNoTablesBigEnough(){
        diningRoom.addGuest(guest, 10);
        assertEquals(0, diningRoom.guestCount());
    }

    @Test
    public void cannotAddGuestIfAllTablesFull(){
        diningRoom.addGuest(guest, 6);
        diningRoom.addGuest(guest, 6);
        assertEquals(1, diningRoom.guestCount());
    }

    @Test
    public void canRemoveGuest(){
        diningRoom.addGuest(guest, 2);
        diningRoom.removeGuest(guest);
        assertEquals(0, diningRoom.guestCount());
    }


}
