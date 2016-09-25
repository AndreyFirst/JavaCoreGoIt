package module6;

public class Main {
    public static void main(String[] args) {
        UserUtils x=new UserUtils();
        User us1=new User(900000001,"Alec","Baldwin",545,20280);
        User us2=new User(900000002,"Steven","Seagal",638,20690);
        User us3=new User(900000003,"Alec","Baldwin",545,20990);
        User us4=new User(900000004,"Bruce","Willis",629,70150);
        User us5=new User(900000005,"Bruce","Almighty",510,186990);
        User[] users=new User[]{us1,us2,us3,us4,us5};

        users=UserUtils.uniqueUsers(users);
        lop(UserUtils.paySalaryToUsers(users));
        lop(x.usersWithConditionalBalance(users,70150));

        lop(UserUtils.uniqueUsers(users));
        long[] userId=UserUtils.getUsersId(users);
        for(long id:userId) System.out.println(id);
    }
    private static void lop(User[] users){
        for (int i=0;i<users.length;i++) {
            System.out.println(users[i]);
        }
        System.out.println("----------------------------------");
    }
}