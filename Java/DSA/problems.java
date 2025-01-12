import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class problems {

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

        // List<Integer> arr = new ArrayList<>();
        // arr.add(7);
        // arr.add(69);
        // arr.add(2);
        // arr.add(221);
        // arr.add(8974);

        // long[] array = new long[arr.size()];
        // long min, max, minSum = 0, maxSum = 0;
        // for (int i = 0; i < arr.size(); i++) {
        //     array[i] = arr.get(i);
        // }
        // bubbleSort(array);
        // System.out.println(Arrays.toString(array));

        // min = array[0];
        // max = array[0];

        // for (int i = 0; i < array.length; i++) {
        //     if (i != 0) maxSum += array[i];
        //     if (i != array.length - 1) minSum += array[i];
        // }
    
        // System.out.println(Arrays.toString(array));
        // System.out.println("Minimum num: " + min);
        // System.out.println("Maximum num: " + max);

        // System.out.println(minSum + " " + maxSum);

        // List<String> strings = new ArrayList<>();
        // List<String> queries = new ArrayList<>();

        // strings.add("ab");
        // strings.add("ab");
        // strings.add("abc");

        // queries.add("ab");
        // queries.add("abc");
        // queries.add("bc");

        // HashMap<String, Integer> map = new HashMap<>();
        // List<Integer> res = new ArrayList<>();

        // for (int i = 0; i < strings.size(); i++) {
        //     if (map.containsKey(strings.get(i))) {
        //         map.put(strings.get(i), map.get(strings.get(i)) + 1);
        //     } else {
        //         map.put(strings.get(i), 1);
        //     }
        // }

        // for (int i = 0; i < queries.size(); i++) {
        //     if (map.containsKey(queries.get(i))) res.add(map.get(queries.get(i)));
        //     else res.add(0);
        // }

        // System.out.println(res);

        String expression = ("* + 3 4 5");
        String[] arr = expression.split(" ");
     
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1; i >= 0; i--) {
            Stack<Integer> stack = new Stack<>();


        }
        int val = 20;
        String str = "b";
        if (Integer.class.isInstance(Integer.valueOf(str))) System.out.println(Integer.class.isInstance(Integer.valueOf(str)));
        else System.out.println("Error");
    



    }

    // public static double calculator (String expression) {

    //     String newStr = expression.split(" ");

    //     return 0;
    // }

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

    public static String militaryTime(String s) {
        String amOrPm = s.substring(s.length() - 2, s.length());
        String endSub = s.substring(0, s.length() - 2);
        int firstNum = Integer.valueOf(endSub.substring(0, 2));
        String res = "";

        if (amOrPm.equals("AM")) {
                if (firstNum == 12) {
                    firstNum -= 12;
                }
            if (firstNum < 10) res = "0" + firstNum + endSub.substring(2, endSub.length());
            else res = firstNum + endSub.substring(2, endSub.length());
        } else {
            if (firstNum < 12) {
                firstNum += 12;
            }
            res = firstNum + endSub.substring(2, endSub.length());
        }
        return res;
    }
}


    
