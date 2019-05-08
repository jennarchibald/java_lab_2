import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    ArrayList<BedRoom> bedRooms;
    ArrayList<DiningRoom> diningRooms;
    ArrayList<ConferenceRoom> conferenceRooms;

    BedRoom bedRoom1;
    BedRoom bedRoom2;
    BedRoom bedRoom3;
    BedRoom bedRoom4;

    DiningRoom diningRoom;
    ArrayList<Integer> tables;
    ConferenceRoom conferenceRoom;

    Guest guest;

    Hotel hotel;

    @Before
    public void before(){
        bedRoom1 = new BedRoom(1, 2, "Twin", 30.00);
        bedRoom2 = new BedRoom(2, 2, "Twin", 30.00);
        bedRoom3 = new BedRoom(3, 2, "Double", 40.00);
        bedRoom4 = new BedRoom(4, 4, "Family Room", 55.00);
        bedRooms = new ArrayList<>();
        bedRooms.add(bedRoom1);
        bedRooms.add(bedRoom2);
        bedRooms.add(bedRoom3);
        bedRooms.add(bedRoom4);
        guest = new Guest();

        tables = new ArrayList<>();
        tables.add(2);
        tables.add(3);
        tables.add(4);
        tables.add(5);
        diningRoom = new DiningRoom(tables, "Restaurant");
        diningRooms = new ArrayList<>();
        diningRooms.add(diningRoom);
        conferenceRoom = new ConferenceRoom(4);
        conferenceRooms = new ArrayList<>();
        conferenceRooms.add(conferenceRoom);

        hotel = new Hotel(bedRooms, diningRooms, conferenceRooms);
    }

    @Test
    public void hasBedRooms(){
        assertEquals(4, hotel.bedRoomCount());
    }

    @Test
    public void hasDiningRooms(){
        assertEquals(1, hotel.diningRoomCount());
    }

    @Test
    public void hasConferenceRooms(){
        assertEquals(1, hotel.conferenceRoomCount());
    }

    @Test
    public void canCheckGuestIntoBedRoom(){
        hotel.checkGuestIntoBedRoom(bedRoom1, guest);
        assertEquals(1, bedRoom1.guestCount());
    }

    @Test
    public void canCheckGuestOutOfBedRoom(){
        hotel.checkGuestIntoBedRoom(bedRoom1, guest);
        hotel.checkGuestOutOfBedRoom(bedRoom1, guest);
        assertEquals(0, bedRoom1.guestCount());
    }
    @Test
    public void canCheckGuestIntoDiningRoom(){
        hotel.checkGuestIntoDiningRoom(diningRoom, guest);
        assertEquals(1, diningRoom.guestCount());
    }

    @Test
    public void canCheckGuestOutOfDiningRoom(){
        hotel.checkGuestIntoDiningRoom(diningRoom, guest);
        hotel.checkGuestOutOfDiningRoom(diningRoom, guest);
        assertEquals(0, diningRoom.guestCount());
    }
    @Test
    public void canCheckGuestIntoConferenceRoom(){
        hotel.checkGuestIntoConferenceRoom(conferenceRoom, guest);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void canCheckGuestOutOfConferenceRoom(){
        hotel.checkGuestIntoConferenceRoom(conferenceRoom, guest);
        hotel.checkGuestOutOfConferenceRoom(conferenceRoom, guest);
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void canBookRoom(){
        Booking booking = hotel.bookRoom(bedRoom1, guest, 3);
        assertEquals(3, booking.getNumberOfNights());
        assertEquals(guest, booking.getGuest());
        assertEquals(bedRoom1, booking.getBedRoom());
        assertEquals(1, hotel.bookingsCount());
    }

    @Test
    public void canSeeVacantRooms(){
        hotel.checkGuestIntoBedRoom(bedRoom1, guest);
        hotel.checkGuestIntoBedRoom(bedRoom2, guest);
        ArrayList<BedRoom> vacancies = hotel.getVacantRooms();
        assertEquals(2, vacancies.size());
        assertEquals(true, vacancies.contains(bedRoom3));
    }

    @Test
    public void canNotCheckIntoOccupiedBedRooms(){
        hotel.checkGuestIntoBedRoom(bedRoom1, guest);
        hotel.checkGuestIntoBedRoom(bedRoom1, guest);
        assertEquals(1, bedRoom1.guestCount());
    }
}
