package hotel;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTypeTest {

    // ---------- Constructor tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void constructor_costZero_throwsException() {
        new RoomType("Single", 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_negativeCost_throwsException() {
        new RoomType("Double", -100);
    }

    @Test
    public void constructor_validArguments_createsRoomType() {
        RoomType roomType = new RoomType("Deluxe", 5000.0);
        assertNotNull(roomType);
    }

    // ---------- getCost() tests ----------

    @Test
    public void getCost_returnsCorrectCost() {
        RoomType roomType = new RoomType("Suite", 7500.50);
        assertEquals(7500.50, roomType.getCost(), 0.001);
    }
}
