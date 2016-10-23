package module7.hw5;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {


        Controller controller = new Controller();
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        List<Room> rooms = new ArrayList<>();

        rooms.addAll(controller.requstRooms(4500,5,null,null));
        System.out.println("---------------------------------------");
        rooms.addAll(controller.requstRooms(0,0,"Kyiv",null));
        System.out.println("----------------------");
        rooms.addAll(controller.requstRooms(1000,0,"Barcelona",null));
        System.out.println("----------------------");
        rooms = controller.requstRooms(0,0,null,"Berlin");
        System.out.println("----------------------");

        controller.check(bookingComAPI,googleAPI);
        System.out.println("---------------------------------------");
        controller.check(bookingComAPI,tripAdvisorAPI);
        System.out.println("---------------------------------------");
        controller.check(tripAdvisorAPI,googleAPI);

    }
}