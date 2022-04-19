package CLASSES;

import ENUMS.BookingStatus;

import java.util.Date;
import java.util.List;

public class Booking {
    int bookingID;
    Date bookingDate;
    Member member;
    Show show;
    BookingStatus bookingStatus;
    int amount;
    List<Seat> seats;
    Payment paymentObj;
    boolean makePayment(Payment payment){
        //code here
        return  false;
    }
}
