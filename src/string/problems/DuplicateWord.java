package string.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        DuplicateWord.findDuplicateWords(st);
    }

    public static void findDuplicateWords(String inputString){
        // Split
        String [] words = inputString.split(" ");

        // Create Hashmap
        Map<String, Integer> wordCount = new HashMap<>();

        // To check each word in a given Array
        for (String word : words) {

            // If word is present
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        // Extracting all the keys of map wordCount:
        Set<String> wordsInString = wordCount.keySet();

        // Loop through all the words in wordCount
        for (String word : wordsInString) {
            if(wordCount.get(word) > 1)
                System.out.println(word +" : "+ wordCount.get(word));
        }
        String[] strArray = inputString.split(" ");
        Integer totalChars = 0;
        for(String s : strArray){
            totalChars += s.length();
        }
        int wor = strArray.length;
        int averageWordLength = (int)(totalChars/wor);
        System.out.println("Average length of the sentence is: "+averageWordLength);
    }
}




