package assignments.lab;

public class lab06 {
    public static int[] initRandomArray() {
        int n = (int)(Math.random() * 20);
        int [] a = new int [n];
        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random() * 20);
        }
        return a;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) max = arr[i];
            else continue;
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]) min = arr[i];
            else continue;
        }
        return min;
    }

    public static double getMean(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
    public static void main(String[] args) {
        System.out.println(getMax(initRandomArray()));
    }
}
