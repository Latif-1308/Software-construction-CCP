package hotel;
public class Identity {
    private final String id;

    public Identity(String id) {
        if (id == null || id.isBlank())
            throw new IllegalArgumentException("Identity cannot be empty");
        this.id = id;
    }

    public String getId() {
        return id;
    }
}