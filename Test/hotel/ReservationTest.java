public package hotel;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class ReservationTest {

    // ---------- Constructor tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void constructor_startDateAfterEndDate_throwsException() {
        LocalDate reservationDate = LocalDate.now();
        LocalDate startDate = LocalDate.of(2026, 1, 10);
        LocalDate endDate = LocalDate.of(2026, 1, 5);

        new Reservation(reservationDate, startDate, endDate, 1);
    }

    @Test
    public void constructor_validDates_createsReservation() {
        LocalDate reservationDate = LocalDate.now();
        LocalDate startDate = LocalDate.of(2026, 1, 5);
        LocalDate endDate = LocalDate.of(2026, 1, 10);

        Reservation reservation =
                new Reservation(reservationDate, startDate, endDate, 1);

        assertNotNull(reservation);
    }

    // ---------- Factory method tests ----------

    @Test
    public void create_validArguments_returnsReservation() {
        LocalDate reservationDate = LocalDate.now();
        LocalDate startDate = LocalDate.of(2026, 2, 1);
        LocalDate endDate = LocalDate.of(2026, 2, 5);

        Reservation reservation =
                Reservation.create(reservationDate, startDate, endDate, 2);

        assertNotNull(reservation);
    }

    @Test
    public void create_returnsNewInstanceEachTime() {
        LocalDate reservationDate = LocalDate.now();
        LocalDate startDate = LocalDate.of(2026, 3, 1);
        LocalDate endDate = LocalDate.of(2026, 3, 5);

        Reservation r1 = Reservation.create(reservationDate, startDate, endDate, 3);
        Reservation r2 = Reservation.create(reservationDate, startDate, endDate, 3);

        assertNotSame(r1, r2);
    }
}
 ReservationTest {
    
}
