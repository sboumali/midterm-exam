package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */

        public static int lowestDifference ( int[] array1, int[] array2){
            int minDiff = Integer.MAX_VALUE;
            int i = 0;
            int j = 0;
            int min1 = -1;
            int min2 = -1;
            int diff = 0;
            Arrays.sort(array1);
            Arrays.sort(array2);
            while (i < array1.length && j < array2.length) {
                diff = Math.abs(array1[i] - array2[j]);
                if (diff < minDiff) {
                    minDiff = diff;
                    min1 = array1[i];
                    min2 = array2[j];
                }
                if (array1[i] < array2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
            return minDiff;

        }

        public static void main (String[]args){
            int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
            int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
            int result = lowestDifference(array1, array2);
            System.out.println(result);


        }

    }
