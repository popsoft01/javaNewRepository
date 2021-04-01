package Tdd;

import java.util.Scanner;

public class kata {
    static int sum;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(kata.getSum(new int[]{2, 3, 4, 6, 5}));
        System.out.println(kata.findAverageArray( new int[]{2,3,4,6,5}));
        System.out.println(kata.getMax( new int[]{2,3,4,6,5}));
        System.out.println(kata.getMin( new int[]{1,3,4,6,5}));

    }

    public static int getSum(int[] number) {
        int[] array = {2,3,4,5,6};
        for (int counter = 0; counter<number.length; counter++){
            sum += array[counter];
        }
        return sum;
    }

    public static double findAverageArray(int[] number) {
        int[] array = new int[5];
        int add = getSum(number);
        return add/array.length;
    }

    public static int getMax(int[] number) {
        int[] array = {2,3,4,5,6};
        int max = array[0];
        for (int counter = 0; counter < array.length; counter++){
            if (array[counter] > max)
                max = array[counter];
        }
        return max;
    }

    public static int getMin(int[] number) {
        int[] array = {2,3,4,5,6};
        int min = array[0];
        for (int counter = 0; counter < array.length; counter++){
            if (array[counter] < min)
                min = array[counter];
        }
        return min;

    }

    public static int findTheLargestSum(int[] number) {
        int sum = getSum(number);
        int max = getMax(number);
        return sum - max;
    }
//    public static double findAverage();
}
