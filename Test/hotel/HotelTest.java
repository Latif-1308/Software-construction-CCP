package hotel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HotelTest {

    private Hotel hotel;

    @Before
    public void setUp() {
        Name name = new Name("Grand Hotel");
        hotel = new Hotel(name);
    }

    // ---------- createReservation() tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void createReservation_nullReservation_throwsException() {
        hotel.createReservation(null);
    }

    @Test
    public void createReservation_validReservation_noException() {
        Reservation reservation = new Reservation();

        // Should not throw exception
        hotel.createReservation(reservation);
    }

    // ---------- available() tests ----------

    @Test
    public void available_noRooms_returnsZero() {
        assertEquals(0, hotel.available());
    }

    @Test
    public void available_withAllRoomsFree_returnsCorrectCount() {
        hotel.addRoom(new Room(false));
        hotel.addRoom(new Room(false));
        hotel.addRoom(new Room(false));

        assertEquals(3, hotel.available());
    }

    @Test
    public void available_withSomeOccupiedRooms_returnsCorrectCount() {
        hotel.addRoom(new Room(false)); // free
        hotel.addRoom(new Room(true));  // occupied
        hotel.addRoom(new Room(false)); // free

        assertEquals(2, hotel.available());
    }

    // ---------- addRoom() tests ----------

    @Test
    public void addRoom_roomAdded_increasesAvailableCount() {
        hotel.addRoom(new Room(false));

        assertEquals(1, hotel.available());
    }
}