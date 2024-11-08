/******************************************************************
 *
 *   Abdullah I Khan Section 002
 *
 *   This java file contains the problem solutions of isSubSet, findKthLargest,
 *   and sort2Arrays methods. You should utilize the Java Collection Framework for
 *   these methods.
 *
 ********************************************************************/

import java.util.*;

class ProblemSolutions {

    /**
     * Method: isSubset()
     *
     * Given two arrays of integers, A and B, return whether
     * array B is a subset if array A. Example:
     *      Input: [1,50,55,80,90], [55,90]
     *      Output: true
     *      Input: [1,50,55,80,90], [55,90, 99]
     *      Output: false
     *
     * The solution time complexity must NOT be worse than O(n).
     * For the solution, use a Hash Table.
     *
     * @param list1 - Input array A
     * @param list2 - input array B
     * @return      - returns boolean value B is a subset of A.
     */

   public boolean isSubset(int list1[], int list2[]) {
        if( list2.length > list1.length){ // if list2 is greater than list1 then subset is not found thus return false.
           return false;
       }
    // create hashtable to put elements in from list1
        Hashtable<Integer, Boolean> table = new Hashtable<>();
       // add all elements from list1 into hashtable
        for (int number : list1) {
            table.put(number, true);
        }
       // check if all elements from list2 are in the table
        for (int number : list2) {
            // if any element in list2 not in hashtable, return false
            if (!table.containsKey(number)){
            return false;
        }
    }
       // if all elements of list2 are found in list1 return true
        return true;
    }

    /**
     * Method: findKthLargest
     *
     * Given an Array A and integer K, return the k-th maximum element in the array.
     * Example:
     *      Input: [1,7,3,10,34,5,8], 4
     *      Output: 7
     *
     * @param array - Array of integers
     * @param k     - the kth maximum element
     * @return      - the value in the array which is the kth maximum value
     */

 public int findKthLargest(int[] array, int k) {
        Arrays.sort(array); // sort array in low to highest 
        return array[array.length - k]; // return k-largest element 
    }
    public static void main(String[] args) {
        ProblemSolutions answer = new ProblemSolutions(); // create new object of the class ProblemSolutions and assign var answer
        int[] numbersInArray = {1, 7, 3, 10, 34, 5, 8}; // define array of numbers 
        System.out.println(answer.findKthLargest(numbersInArray, 4)); // find and print the 4th largest number in array
    }
    /**
     * Method: sort2Arrays
     *
     * Given two arrays A and B with n and m integers respectively, return
     * a single array of all the elements in A and B in sorted order. Example:
     *      Input: [4,1,5], [3,2]
     *      Output: 1 2 3 4 5
     *
     * @param array1    - Input array 1
     * @param array2    - Input array 2
     * @return          - Sorted array with all elements in A and B.
     */

   public int[] sort2Arrays(int[] array1, int[] array2) {
       // combines two arrays into one. Sorts merged array in ascending order and returns sorted array.
        int[] merged = new int[array1.length + array2.length];
        for (int a = 0; a < array1.length; a++) { 
            merged[a] = array1[a];
        } 
        for (int a = 0; a < array2.length; a++) {
            merged[array1.length + a] = array2[a];
        } 
       Arrays.sort(merged);
        return merged; 
    }
}
