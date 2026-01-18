package hotel;
public class RoomType {
    private final String roomKind;
    private final double cost;

    public RoomType(String roomKind, double cost) {
        if (cost <= 0)
            throw new IllegalArgumentException("Cost must be positive");
        this.roomKind = roomKind;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}