import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assert.*;

public class HotelChainTest {

    private HotelChain hotelChain;

    @Before
    public void setUp() {
        hotelChain = new HotelChain();
    }

    // ---------- makeReservation() tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void makeReservation_nullReservation_throwsException() {
        hotelChain.makeReservation(null);
    }

    @Test
    public void makeReservation_validReservation_noException() {
        Reservation reservation = new Reservation();
        hotelChain.makeReservation(reservation);
    }

    // ---------- cancelReservation() tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void cancelReservation_nullReservation_throwsException() {
        hotelChain.cancelReservation(null);
    }

    @Test
    public void cancelReservation_validReservation_noException() {
        Reservation reservation = new Reservation();
        hotelChain.cancelReservation(reservation);
    }

    // ---------- capability checks ----------

    @Test
    public void canMakeReservation_returnsTrue() {
        assertTrue(hotelChain.canMakeReservation());
    }

    @Test
    public void canCancelReservation_returnsTrue() {
        assertTrue(hotelChain.canCancelReservation());
    }

    @Test
    public void canCheckInGuest_returnsTrue() {
        assertTrue(hotelChain.canCheckInGuest());
    }

    @Test
    public void canCheckOutGuest_returnsTrue() {
        assertTrue(hotelChain.canCheckOutGuest());
    }

    // ---------- addHotel() test ----------

    @Test
    public void addHotel_validHotel_noException() {
        Hotel hotel = new Hotel(new Name("Test Hotel"));
        hotelChain.addHotel(hotel);
    }
}
