import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assert.*;

public class NameTest {

    // ---------- Constructor validation tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullName_throwsException() {
        new Name(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_blankName_throwsException() {
        new Name("   ");
    }

    @Test
    public void constructor_validName_createsName() {
        Name name = new Name("Grand Hotel");
        assertNotNull(name);
    }

    // ---------- getValue() tests ----------

    @Test
    public void getValue_returnsCorrectValue() {
        Name name = new Name("Luxury Inn");
        assertEquals("Luxury Inn", name.getValue());
    }
}
