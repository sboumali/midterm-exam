package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        Anagram.isAnagram("ACT", "CAT");

    }

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        boolean boo;

        // check if length is same
        if (str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                boo = true;
                System.out.println(str1+ " and "+str2+ " are anagram!");
            } else {
                boo = false;
                System.out.println(str1+ " and "+str2+ " are not anagram!");
            }
        } else {
            boo = false;
            System.out.println(str1+ " and "+str2+ " are not anagram!");
        }
        return boo;
    }
}
