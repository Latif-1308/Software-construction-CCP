import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private final Name name;
    private final List<Room> rooms = new ArrayList<>();

    public Hotel(Name name) {
        this.name = name;
    }

    public void createReservation(Reservation reservation) {
        if (reservation == null)
            throw new IllegalArgumentException("Reservation cannot be null");
    }

    public int available() {
        return (int) rooms.stream().filter(r -> !r.isOccupied()).count();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }
}