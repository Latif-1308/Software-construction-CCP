package hotel;
public class ReservePayer {
    private final CreditCard creditCardDetails;
    private final Identity id;

    public ReservePayer(CreditCard card, Identity id) {
        this.creditCardDetails = card;
        this.id = id;
    }

    public static ReservePayer create(CreditCard card, Identity id) {
        return new ReservePayer(card, id);
    }
}