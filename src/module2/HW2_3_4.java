package module2;

public class HW2_3_4 {
    public static double percentOfCommision = 5;
    public static double[] ownerBalances = {1200, 250, 2000, 500, 3200};
    public static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    public static double withdrawBalance(double balance, double withdrawal) {

        return balance - withdrawal - (withdrawal*percentOfCommision/100);
    }

    public static double withdrawBalance(String ownerName, double withdrawal) {

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName))
            {
                return withdrawBalance(ownerBalances[i],withdrawal);
            }
        }
        return -1;
    }

    public static double fundBalance(String ownerName, double fund) {

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName))
            {
                return ownerBalances[i] + fund;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 10;
        double withdrawBalance = withdrawBalance(balance,withdrawal);

        String ownerName = "Ann";
        double sumOfWithdrawal = 100;

        //HW 2
        if (withdrawBalance >= 0) {
            System.out.println("Procedure status: ОК; Commission is: " + (withdrawal*percentOfCommision/100) + "; Balance is: " + withdrawBalance);
        } else {
            System.out.println("Procedure status: NO. Please check your balance. Commission is " + percentOfCommision + "% from payment");
        }

        //HW 3

        withdrawBalance = withdrawBalance(ownerName,sumOfWithdrawal);
        if (withdrawBalance >= 0) {
            System.out.println("Name:"+ " "+ ownerName + "; Sum of withdrawal: "+  sumOfWithdrawal + "; Balance is: " + withdrawBalance);
        } else {
            System.out.println("Procedure status: NO. Please check your balance. Commission is " + percentOfCommision + "% from payment");
        }

        //HW 4

        ownerName = "Oww";
        sumOfWithdrawal = 100;

        withdrawBalance = fundBalance(ownerName,sumOfWithdrawal);

        if ( withdrawBalance >= 0 ) {
            System.out.println("Name: "+ ownerName + "; "+"Balance after funding: "+ withdrawBalance);
        } else {
            System.out.println("Fund: NO. Please check your balance.");
        }

    }
}
