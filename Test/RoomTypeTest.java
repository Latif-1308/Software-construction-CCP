import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoomTypeTest {

    @Test
    void constructor_costZero_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> new RoomType("Single", 0));
    }

    @Test
    void constructor_negativeCost_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> new RoomType("Double", -100));
    }

    @Test
    void constructor_validArguments_createsRoomType() {
        RoomType roomType = new RoomType("Deluxe", 5000.0);
        assertNotNull(roomType);
    }

    @Test
    void getCost_returnsCorrectCost() {
        RoomType roomType = new RoomType("Suite", 7500.50);
        assertEquals(7500.50, roomType.getCost(), 0.001);
    }
}
