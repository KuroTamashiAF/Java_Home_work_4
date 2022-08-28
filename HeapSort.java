public class HeapSort {
    public static void main(String[] args) {

        int array[] = { 2, 5, 1, -10, 15, 45, 16, -3, 12, 9, 1000 };
        heapSort(array);
        printArr(array);

    }

    private static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            hepify(arr, i, n);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            hepify(arr, 0, i);
        }
    }

    private static void hepify(int[] arr, int i, int n) {
        int leftChild = i * 2 + 1;
        int rightChild = i * 2 + 2;
        int parent = i;

        if (leftChild < n && arr[leftChild] > arr[parent]) {
            parent = leftChild;
        }
        if (rightChild < n && arr[rightChild] > arr[parent]) {
            parent = rightChild;
        }
        if (i != parent) {
            int temp = arr[i];
            arr[i] = arr[parent];
            arr[parent] = temp;
            hepify(arr, parent, n);
        }

    }
}
