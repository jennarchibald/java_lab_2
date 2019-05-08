import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(5);
        guest = new Guest();
    }


    @Test
    public void hasCapacity(){
        assertEquals(5, conferenceRoom.getCapacity());
    }

    @Test
    public void hasGuestCount(){
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void canRemoveGuest(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void fullWhenCapacityIsReached(){
        for (int i = 0; i < 7; i ++){
            conferenceRoom.addGuest(guest);
        }
        assertEquals(true, conferenceRoom.isFull());
        assertEquals(5, conferenceRoom.guestCount());
    }
}
