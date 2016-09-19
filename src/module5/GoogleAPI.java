package module5;

import java.util.Date;

public class GoogleAPI implements API {
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

    public GoogleAPI() {
        Room room1 = new Room(6,2000,2, new Date(),"Beast","China");
        Room room2 = new Room(7,1000,2, new Date(),"BarSik","Barcelona");
        Room room3 = new Room(8,3900,2, new Date(),"Berlin","Berlin");
        Room room4 = new Room(9,9500,5, new Date(),"Grand Hotel","Kyiv");
        Room room5 = new Room(10,1700,1, new Date(),"Romall","Kyiv");

        this.rooms = new Room[]{room1, room2, room3, room4, room5};
    }
}