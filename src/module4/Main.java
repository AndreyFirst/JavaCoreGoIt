package module4;
public class Main {

        static void runMethods (BankSystem bankSystemImpl, User user1, User user2, int fundUser, int withdrawalUser, int transferUser)
        {
            System.out.println("--- Go! ---");
            System.out.println(user1);
            System.out.println("-----------------");
            bankSystemImpl.fundUser(user1,fundUser);
            bankSystemImpl.withdrawOfUser(user1,withdrawalUser);
            bankSystemImpl.transferMoney(user1,user2,transferUser);
            bankSystemImpl.paySalary(user1);
            System.out.println("--- Result ---");
            System.out.println(user1);
            System.out.println("-----------------");
        }

        public static void main(String[] args) {
            Bank usBank = new USBank(Currency.USD,3,"USA",100,200,2,10000);
            Bank euBank = new EUBank(Currency.EUR,2,"Germany",50,250,1,20000);
            Bank chinaBank = new ChinaBank(Currency.USD,4,"China",300,10,1,40000);

            User userUsBank1 = new User(1,"Franki Stein",1100,6,"Taxi na Dubrovku",1000,usBank);
            User userUsBank2 = new User(2,"MariYanna",600,12,"MariYannaFirelli",5000,usBank);
            User userEuBank1 = new User(3,"Persie Jexxon",700,60,"Chivava Island",1000,euBank);
            User userEuBank2 = new User(4,"Arni Iron",750,4,"IronMaiden",500,euBank);
            User userChineBank1 = new User(5,"Kurt Cobain ",300,2,"Eternal NIRVANA",300,chinaBank);
            User userChineBank2 = new User(6,"Lara Kroft",1900,10,"Kroft Company,",1000,chinaBank);

            BankSystem bankSystem = new BankSystemImpl();
            runMethods(bankSystem,userUsBank1,userUsBank2,1000,500,400);
            runMethods(bankSystem,userUsBank2,userUsBank1,30000,600,4400);
            runMethods(bankSystem,userEuBank1,userEuBank2,400,140,500);
            runMethods(bankSystem,userEuBank2,userEuBank1,5023,400,1400);
            runMethods(bankSystem,userChineBank1,userChineBank2,342,580,350);
            runMethods(bankSystem,userChineBank2,userChineBank1,250,50,700);

        }

    }

