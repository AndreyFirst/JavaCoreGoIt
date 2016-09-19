package module2;


public class HW1 {
    public static int sum(int[] array){
        int result = 0;
        for (int item : array){
            result += item;
        }
        return result;
    }

    public static double sum(double[] array){
        double result = 0;
        for (double item : array){
            result += item;
        }
        return result;
    }

    public static int min(int[] array){
        int result = array[0];
        for (int item : array){
            if (result > item) result = item;
        }
        return result;
    }

    public static double min(double[] array){
        double result = array[0];
        for (double item : array){
            if (result > item) result = item;
        }
        return result;
    }

    public static int max(int[] array){
        int result = array[0];
        for (int item : array){
            if (result < item) result = item;
        }
        return result;
    }

    public static double max(double[] array){
        double result = array[0];
        for (double item : array){
            if (result < item) result = item;
        }
        return result;
    }

    public static int maxPositive(int[] array){
        int result = 0;
        for (int item : array){
            if (result < item && item > 0) result = item;
        }
        return result;
    }

    public static double maxPositive(double[] array){
        double result = 0;
        for (double item : array){
            if (result < item && item >0) result = item;
        }
        return result;

    }

    public static int multiplication(int[] array){
        int result = 1;
        for (int  item : array){
            result *= item;
        }
        return result;
    }

    public static double multiplication(double[] array){
        double result = 1;
        for (double item : array){
            result *= item;
        }
        return result;
    }

    public static int modulus(int[] array){
        return array[0] % array[array.length-1];

    }

    public static double modulus(double[] array){
        return array[0] % array[array.length-1];
    }



    public static int secondLargest(int[] array) {
        int max = max(array);
        int result = array[array.length - 1];

        for (int item : array){
            if (result < item && item < max) result = item;
        }
        return result;
    }

    public static double secondLargest(double[] array){
        double max = max(array);
        double result = array[0];

        for (double item : array){
            if (result < item && item < max) result = item;
        }
        return result;

    }

    public static void main(String[] args) {
        int[] MyIntArray = {-58, 64, 25, -9, 18, 74, 13, -81, 99, 38};
        double[] MyDoubleArray = {14, 89.3, -14 ,9.8 ,-19.7 ,-34.18 ,18, 52.6, -23.4, 6.3};



        System.out.println("Sum of int elements: " + sum(MyIntArray));
        System.out.println("Sum of double elements: " + sum(MyDoubleArray));

        System.out.println("Min of int elements: " + min(MyIntArray));
        System.out.println("Min of double elements: " + min(MyDoubleArray));

        System.out.println("Max of int elements: " + max(MyIntArray));
        System.out.println("Max of double elements: " + max(MyDoubleArray));

        System.out.println("MaxPositive of int elements: " + maxPositive(MyIntArray));
        System.out.println("MaxPositive of double elements: " + maxPositive(MyDoubleArray));

        System.out.println("Multiplication of int elements: " + multiplication(MyIntArray));
        System.out.println("Multiplication of double elements: " + multiplication(MyDoubleArray));

        System.out.println("Modulus of int elements: " + modulus(MyIntArray));
        System.out.println("Modulus of double elements: " + modulus(MyDoubleArray));

        System.out.println("SecondLargest of int elements: " + secondLargest(MyIntArray));
        System.out.println("SecondLargest of double elements: " + secondLargest(MyDoubleArray));


    }
}
