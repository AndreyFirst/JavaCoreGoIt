package module10;

public class ClassWithException {
    public static void main(String[] args) throws Exception{
        try{
            throw new Exception("Massage_with_error");
        } catch (Throwable e){
            System.err.println(e.getMessage());
        }
    }
}