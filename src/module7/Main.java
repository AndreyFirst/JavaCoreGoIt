package module7;


import java.util.*;
import java.util.List;



public class Main{
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

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 100, Currency.USD, "item", "Magazin", users.get(0)));
        orders.add(new Order(2, 900, Currency.EUR, "item2", "Magazin2", users.get(1)));
        orders.add(new Order(3, 800, Currency.USD, "item3", "Magazin3", users.get(2)));
        orders.add(new Order(4, 700, Currency.EUR, "item4", "Magazin4", users.get(3)));
        orders.add(new Order(5, 400, Currency.USD, "item5", "Magazin5", users.get(4)));
        orders.add(new Order(6, 500, Currency.EUR, "item6", "Magazin6", users.get(5)));
        orders.add(new Order(7, 600, Currency.USD, "item7", "Magazin7", users.get(6)));
        orders.add(new Order(8, 300, Currency.EUR, "item8", "Magazin8", users.get(7)));
        orders.add(new Order(9, 200, Currency.USD, "item9", "Magazin9", users.get(8)));
        orders.add(new Order(10, 100, Currency.EUR, "item10", "Magazin10", users.get(9)));

        Comparator<Order> sortByPriceDecrease = (o1, o2) -> o2.getPrice() - o1.getPrice();

        orders.sort(sortByPriceDecrease);
        System.out.println(orders);

        Comparator<Order> sortByPriceIncrAndCity = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {

                int result = o1.getPrice() - o2.getPrice();
                if (o1.getPrice() - o2.getPrice() == 0) {
                    result = o2.getUser().getCity().compareTo(o1.getUser().getCity());
                }
                return result;
            }
        };

        orders.sort(sortByPriceIncrAndCity);
        System.out.println(orders);

        System.out.println("--------------------");

        Comparator<Order> sortByItemShopCity = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {

                int result = o1.getItemName().compareTo(o2.getItemName());
                if (result == 0) {
                    result = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                    if (result == 0) {
                        result = o1.getUser().getCity().compareTo(o2.getUser().getCity());
                    }
                }
                return result;

            }
        };

        orders.sort(sortByItemShopCity);
        System.out.println(orders);

        System.out.println("--------------------");
        System.out.println(orders);

        Set<Order> orderNoDub = new HashSet<>();
        orderNoDub.addAll(orders);
        orders.clear();
        orders.addAll(orderNoDub);
        System.out.println(orders);

        System.out.println("--------------------");

        System.out.println(users);
        Set<User> userNoDub = new HashSet<>();
        userNoDub.addAll(users);
        users.clear();
        users.addAll(userNoDub);

        System.out.println(users);
        System.out.println("--------------------");

        Iterator<Order> iteratorOrderLess = orders.iterator();
        while (iteratorOrderLess.hasNext()) {
            Order order = iteratorOrderLess.next();
            if (order.getPrice() < 1500) iteratorOrderLess.remove();
        }

        System.out.println(orders);
        System.out.println("--------------------");

        List<Order> ordersUAH = new ArrayList<>();
        List<Order> ordersUSD = new ArrayList<>();

        Iterator<Order> iteratorSeparateCurr = orders.iterator();
        while (iteratorSeparateCurr.hasNext()){
            Order order = iteratorSeparateCurr.next();
            if (order.getCurrency() == Currency.UAH) ordersUAH.add(order);
            if (order.getCurrency() == Currency.USD) ordersUSD.add(order);
        }
        System.out.println(ordersUAH);
        System.out.println(ordersUSD);
        System.out.println("--------------------");

        //--------
        Set<String> cityList = new HashSet<>();
        Iterator<Order> iteratorCity = orders.iterator();
        while (iteratorCity.hasNext()) {
            Order order = iteratorCity.next();
            cityList.add(order.getUser().getCity());
        }
        System.out.println(cityList);

        List<List<String>> cityAllList = new ArrayList<>();

        for (String city : cityList) {
            List<String> cityUserName = new ArrayList<>();

            for (User user : users)
            {
                if (user.getCity().equals(city))
                {
                    cityUserName.add(user.getFirstName()+" "+user.getLastName());
                }
            }
            cityAllList.add(cityUserName);

        }

        System.out.println(cityAllList);
    }

}