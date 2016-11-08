package module9;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "firstName", "lastName", "city", 1888888));
        users.add(new User(2, "firstName2", "lastName2", "city1 ", 2888888));
        users.add(new User(3, "firstName3", "lastName3", "city2", 3888888));
        users.add(new User(4, "firstName4", "lastName4", "city3", 4888888));
        users.add(new User(5, "firstName5", "lastName5", "city4", 5888888));
        users.add(new User(6, "firstName6", "lastName6", "city5", 6888888));
        users.add(new User(7, "firstName7", "lastName7", "city6", 7888888));
        users.add(new User(8, "firstName8", "lastName8", "city7", 8888888));
        users.add(new User(9, "firstName9", "lastName9", "city9", 9888888));
        users.add(new User(10, "firstName10", "lastName10", "city10", 8888888));

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 2100, Currency.USD, "item", "Magazin", users.get(0)));
        orders.add(new Order(2, 3900, Currency.UAH, "item2", "Magazin2", users.get(1)));
        orders.add(new Order(3, 800, Currency.USD, "item3", "Magazin3", users.get(2)));
        orders.add(new Order(4, 1700, Currency.UAH, "item4", "Magazin4", users.get(3)));
        orders.add(new Order(5, 2400, Currency.USD, "item5", "Magazin5", users.get(4)));
        orders.add(new Order(6, 4500, Currency.UAH, "item6", "Magazin6", users.get(5)));
        orders.add(new Order(7, 1600, Currency.USD, "item7", "Magazin7", users.get(6)));
        orders.add(new Order(8, 3300, Currency.UAH, "item8", "Magazin8", users.get(7)));
        orders.add(new Order(9, 2200, Currency.USD, "item9", "Magazin9", users.get(8)));
        orders.add(new Order(10, 9100, Currency.UAH, "item10", "Magazin10", users.get(9)));

        System.out.println(orders);
        System.out.println("------ CheckName--------");
        checkName(orders,"lastName4");
        System.out.println("------ SortDecrease--------");
        sortByPrice(orders);
        System.out.println("------ SortIncreseAndCity-------");
        sortByPriceAndCityName(orders);
        System.out.println("-------SortShopAndCity-------");
        sortByItemAndShopAndCity(orders);
        System.out.println("------DeleteDublicats-------");
        deleteDublicates(orders);
        System.out.println("----- DeleteLowPrice--------");
        deletePriceLow(orders);
        System.out.println("----- SeparateListByCurrency--------");
        List<List<Order>> listOrder = separateByCurrency(orders);
        System.out.println(listOrder);
        System.out.println("----- SeparateListByCity--------");
        Set<List<Order>> setOrder = separateOrders(orders);
        System.out.println(setOrder);
        System.out.println("------DeleteUSD-------");
        deleteUSD(orders);
    }


    private static void sortByPrice (List<Order> orders)
    {
        Collections.sort(orders,(a,b)-> Integer.compare(b.getPrice(),a.getPrice()));
        System.out.println(orders);
    }

    private static void sortByPriceAndCityName (List<Order> orders)
    {
        Comparator<Order> sortByPrice = (a,b) -> Integer.compare(a.getPrice(),b.getPrice());
        Comparator<Order> sortByCityName = (a,b) -> a.getUser().getCity().compareTo(b.getUser().getCity());
        Collections.sort(orders,sortByPrice.thenComparing(sortByCityName));
        System.out.println(orders);
    }

    private static void sortByItemAndShopAndCity (List<Order> orders)
    {
        Comparator<Order> sortByItemName = (a,b) -> a.getItemName().compareTo(b.getItemName());
        Comparator<Order> sortByShopId= (a,b) -> a.getShopIdentificator().compareTo(b.getShopIdentificator());
        Comparator<Order> sortByCityName = (a,b) -> a.getUser().getCity().compareTo(b.getUser().getCity());
        Collections.sort(orders,sortByItemName.thenComparing(sortByShopId.thenComparing(sortByCityName)));
        System.out.println(orders);

    }

    private static void deleteDublicates (List<Order> orders)
    {

        System.out.println(orders.stream()
                .distinct()
                .collect(Collectors.toList()));
    }

    private static void deletePriceLow (List<Order> orders)
    {
        orders.stream()
                .filter(a -> a.getPrice()<1500)
                .collect(Collectors.toList())
                .forEach(orders::remove);

        System.out.println(orders);
    }

    private static void deleteUSD (List<Order> orders)
    {
        orders.stream()
                .filter(a -> a.getCurrency().equals(Currency.USD))
                .collect(Collectors.toList())
                .forEach(orders::remove);

        System.out.println(orders);
    }

    private static List<List<Order>> separateByCurrency (List<Order> orders)
    {
        List<List<Order>> orderList = new ArrayList<>();
        orderList.add(orders.stream()
                .filter(a -> a.getCurrency().equals(Currency.USD))
                .collect(Collectors.toList()));

        orderList.add(orders.stream()
                .filter(a -> a.getCurrency().equals(Currency.UAH))
                .collect(Collectors.toList()));
        return orderList;
    }

    private static Set<List<Order>> separateOrders(List<Order> orders) {

        Function<Order, List<Order>> f = new Function<Order, List<Order>>() {
            @Override
            public List<Order> apply(Order order) {
                return orders.stream()
                        .filter(o -> o.getUser().getCity().equals(order.getUser().getCity()))
                        .collect(Collectors.toList());

            }
        };

        Set<List<Order>> res =  orders.stream()
                .map(f)
                .collect(Collectors.toSet());


        return res;
    }

    private static void checkName (List<Order> orders, String name)
    {
        orders.stream()
                .filter(a -> a.getUser().getLastName().equals(name))
                .forEach(a -> System.out.println("Order" + a + " contain " + name));


    }


}