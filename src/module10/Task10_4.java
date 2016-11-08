package module10;

public class Task10_4 {
    public static void main(String[] args) {
        f();
    }
    private static void f(){
        try{
            g();
        }catch (Throwable e){
            System.err.println(e.getMessage());
        }
    }
    private static void g() throws MyExceptions{
        throw new MyExceptions("This is wrong");
    }
}