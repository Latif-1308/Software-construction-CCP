import java.util.ArrayList;
import java.util.List;

public class HotelChain {
    private final List<Hotel> hotels = new ArrayList<>();

    public void makeReservation(Reservation reservation) {
        if (reservation == null)
            throw new IllegalArgumentException("Reservation cannot be null");
    }

    public void cancelReservation(Reservation reservation) {
        if (reservation == null)
            throw new IllegalArgumentException("Reservation cannot be null");
    }
    public boolean canMakeReservation() {
        return true;
    }

    public boolean canCancelReservation() {
        return true;
    }

    public boolean canCheckInGuest() {
        return true;
    }

    public boolean canCheckOutGuest() {
        return true;
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }
}