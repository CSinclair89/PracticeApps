import java.util.Arrays;

public class binarysearch {

    public static void main(String[] args) {

        // Establish original array
        int[] arr = {8, 3, 1, 6, 2, 26, 13, 0, 51, 92, 32, 33, 66, 21};
        int digit = 51;
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Create duplicate array for sorting
        int[] qS_arr = arr;
        quickSort(qS_arr, 0, qS_arr.length - 1);
        System.out.println("Quick Sorted Array: " + Arrays.toString(qS_arr));

        // Indicate target value for Binary Search
        System.out.println("Target value for Binary Search: " + digit);

        // Conditionals for Binary Search output
        if (binarySearch(qS_arr, digit) == -1) {
            System.out.println("Target value not found.");
        } else {
            System.out.println("Target value found at index " + binarySearch(qS_arr, digit) + ".");
        }    
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid]) return mid;
            else if (target > arr[mid]) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
}
