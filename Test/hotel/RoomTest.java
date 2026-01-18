package hotel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    private Room room;

    @Before
    public void setUp() {
        room = new Room(101);
    }

    // ---------- Constructor tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void constructor_invalidRoomNumber_throwsException() {
        new Room(0);
    }

    @Test
    public void constructor_validRoomNumber_createsRoom() {
        Room room = new Room(1);
        assertNotNull(room);
    }

    // ---------- createGuest() tests ----------

    @Test
    public void createGuest_roomEmpty_setsOccupied() {
        Guest guest = new Guest();
        room.createGuest(guest);

        assertTrue(room.isOccupied());
    }

    @Test(expected = IllegalStateException.class)
    public void createGuest_roomAlreadyOccupied_throwsException() {
        Guest guest1 = new Guest();
        Guest guest2 = new Guest();

        room.createGuest(guest1);
        room.createGuest(guest2); // should fail
    }

    // ---------- isOccupied() tests ----------

    @Test
    public void isOccupied_initiallyFalse() {
        assertFalse(room.isOccupied());
    }

    @Test
    public void isOccupied_afterAddingGuest_returnsTrue() {
        room.createGuest(new Guest());
        assertTrue(room.isOccupied());
    }
}
