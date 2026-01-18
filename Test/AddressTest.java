import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assert.*;

public class AddressTest {

    // ---------- Constructor validation tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullAddress_throwsException() {
        new Address(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_blankAddress_throwsException() {
        new Address("   ");
    }

    @Test
    public void constructor_validAddress_createsAddress() {
        Address address = new Address("123 Main Street, Lahore");
        assertNotNull(address);
    }

    // ---------- getDetails() tests ----------

    @Test
    public void getDetails_returnsCorrectValue() {
        Address address = new Address("Block A, Street 5, Islamabad");
        assertEquals("Block A, Street 5, Islamabad", address.getDetails());
    }
}
