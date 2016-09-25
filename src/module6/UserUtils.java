package module6;

public class UserUtils {
    public static User[] uniqueUsers(User[] users){
        for(int i=0;i<users.length;i++) {
            for (int j = 0; j < users.length; j++) {
                if (users[i] != null && i != j)
                    if (users[i].equals(users[j])) users[j] = null;
            }
        }
        User[] uniqueUs=deleteEmptyUsers(users);

        return uniqueUs;
    }
    public User[] usersWithConditionalBalance(User[] users, int balance){
        int count=0;
        for(User user: users){
            if(user.getBalance()==balance)count++;
        }
        User[] uWCB = new User[count];    //users With Conditional Balance
        count=0;
        for(User user: users){
            if(user.getBalance()==balance){
                uWCB[count]=user;
                count++;
            }
        }
        return uWCB;
    }
    public static User[] paySalaryToUsers(User[] users){
        int newBalance;
        for (User user : users) {
            if(user!=null) {
                newBalance = user.getBalance() + user.getSalary();
                user.setBalance(newBalance);
            }
        }
        return users;
    }

    public static long[] getUsersId(User[] users){
        long[] userId=new long[users.length];
        for (int i=0;i<userId.length;i++) {
            if(users[i]!=null)
                userId[i]=users[i].getId();
        }
        return userId;
    }
    public static User[] deleteEmptyUsers(User[] users){
        int count=0;
        for(User user:users){
            if(user!=null)count++;
        }
        User[] afterUser=new User[count];
        count=0;
        for(User user:users){
            if(user!=null){
                afterUser[count]=user;
                count++;
            }
        }
        return afterUser;
    }
}
