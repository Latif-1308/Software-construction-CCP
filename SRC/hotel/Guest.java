package hotel;
public class Guest {
    private final Name name;
    private final Address addressDetails;

    public Guest(Name name, Address addressDetails) {
        this.name = name;
        this.addressDetails = addressDetails;
    }

    public static Guest create(Name name, Address address) {
        return new Guest(name, address);
    }
}