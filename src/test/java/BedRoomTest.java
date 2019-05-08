import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedRoom;
    Guest guest;

    @Before
    public void before(){
        bedRoom = new BedRoom(1, 2, "Twin");
        guest = new Guest();
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedRoom.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedRoom.getCapacity());
    }

    @Test
    public void hasType(){
        assertEquals("Twin", bedRoom.getType());
    }

    @Test
    public void hasGuestCount(){
        assertEquals(0, bedRoom.guestCount());
    }

    @Test
    public void canAddGuest(){
        bedRoom.addGuest(guest);
        assertEquals(1, bedRoom.guestCount());
    }

    @Test
    public void canRemoveGuest(){
        bedRoom.addGuest(guest);
        bedRoom.removeGuest(guest);
        assertEquals(0, bedRoom.guestCount());
    }
}
