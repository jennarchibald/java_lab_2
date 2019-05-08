import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    BedRoom bedRoom;
    Booking booking;
    Guest guest;

    @Before
    public void before(){
        bedRoom = new BedRoom(1, 2, "Twin", 30.00);
        guest = new Guest();
        booking = new Booking(bedRoom, 2, guest);
    }

    @Test
    public void hasRoom(){
        assertEquals(bedRoom, booking.getBedRoom());
    }
    @Test
    public void hasNumberOfNights(){
        assertEquals(2, booking.getNumberOfNights());
    }
    @Test
    public void hasGuest(){
        assertEquals(guest, booking.getGuest());
    }

    @Test
    public void hasTotalBill(){
        assertEquals(60.00, booking.totalBill(), 0.01);
    }

}
