import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //task 1
        System.out.println("task 1");
        int[] numbers = new int[]{1, 2, 3};

        double[] floats = {1.57, 7.654, 9.986};

        int[] players = {10, 20, 30, 40};

        //task 2
        System.out.println("task 2");
        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {10, 20, 30, 40};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if ( i != args.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length -1) {
                System.out.print(", ");
            }

        }
        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i != arr3.length -1) {
                System.out.print(", ");
            }

        }
        System.out.println();
        //task 3
        System.out.println("task 3");
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
            
        }
        System.out.println();
        for (int i = arr2.length -1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = arr3.length -1;  i >= 0; i--) {
            System.out.print(arr3[i]);
            if (i != 0) {
                System.out.print(", ");
            }

        }
        System.out.println();
        //task 4
        int[] arr = {1, 2, 3};
        System.out.println("task 4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }

        }
        System.out.println(Arrays.toString(arr));


    }




}