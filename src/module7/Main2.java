package module7;

import java.util.*;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(1, "firstName",  "lastName",  "city",  1888888));
        users.add(new User(2, "firstName2", "lastName2", "city1 ",2888888));
        users.add(new User(3, "firstName3", "lastName3", "city2", 3888888));
        users.add(new User(4, "firstName4", "lastName4", "city3", 4888888));
        users.add(new User(5, "firstName5", "lastName5", "city4", 5888888));
        users.add(new User(6, "firstName6", "lastName6", "city5", 6888888));
        users.add(new User(7, "firstName7", "lastName7", "city6", 7888888));
        users.add(new User(8, "firstName8", "lastName8", "city7", 8888888));
        users.add(new User(9, "firstName9", "lastName9", "city9", 9888888));
        users.add(new User(10, "firstName10", "lastName10", "city10", 8888888));

        Set<Order> orders = new TreeSet<>();
        orders.add(new Order(1, 10,  Currency.USD, "item", "Magazin", users.get(0)));
        orders.add(new Order(2, 900, Currency.EUR, "item2", "Magazin2", users.get(1)));
        orders.add(new Order(3, 800, Currency.USD, "item3", "Magazin3", users.get(2)));
        orders.add(new Order(4, 700, Currency.EUR, "item4", "Magazin4", users.get(3)));
        orders.add(new Order(5, 400, Currency.USD, "item5", "Magazin5", users.get(4)));
        orders.add(new Order(6, 500, Currency.EUR, "item6", "Magazin6", users.get(5)));
        orders.add(new Order(7, 600, Currency.USD, "item7", "Magazin7", users.get(6)));
        orders.add(new Order(8, 300, Currency.EUR, "item8", "Magazin8", users.get(7)));
        orders.add(new Order(9, 200, Currency.USD, "item9", "Magazin9", users.get(8)));
        orders.add(new Order(10,100, Currency.EUR, "item10", "Magazin10", users.get(9)));

        System.out.println(orders);

        Iterator<Order> chechName = orders.iterator();
        while (chechName.hasNext()){
            Order order = chechName.next();
            if (order.getUser().getLastName().equals("Petrov")) {
                System.out.println("set contain order with lastname Petrov: " + order.toString());
            }
        }

        Iterator<Order> findMaxPrice = orders.iterator();
        int maxPrice = 0;

        while (findMaxPrice.hasNext()){
            Order order = findMaxPrice.next();
            if (order.getPrice() > maxPrice) maxPrice = order.getPrice();
        }
        System.out.println("Max price is " + maxPrice);



        Iterator<Order> deleteUSD = orders.iterator();
        while (deleteUSD.hasNext()){
            Order order = deleteUSD.next();
            if (order.getCurrency() == Currency.USD) deleteUSD.remove();
        }
        System.out.println(orders);




    }
}