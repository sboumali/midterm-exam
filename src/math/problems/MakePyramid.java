package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */

            int n = 6;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i ; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }


