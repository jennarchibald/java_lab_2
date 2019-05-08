import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedRoom;
    Guest guest;

    @Before
    public void before(){
        bedRoom = new BedRoom(1, 2, "Twin", 30.00);
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
        assertEquals(false, bedRoom.isVacant());
    }

    @Test
    public void canRemoveGuest(){
        bedRoom.addGuest(guest);
        bedRoom.removeGuest(guest);
        assertEquals(0, bedRoom.guestCount());
        assertEquals(true, bedRoom.isVacant());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(30.00, bedRoom.getNightlyRate(), 0.01);
    }

    @Test
    public void roomIsVacant(){
        assertEquals(true, bedRoom.isVacant());
    }
}
