import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;
    ArrayList<Integer> tables;

    @Before
    public void before(){
        tables = new ArrayList<Integer>();
        tables.add(4);
        tables.add(2);
        tables.add(6);
        diningRoom = new DiningRoom(tables, "Beefeater");
        guest = new Guest();
    }

    @Test
    public void hasCapacity(){
        assertEquals(12, diningRoom.capacity());
    }

    @Test
    public void hasGuests(){
        assertEquals(0, diningRoom.guestCount());
    }

    @Test
    public void canAddGuest(){
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.guestCount());
    }

    @Test
    public void canRemoveGuest(){
        diningRoom.addGuest(guest);
        diningRoom.removeGuest(guest);
        assertEquals(0, diningRoom.guestCount());
    }
}
