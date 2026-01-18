import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class HotelTest {

    private Hotel hotel;

    @BeforeEach
    void setUp() {
        hotel = new Hotel(new Name("Grand Hotel"));
    }

    @Test
    void createReservation_nullReservation_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> hotel.createReservation(null));
    }

    @Test
    void createReservation_validReservation_noException() {
        Reservation reservation = Reservation.create(
                LocalDate.now(),
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(3),
                1);
        hotel.createReservation(reservation);
    }

    @Test
    void available_noRooms_returnsZero() {
        assertEquals(0, hotel.available());
    }

    @Test
    void available_withRooms_returnsCorrectCount() {
        hotel.addRoom(new Room(1));
        hotel.addRoom(new Room(2));
        hotel.addRoom(new Room(3));
        assertEquals(3, hotel.available());
    }
}
