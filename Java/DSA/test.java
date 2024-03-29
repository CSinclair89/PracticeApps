import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

    static long solve(ArrayList<Integer> p) {
        // Frequency map to store the frequency of all the elements
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int prev = 1;
        for (int element : p) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        int ans = 0;
        for (int i = 1; frequencyMap.containsKey(i); i++) {
            prev *= frequencyMap.get(i);
            ans += prev;
        }
        return ans;
    }
//Driver code
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(69);
        arr.add(2);
        arr.add(221);
        arr.add(8974);

        long[] array = new long[arr.size()];
        long min, max, minSum = 0, maxSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            array[i] = arr.get(i);
        }
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

        min = array[0];
        max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (i != 0) maxSum += array[i];
            if (i != array.length - 1) minSum += array[i];
        }
    
        System.out.println(Arrays.toString(array));
        System.out.println("Minimum num: " + min);
        System.out.println("Maximum num: " + max);

        System.out.println(minSum + " " + maxSum);

    }

    public static void bubbleSort(long[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    long temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}


    
