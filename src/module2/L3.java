package module2;


public class L3 {
    public static int sum(int[] array) {
        int result = 0;
        for (int item : array) {
            result += item;
        }
        return result;
    }

    public static int multiplication(int[] array) {
        int result = 1;
        for (int item : array) {
            result *= item;
        }
        return result;
    }

    public static int modulus(int[] array) {
        return array[0] % array[array.length - 1];

    }

    public static void main(String[] args) {
        int[] MyIntArray = {-58, 64, 25, -9, 18, 74, 13, -81, 99, 38};

        System.out.println("Sum of int elements: " + sum(MyIntArray));

        System.out.println("Multiplication of int elements: " + multiplication(MyIntArray));

        System.out.println("Modulus of int elements: " + modulus(MyIntArray));
    }
}