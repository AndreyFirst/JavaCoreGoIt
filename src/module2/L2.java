package module2;


public class L2 {

    public static int max(int[] array) {
        int result = array[0];
        for (int item : array) {
            if (result < item) result = item;
        }
        return result;
    }

    public static int secondLargest(int[] array) {
        int max = max(array);
        int result = array[array.length - 1];


        for (int item : array) {
            if (result < item && item < max) result = item;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] MyIntArray = {-58, 64, 25, -9, 18, 74, 13, -81, 99, 38};

        System.out.println("SecondLargest of int elements: " + secondLargest(MyIntArray));

    }
}

