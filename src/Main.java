public class Main {

    public static int max(int[] input) {
        if (input.length < 1) {
            throw new java.util.NoSuchElementException("The inputed table is empty!");
        }

        // // The cheaty way
        // return Arrays.stream(input).max().getAsInt();
        int max = input[0];
        int index = 0;

        for (int j = 0; j < input.length; j++) {
            if (input[j] >= max) { // using ">=" instead of just ">" in case of value appearing several times
                max = input[j];
                index = j;
            }
        }

        return index;
    }

    public static int min(int[] input) {
        if (input.length < 1) {
            throw new java.util.NoSuchElementException("The inputed table is empty!");
        }

        int min = input[0];
        int index = 0;

        for (int j = 0; j < input.length; j++) {
            if (input[j] <= min) {  // replaced ">" with "<" to find min instead of max
                min = input[j];
                index = j;
            }
        }

        return index;
    }

    public static int[] minmax(int[] input) {
        if (input.length < 1) {
            throw new java.util.NoSuchElementException("Input filled array");
        }

        int min = input[0], max = input[0];
        int indexMin = 0, indexMax = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] <= min) {
                min = input[i];
                indexMin = i;
            }
            if (input[i] >= max) {
                max = input[i];
                indexMax = i;
            }
        }

        return new int[]{ indexMin, min, indexMax, max};
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
//        System.out.println("index: " + max(arr) + " value: " + arr[max(arr)]);
//        System.out.println("index: " + min(arr) + " value: " + arr[min(arr)]);
        System.out.println("Min Index: " + minmax(arr)[0] + ", Min Value: " + minmax(arr)[1] + ", Max Index: " + minmax(arr)[2] + ", Max Value: " + minmax(arr)[3]);
    }
}