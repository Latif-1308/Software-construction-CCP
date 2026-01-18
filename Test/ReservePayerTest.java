import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReservePayerTest {

    @Test
    void constructor_validArguments_createsReservePayer() {
        CreditCard card = new CreditCard("123456789012");
        Identity id = new Identity("CNIC-123456789");
        ReservePayer payer = new ReservePayer(card, id);
        assertNotNull(payer);
    }

    @Test
    void create_validArguments_returnsReservePayer() {
        CreditCard card = new CreditCard("123456789012");
        Identity id = new Identity("CNIC-123456789");
        ReservePayer payer = ReservePayer.create(card, id);
        assertNotNull(payer);
    }

    @Test
    void create_returnsNewInstanceEachTime() {
        CreditCard card = new CreditCard("123456789012");
        Identity id = new Identity("CNIC-123456789");
        ReservePayer payer1 = ReservePayer.create(card, id);
        ReservePayer payer2 = ReservePayer.create(card, id);
        assertNotSame(payer1, payer2);
    }
}
