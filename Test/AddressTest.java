import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {

    @Test
    void constructor_nullAddress_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> new Address(null));
    }

    @Test
    void constructor_blankAddress_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> new Address("   "));
    }

    @Test
    void constructor_validAddress_createsAddress() {
        Address address = new Address("123 Main Street, Lahore");
        assertNotNull(address);
    }

    @Test
    void getDetails_returnsCorrectValue() {
        Address address = new Address("Block A, Street 5, Islamabad");
        assertEquals("Block A, Street 5, Islamabad", address.getDetails());
    }
}
