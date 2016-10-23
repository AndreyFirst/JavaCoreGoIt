package module7.hw5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


public class BookingComAPI implements API {
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

    public BookingComAPI() {
        Room room1 = new Room(1,4000,4, new Date(),"Autumn Palace","Yellowstone");
        Room room2 = new Room(2,2000,2, new Date(),"Winter Palace","Barcelona");
        Room room3 = new Room(3,3000,2, new Date(),"Spring Palace","London");
        Room room4 = new Room(4,4560,5, new Date(),"Summer Palace","Kyiv");
        Room room5 = new Room(5,1000,1, new Date(),"Season Palace","Paris");


    }
}