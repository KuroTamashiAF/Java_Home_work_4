//import java.util.Arrays;

public class mergeSort {

    public static void main(String[] args) {

        int array[] = { 5, 6, 9, 11, 25, 1,1000,-5, 8, 4, 3, 12 }; // new int[10];

        mergSort(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void mergSort(int[] arr) {
        // System.out.println(Arrays.toString(arr));
        int n = arr.length;
        if (n == 1)
            return;
        int midlle = n / 2;
        int left[] = new int[midlle];
        int right[] = new int[n - midlle];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
            // System.out.print(left[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[j + midlle];
            // System.out.print(right[j] + " ");
        }
        mergSort(left);
        mergSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int leftLen = left.length;
        int rightLen = right.length;
        int i = 0;
        int j = 0;
        int idx = 0;

        while (i < leftLen && j < rightLen) {
            if (left[i] < right[j]) {
                arr[idx] = left[i];
                i++;
                idx++;
            } else {
                arr[idx] = right[j];
                j++;
                idx++;
            }

        }
        for (int k = i; k < leftLen; k++) {
            arr[idx++] = left[k];
        }
        for (int m = j; m < rightLen; m++) {
            arr[idx++] = right[m];
        }
    }
}
