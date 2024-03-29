import java.util.Arrays;

class quicksort {
  public static void main(String[] args) {
    int[] arr = {8, 5, 1, 6, 34, 12, 4, 0, 37, 89, 5, 9, 19, 21};
    System.out.println(Arrays.toString(arr));
    quickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  private static void quickSort(int[] arr, int start, int end) {
    if (start >= end) return;

    int pivot = partition(arr, start, end);
    quickSort(arr, start, pivot - 1);
    quickSort(arr, pivot + 1, end);
  }

  private static int partition(int[] arr, int start, int end) {
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