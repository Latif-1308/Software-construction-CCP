import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GuestTest {

    @Test
    void constructor_validArguments_createsGuest() {
        Name name = new Name("John Doe");
        Address address = new Address("123 Main Street");
        Guest guest = new Guest(name, address);
        assertNotNull(guest);
    }

    @Test
    void create_validArguments_returnsGuest() {
        Name name = new Name("Jane Doe");
        Address address = new Address("456 Elm Street");
        Guest guest = Guest.create(name, address);
        assertNotNull(guest);
    }

    @Test
    void create_returnsNewInstanceEachTime() {
        Name name = new Name("Alice");
        Address address = new Address("789 Oak Avenue");
        Guest guest1 = Guest.create(name, address);
        Guest guest2 = Guest.create(name, address);
        assertNotSame(guest1, guest2);
    }
}
