import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    private Room room;

    @BeforeEach
    void setUp() {
        room = new Room(101);
    }

    @Test
    void constructor_invalidRoomNumber_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> new Room(0));
    }

    @Test
    void constructor_validRoomNumber_createsRoom() {
        Room room = new Room(1);
        assertNotNull(room);
    }

    @Test
    void createGuest_roomEmpty_setsOccupied() {
        Guest guest = Guest.create(new Name("John"), new Address("123 Street"));
        room.createGuest(guest);
        assertTrue(room.isOccupied());
    }

    @Test
    void createGuest_roomAlreadyOccupied_throwsException() {
        Guest guest1 = Guest.create(new Name("John"), new Address("123 Street"));
        Guest guest2 = Guest.create(new Name("Alice"), new Address("456 Street"));
        room.createGuest(guest1);
        assertThrows(IllegalStateException.class, () -> room.createGuest(guest2));
    }

    @Test
    void isOccupied_initiallyFalse() {
        assertFalse(room.isOccupied());
    }

    @Test
    void isOccupied_afterAddingGuest_returnsTrue() {
        Guest guest = Guest.create(new Name("John"), new Address("123 Street"));
        room.createGuest(guest);
        assertTrue(room.isOccupied());
    }
}
