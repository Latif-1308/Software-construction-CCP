import java.time.LocalDate;

public class Reservation {
    private final LocalDate reservationDate;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final int number;

    public Reservation(LocalDate reservationDate, LocalDate startDate,
                       LocalDate endDate, int number) {

        if (startDate.isAfter(endDate))
            throw new IllegalArgumentException("Invalid date range");

        this.reservationDate = reservationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.number = number;
    }

    public static Reservation create(LocalDate r, LocalDate s, LocalDate e, int n) {
        return new Reservation(r, s, e, n);
    }
}