package hotel;
public class Room {
    private final int number;
    private Guest occupied;

    public Room(int number) {
        if (number <= 0)
            throw new IllegalArgumentException("Invalid room number");
        this.number = number;
    }

    public void createGuest(Guest guest) {
        if (occupied != null)
            throw new IllegalStateException("Room already occupied");
        this.occupied = guest;
    }

    public boolean isOccupied() {
        return occupied != null;
    }
}