package Searching;
import static Array.reverse.*;

public class BinarySearch {

    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5,6,7,8,9};
        int[] arr2 ={3,6,7,2,1,77,4,2};
        System.out.println(binarySearch(arr2,77));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = LengthOfArray(arr)-1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2;
//
// might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        //ans not found
        return -1;
    }
}

