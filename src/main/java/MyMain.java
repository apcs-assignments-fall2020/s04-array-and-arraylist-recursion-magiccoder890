import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        // YOUR CODE HERE
        int num = 0;
        for (int counter = 1; counter < list.size();counter ++){
            if (list.get(counter) - list.get(counter - 1) >= 0){
                num++;
            }
        }
        if (num == list.size() - 1){
            return true;
        }
        else {
            return false;
        }
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        // YOUR CODE HERE
        return false;
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        // YOUR CODE HERE
        for (int i = 0; i < arr.length; i ++){
            if (arr[i] == x){
                count --;
            }
        }
        if (count == 0){
            return true;
        }
        else {
            return false;
        }
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {
        // YOUR CODE HERE
        return false;
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        // YOUR CODE HERE
        boolean test = false; 
        for (int element : arr) { 
            if (element == num) { 
                test = true; 
                break; 
            } 
        } 
        return test;
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {        
        // YOUR CODE HERE
        return false;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
