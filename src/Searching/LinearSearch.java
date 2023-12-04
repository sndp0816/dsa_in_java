package Searching;
import static Array.reverse.*;

public class LinearSearch {
    public static void main(String[] args) {
        /*

        1. Time Complexity: O(N) -
        Since in linear search,
        we traverse through the array to check if any element matches the key.
        In the worst-case scenario, the element will be present at the end of the array
        so we have to traverse through the end,
        and hence the time complexity will be O(N) where N is the total number of array elements.

        2. Space Complexity: O(1) -
        We are not using any extra space so the space complexity will be O(1).

         */

        int[] arr1 = {
                2,3,4,5,6,7,8,9
        };

        int[] arr3 = {
                2,6,1,11,3,5,9
        };
        //System.out.println(max(arr3));


       // System.out.println(linear_serach_1(arr1,100));

        //Better way to get result
//        int result = linear_serach_1(arr1,90);
//        if (result==-1){
//            System.out.println("Element is not present ");
//        }
//        else {
//            System.out.println("Element is present in Index: "+result);
//        }

        int[][] arr2 ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int[][] arr5 = {
                {7,5,4,11},
                {23,45,6,1}
        };
        System.out.println(max_element(arr5));

       // printIntArray(multi_array_linearSearch(arr2,8));
        //int ans = LengthOfArray(arr2);

    }


    //basic linear search
    static int linear_search_1(int arr[],int n){
        for (int i = 0; i < LengthOfArray(arr) ; i++) {
            if(arr[i]==n){
                return i;
            }
        }

        return -1;
    }

    //it's help to find the element in the multidimensional arrays
    static int[] multi_array_linearSearch(int[][] arr,int n){
        for (int i = 0; i < LengthOf2DArray(arr); i++) {
            for (int j = 0; j < LengthOfArray(arr[i]); j++) {
                if(arr[i][j]==n){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    //minimum element present in the multidimensional array
    static int min_element(int[][] arr) {
        int ans = arr[0][0];
        for (int i = 0; i < LengthOf2DArray(arr); i++) {
            for (int j = 0; j < LengthOfArray(arr[i]); j++) {
                if (arr[i][j] < ans) {
                    ans = arr[i][j];
                }
            }
        }
        return ans;
    }


    //minimum element present in the multidimensional array
    static int max_element(int[][] arr) {
        int ans = arr[0][0];
        for (int i = 0; i < LengthOf2DArray(arr); i++) {
            for (int j = 0; j < LengthOfArray(arr[i]); j++) {
                if (arr[i][j] > ans) {
                    ans = arr[i][j];
                }
            }
        }
        return ans;
    }

}
