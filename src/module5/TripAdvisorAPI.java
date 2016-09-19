package module5;

import java.util.Date;

public class TripAdvisorAPI implements API{
    Room[] rooms = new Room[5];

    @Override
    public Room[] getAllRooms() {
        return this.rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room room = new Room(0,price,persons,new Date(),hotel,city);
        Room[] foundRooms = new Room[5];
        int i = 0;
        for (Room arrRoom : this.rooms) {
            if (room.getHotelName() == null){
                if (room.equals(arrRoom)){
                    foundRooms[i] = arrRoom;
                    i++;
                }
            } else {
                if (room.equals(arrRoom) & (room.getHotelName() == arrRoom.getHotelName())) {
                    foundRooms[i] = arrRoom;
                    i++;
                }
            }
        }
        return foundRooms;
    }

    public TripAdvisorAPI() {
        Room room1 = new Room(11,1000,1, new Date(),"Hot Ell","Rome");
        Room room2 = new Room(12,1000,2, new Date(),"Barcelona","Barcelona");
        Room room3 = new Room(13,3000,2, new Date(),"Berlin","Berlin");
        Room room4 = new Room(14,2800,2, new Date(),"KYEV","Kyiv");
        Room room5 = new Room(15,2000,3, new Date(),"Marncelly","China");

        this.rooms = new Room[]{room1, room2, room3, room4, room5};
    }
}