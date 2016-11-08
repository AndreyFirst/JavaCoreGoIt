package module10;

public class Task10_2 {
    public static void main(String[] args) throws MyExceptions{
        try{
            throw new MyExceptions("This_is_error");
        }catch (MyExceptions e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("In_finally_block");
        }
    }
}