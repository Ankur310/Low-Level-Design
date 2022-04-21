package CLASS;

import ENUMS.RoomStatus;
import ENUMS.RoomStyle;

import java.util.List;

public class Room {
    int roomNumber;
    RoomStyle roomStyle;
    RoomStatus roomStatus;
    Double bookingPrice;
    List<RoomKey> roomKeys;
    List<HouseKeepingLog> houseKeepingLogs;


}
