public package hotel;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReservePayerTest {

    // ---------- Constructor tests ----------

    @Test
    public void constructor_validArguments_createsReservePayer() {
        CreditCard card = new CreditCard();
        Identity id = new Identity();

        ReservePayer payer = new ReservePayer(card, id);

        assertNotNull(payer);
    }

    // ---------- Factory method tests ----------

    @Test
    public void create_validArguments_returnsReservePayer() {
        CreditCard card = new CreditCard();
        Identity id = new Identity();

        ReservePayer payer = ReservePayer.create(card, id);

        assertNotNull(payer);
    }

    @Test
    public void create_returnsNewInstanceEachTime() {
        CreditCard card = new CreditCard();
        Identity id = new Identity();

        ReservePayer payer1 = ReservePayer.create(card, id);
        ReservePayer payer2 = ReservePayer.create(card, id);

        assertNotSame(payer1, payer2);
    }
}
 ReservePayerTest {
    
}
