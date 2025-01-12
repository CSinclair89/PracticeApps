import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

    public static void main(String[] args) {

        int[] a = {7, 4, 1, 4};
        int[] b = {8, 2, 1, 9 ,5};

        System.out.println(Arrays.toString(a));
        System.out.println(total(a, b));
    }

    public static int total(int[] a, int[] b) {
        int sum = 0;
        int[][] inputArrs = {a, b};
        for (int[] arr : inputArrs) {
            for (int i : arr) sum += i;
        }
        return sum;
    }

    
    
}
