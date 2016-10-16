package module7;

import module4.Currency;
        import java.util.ArrayList;
        import java.util.Comparator;
        import java.util.List;

public class Main{
    public static void main(String[] args) {
        User us = new User(13121, "firstName", "lastName", "city", 8888888);
        User us2 = new User(23171, "firstName2", "lastName2", "city1 ", 8888888);
        User us3 = new User(33171, "firstName3", "lastName3", "city2", 8888888);
        User us4 = new User(43171, "firstName4", "lastName4", "city3", 8888888);
        User us5 = new User(53171, "firstName5", "lastName5", "city4", 8888888);
        User us6 = new User(63171, "firstName6", "lastName6", "city5", 8888888);
        User us7 = new User(73171, "firstName7", "lastName7", "city6", 8888888);
        User us8 = new User(83171, "firstName8", "lastName8", "city7", 8888888);
        User us9 = new User(93171, "firstName9", "lastName9", "city9", 8888888);
        User us10 = new User(13171, "firstName10", "lastName10", "city10", 8888888);

        Order rdr = new Order(91000001, 100, Currency.USD, "item", "Magazin", us);
        Order rdr2 = new Order(70000002, 100, Currency.EUR, "item2", "Magazin2", us2);
        Order rdr3 = new Order(20000003, 100, Currency.USD, "item3", "Magazin3", us3);
        Order rdr4 = new Order(60000004, 100, Currency.EUR, "item4", "Magazin4", us4);
        Order rdr5 = new Order(30000005, 100, Currency.USD, "item5", "Magazin5", us5);
        Order rdr6 = new Order(10000006, 100, Currency.EUR, "item6", "Magazin6", us6);
        Order rdr7 = new Order(10000007, 100, Currency.USD, "item7", "Magazin7", us7);
        Order rdr8 = new Order(10000008, 100, Currency.EUR, "item8", "Magazin8", us8);
        Order rdr9 = new Order(10000009, 100, Currency.USD, "item9", "Magazin9", us9);
        Order rdr10 = new Order(70040010, 100, Currency.EUR, "item10", "Magazin10", us10);

        List<Order> listOfOrder=new ArrayList<>();
        listOfOrder.add(rdr);
        listOfOrder.add(rdr2);
        listOfOrder.add(rdr3);
        listOfOrder.add(rdr4);
        listOfOrder.add(rdr5);
        listOfOrder.add(rdr6);
        listOfOrder.add(rdr7);
        listOfOrder.add(rdr8);
        listOfOrder.add(rdr9);
        listOfOrder.add(rdr10);

        System.out.println(listOfOrder);

        listOfOrder.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return 0;
            }
        });
    }
}