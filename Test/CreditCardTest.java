import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardTest {

    @Test
    void constructor_nullNumber_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> new CreditCard(null));
    }

    @Test
    void constructor_tooShortNumber_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> new CreditCard("12345678901"));
    }

    @Test
    void constructor_validNumber_createsCreditCard() {
        CreditCard card = new CreditCard("123456789012");
        assertNotNull(card);
    }

    @Test
    void getNumber_returnsCorrectValue() {
        CreditCard card = new CreditCard("987654321098");
        assertEquals("987654321098", card.getNumber());
    }
}
