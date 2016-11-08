package module10;

public class MyExceptions extends Exception {
    private String massage;
    public MyExceptions(String message) {
        this.massage=message;
    }

    public String getMessage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}