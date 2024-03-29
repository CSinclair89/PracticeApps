import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;


class Solution {


    public static void main(String args[]) {

        int n = 15;
        int i = 1;

        fizzBuzz(n, i);

    }

    public static void fizzBuzz(int n, int i) {

        if (i == n + 1) {
            return;
        } 
        
        if (i <= n) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
        fizzBuzz(n, ++i);
    }
}