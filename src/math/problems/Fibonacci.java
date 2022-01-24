package math.problems;


import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        Fibonacci.fibonacci();
    }

    /*
     * This method prints the fibonacci of any int argument you pass while calling this method
     * @return
     */
    public static List<Integer> fibonacci() { // The Fibonacci series is a series where the next number is the sum of the
        // previous two numbers.
        List<Integer> list = new ArrayList<>();
        int num1 = 0;
        int num2 = 1;
        list.add(num1);
        list.add(num2);
        for (int i = 1; i <= 38; i ++) {
            int num3 = num1 + num2;
            list.add(num3);
            num1 = num2;
            num2 = num3;
        }

        for (int num: list) {
            System.out.print(num + " ");
            System.out.println();
        }
        return list;
    }
    }










