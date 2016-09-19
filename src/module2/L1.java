package module2;


public class L1 {
    public static int min(int[] array) {
        int result = array[0];
        for (int item : array) {
            if (result > item) result = item;
        }
        return result;
    }

    public static int max(int[] array) {
        int result = array[0];
        for (int item : array) {
            if (result < item) result = item;
        }
        return result;
    }

    public static int maxPositive(int[] array) {
        int result = 0;
        for (int item : array) {
            if (result < item && item > 0) result = item;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] MyIntArray = {-58, 64, 25, -9, 18, 74, 13, -81, 99, 38};

        System.out.println("Min of int elements: " + min(MyIntArray));
        System.out.println("Max of int elements: " + max(MyIntArray));
        System.out.println("MaxPositive of int elements: " + maxPositive(MyIntArray));
    }
}
