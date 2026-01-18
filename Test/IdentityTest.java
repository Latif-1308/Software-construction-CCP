import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assert.*;

public class IdentityTest {

    // ---------- Constructor validation tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullId_throwsException() {
        new Identity(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_blankId_throwsException() {
        new Identity("   ");
    }

    @Test
    public void constructor_validId_createsIdentity() {
        Identity identity = new Identity("CNIC-123456789");
        assertNotNull(identity);
    }

    // ---------- getId() tests ----------

    @Test
    public void getId_returnsCorrectValue() {
        Identity identity = new Identity("PASSPORT-98765");
        assertEquals("PASSPORT-98765", identity.getId());
    }
}