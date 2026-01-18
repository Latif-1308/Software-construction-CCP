package hotel;
import org.junit.Test;
import static org.junit.Assert.*;

public class CreditCardTest {

    // ---------- Constructor validation tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullNumber_throwsException() {
        new CreditCard(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_tooShortNumber_throwsException() {
        new CreditCard("12345678901"); // 11 digits, < 12
    }

    @Test
    public void constructor_validNumber_createsCreditCard() {
        CreditCard card = new CreditCard("123456789012");
        assertNotNull(card);
    }

    // ---------- getNumber() tests ----------

    @Test
    public void getNumber_returnsCorrectValue() {
        CreditCard card = new CreditCard("987654321098");
        assertEquals("987654321098", card.getNumber());
    }
}