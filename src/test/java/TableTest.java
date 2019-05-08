import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TableTest {

    Table table;
    Guest guest;

    @Before
    public void before(){
        table = new Table(1, 4);
        guest = new Guest();
    }

    @Test
    public void hasNumber(){
        assertEquals(1, table.getNumber());
    }
    @Test
    public void hasChairs(){
        assertEquals(4, table.getNumberOfChairs());
    }

    @Test
    public void startWithNoGuests(){
        assertEquals(null, table.guest());
    }

    @Test
    public void canAddGuest(){
        table.addGuest(guest);
        assertEquals(guest, table.guest());
    }

    @Test
    public void canRemoveGuest(){
        table.addGuest(guest);
        table.removeGuest();
        assertEquals(null, table.guest());
    }

    @Test
    public void canBeFull(){
        table.addGuest(guest);
        assertEquals(true, table.isOccupied());
    }
}
