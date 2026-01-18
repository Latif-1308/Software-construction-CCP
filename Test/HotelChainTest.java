import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class HotelChainTest {

    private HotelChain hotelChain;

    @BeforeEach
    void setUp() {
        hotelChain = new HotelChain();
    }

    // ---------- makeReservation() tests ----------

    @Test
    void makeReservation_nullReservation_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            hotelChain.makeReservation(null);
        });
    }

    @Test
    void makeReservation_validReservation_noException() {
        Reservation reservation = Reservation.create(
                LocalDate.now(),               // reservationDate
                LocalDate.now().plusDays(1),   // startDate
                LocalDate.now().plusDays(3),   // endDate
                1                               // number
        );

        assertDoesNotThrow(() -> hotelChain.makeReservation(reservation));
    }

    // ---------- cancelReservation() tests ----------

    @Test
    void cancelReservation_nullReservation_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            hotelChain.cancelReservation(null);
        });
    }

    @Test
    void cancelReservation_validReservation_noException() {
        Reservation reservation = Reservation.create(
                LocalDate.now(),
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(3),
                1
        );

        assertDoesNotThrow(() -> hotelChain.cancelReservation(reservation));
    }

    // ---------- capability checks ----------

    @Test
    void canMakeReservation_returnsTrue() {
        assertTrue(hotelChain.canMakeReservation());
    }

    @Test
    void canCancelReservation_returnsTrue() {
        assertTrue(hotelChain.canCancelReservation());
    }

    @Test
    void canCheckInGuest_returnsTrue() {
        assertTrue(hotelChain.canCheckInGuest());
    }

    @Test
    void canCheckOutGuest_returnsTrue() {
        assertTrue(hotelChain.canCheckOutGuest());
    }

    // ---------- addHotel() test ----------

    @Test
    void addHotel_validHotel_noException() {
        Hotel hotel = new Hotel(new Name("Test Hotel"));
        assertDoesNotThrow(() -> hotelChain.addHotel(hotel));
    }
}
