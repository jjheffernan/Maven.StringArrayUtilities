package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {


        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (int i = 0; i < array.length; i++) {
            if (Arrays.asList(array[i]).contains(value)) {return true;}
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        List<String> output;
        output = Arrays.asList(array);
        Collections.reverse(output);
        return output.toArray(array);
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean outcome = true;
        for (int i = 0; i <= array.length / 2 && array.length != 0; i++) {
            // Check if first and last element are different.
            if (array[i] != array[array.length - i - 1]) {
                // return change variable
                outcome = false;
            }
        }
        return outcome;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        String arrayString = Arrays.toString(array).toLowerCase();

        for (int i = 0; i <= alphabet.length-1; i++) {
            if (arrayString.contains(alphabet[i])!= true) {
                return false;
            }
        }
        return true;

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurence = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(value)) {
                occurence += 1;
            }
        }
        return occurence;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] output = new String[array.length-1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(valueToRemove)) {
                output[i] = "";
                count++;
            } else {
                output[i-count] = array[i];
            }
        }
        return output;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> output = new ArrayList<String>(array.length);// need to change this to array to pass test
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            output.add(array[i]);
            if (array[i] == array[i+1]) {
                output.remove(i);
            }
            /*output.add(i,array[i]);;
            if (output.size() > 2)
            {
                int sz = output.size();

                // removing three consecutive duplicates
                if (output.get(sz-1) == output.get(sz - 2) ||
                        output.get(sz-2) == output.get(sz -3))
                {
                   // output.trimToSize(); // Removing three characters
                    // from the string
                }
            }*/
        }
        return output.toArray(array);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {


        return null;
    }


}
