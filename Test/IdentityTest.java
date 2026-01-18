import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IdentityTest {

    @Test
    void constructor_nullId_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> new Identity(null));
    }

    @Test
    void constructor_blankId_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> new Identity("   "));
    }

    @Test
    void constructor_validId_createsIdentity() {
        Identity identity = new Identity("CNIC-123456789");
        assertNotNull(identity);
    }

    @Test
    void getId_returnsCorrectValue() {
        Identity identity = new Identity("PASSPORT-98765");
        assertEquals("PASSPORT-98765", identity.getId());
    }
}
