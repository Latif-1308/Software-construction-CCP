import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NameTest {

    @Test
    void constructor_nullName_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> new Name(null));
    }

    @Test
    void constructor_blankName_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> new Name("   "));
    }

    @Test
    void constructor_validName_createsName() {
        Name name = new Name("Grand Hotel");
        assertNotNull(name);
    }

    @Test
    void getValue_returnsCorrectValue() {
        Name name = new Name("Luxury Inn");
        assertEquals("Luxury Inn", name.getValue());
    }
}
