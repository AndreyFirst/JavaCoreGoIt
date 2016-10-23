package module7.hw5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TripAdvisorAPI implements API {
    List<Room> rooms = new ArrayList<>();

    @Override
    public List<Room> getAllRooms() {
        return this.rooms;
    }

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        Room room = new Room(0,price,persons,new Date(),hotel,city);
        List<Room> foundRooms = new ArrayList<>();

        Iterator<Room> checkRoom = this.rooms.iterator();
        while (checkRoom.hasNext())
        {
            Room arrRoom = checkRoom.next();
            if (room.getHotelName() == null){
                if (room.equals(arrRoom)){
                    foundRooms.add(arrRoom);
                }
            } else {
                if (room.equals(arrRoom) & (room.getHotelName() == arrRoom.getHotelName())) {
                    foundRooms.add(arrRoom);
                }
            }
        }
        return foundRooms;
    }

    public TripAdvisorAPI() {
        this.rooms.add(new Room(11,1000,1, new Date(),"Hot Ell","Rome"));
        this.rooms.add(new Room(12,1000,2, new Date(),"Barcelona","Barcelona"));
        this.rooms.add(new Room(13,3000,2, new Date(),"Berlin","Berlin"));
        this.rooms.add(new Room(14,2800,2, new Date(),"KYEV","Kyiv"));
        this.rooms.add(new Room(15,2000,3, new Date(),"Marncelly","China"));


    }
}