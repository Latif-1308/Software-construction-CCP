import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class ReservationTest {

    @Test
    void constructor_startDateAfterEndDate_throwsException() {
        LocalDate reservationDate = LocalDate.now();
        LocalDate startDate = LocalDate.of(2026, 1, 10);
        LocalDate endDate = LocalDate.of(2026, 1, 5);
        assertThrows(IllegalArgumentException.class, () -> new Reservation(reservationDate, startDate, endDate, 1));
    }

    @Test
    void constructor_validDates_createsReservation() {
        LocalDate reservationDate = LocalDate.now();
        LocalDate startDate = LocalDate.of(2026, 1, 5);
        LocalDate endDate = LocalDate.of(2026, 1, 10);
        Reservation reservation = new Reservation(reservationDate, startDate, endDate, 1);
        assertNotNull(reservation);
    }

    @Test
    void create_validArguments_returnsReservation() {
        Reservation reservation = Reservation.create(
                LocalDate.now(),
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(3),
                1);
        assertNotNull(reservation);
    }

    @Test
    void create_returnsNewInstanceEachTime() {
        Reservation r1 = Reservation.create(
                LocalDate.now(),
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(3),
                1);
        Reservation r2 = Reservation.create(
                LocalDate.now(),
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(3),
                1);
        assertNotSame(r1, r2);
    }
}
