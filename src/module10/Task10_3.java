package module10;

import module3dot4.User;

public class Task10_3 {
    public static void main(String[] args) {
        User user=null;
        try{
            user.getCurrency();
        } catch (Throwable e){
            System.err.println("Your_user_isnt_found");
        } finally {
            user=new User("Vasa",123,5,"Super_Vasa",62,"EUR");
            System.out.println(user);
        }
    }
}