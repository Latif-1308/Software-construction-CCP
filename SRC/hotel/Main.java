package hotel;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        HotelChain chain = new HotelChain();

        Hotel hotel = new Hotel(new Name("Pearl Continental"));
        hotel.addRoom(new Room(101));
        hotel.addRoom(new Room(102));

        chain.addHotel(hotel);

        Guest guest = Guest.create(
                new Name("Ali"),
                new Address("Lahore, Pakistan")
        );

        Reservation reservation = Reservation.create(
                LocalDate.now(),
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(3),
                1
        );

        ReservePayer payer = ReservePayer.create(
                new CreditCard("123456789012"),
                new Identity("CNIC-12345")
        );

        hotel.createReservation(reservation);

        System.out.println("Reservation created successfully");
        System.out.println("Available rooms: " + hotel.available());
    }
}