package module10;

public class Task10_5 {
    public static void main(String[] args) {
        try{
            threeErrors();
        } catch (Exception1 e){
            System.err.println(e.getMessage());
        }
    }
    private static void threeErrors()throws Exception1{
        throw new Exception1("First exception");
    }
}