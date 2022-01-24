package math.problems;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
public class UnitTestingMath {
        //Apply Unit testing into each classes and methods in this package.
// Test factorial method
        @Test
        public void testFactorial() {
            int expectedResult = 120;
            int actualResult = Factorial.factorial(5);
            Assert.assertEquals( expectedResult, actualResult);
            System.out.println("test passed");
        }

//  Test Fibonacci
        @Test
        public void testFibonacci() {
            List<Integer> expectedResult = new ArrayList<>();
            List<Integer> actualResult = new ArrayList<>();
            expectedResult = Arrays.asList(0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811,514229,832040,1346269,2178309,3524578,5702887,9227465,14930352,24157817,39088169,63245986);
            actualResult = Fibonacci.fibonacci();
            Assert.assertEquals( expectedResult, actualResult);
            System.out.println("test passed");
        }
        /*// Test makePyramid
        @Test
        public void testPyramid() {
            int expectedResult = 6;
            int actualResult = MakePyramid.pyramid(6);
            Assert.assertEquals( expectedResult, actualResult);
            System.out.println("test passed");
        }*/
        // Test pattern
        @Test
        public void testPattern() {
            int actualResult = Pattern.pattern();
            Assert.assertEquals(-1,  actualResult);
            System.out.println("test passed");
        }
        // Test Prime number
        @Test
        public void testPrime(){
            int expectedResult =31;
            int actualResult = PrimeNumber.primeNumber(18);
            Assert.assertEquals( expectedResult, actualResult);
            System.out.println("test passed");
        }
        // Test findLowestDifference method

        @Test
        public void testFindLowestDifference(){
            int [] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
            int [] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
            int currentResult=FindLowestDifference.lowestDifference(array1,array2);
            int ExpectedResult=1;
            Assert.assertEquals(currentResult,ExpectedResult);
            System.out.println("test passed");
        }
        // Test findMissingNumber method
        @Test
        public void testFindMissingNumber() {
            int [] array = {10, 2, 1, 4, 5, 3, 7, 8, 6};
            int expectedResult = 9;
            int actualResult = FindMissingNumber.missingNumber(array);
            Assert.assertEquals( expectedResult, actualResult);
            System.out.println("test passed");
        }
        @Test
        public void testLowestNumber(){
            int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
            int currentResult=LowestNumber.lowestNumber(array);
            int ExpectedResult=5;
            Assert.assertEquals(currentResult,ExpectedResult);
            System.out.println("test passed");
    }
}
