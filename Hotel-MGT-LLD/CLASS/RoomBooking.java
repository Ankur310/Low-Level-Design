package CLASS;

import ENUMS.BookingStatus;

import java.util.Date;
import java.util.List;

public class RoomBooking {
    String bookingID;
    Date startDate;
    Date endDate;
    int days_duration;
    BookingStatus bookingStatus;
    List<Guest> guestList;
    List<Room> roomList;
    int totalRoomChargeBooked;
}
