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

    public static void main(String[] args) {
        int[] arr = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        System.out.println("index: " + max(arr) + " value: " + arr[max(arr)]);
        System.out.println("index: " + min(arr) + " value: " + arr[min(arr)]);
    }
}