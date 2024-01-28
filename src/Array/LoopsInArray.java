package Array;

import java.util.Arrays;

public class LoopsInArray {

    //Intersection in two array
    public static int[] Intersection(int[] arr1,int[] arr2){
        //for getting array length we can also use Math.min to get minimum value
        int[] arr3 = new int[arr1.length+arr2.length];
        int temp =0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                //if it's match then add in new array
                if (arr1[i]==arr2[j]){
                     arr3[temp] = arr1[i];
                    temp++;
                }
            }
        }

        //for removing extra element from the array make copyOf eg[0,0]
        int[] result = Arrays.copyOf(arr3, temp);
        return result;
    }


    //Union in two array


    public static int[] Union(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int temp = 0;

        // Add elements from arr1 to arr3
        for (int i = 0; i < arr1.length; i++) {
            arr3[temp] = arr1[i];
            temp++;
        }

        // Check and add elements from arr2 to arr3 only if they are not already present
        for (int j = 0; j < arr2.length; j++) {
            if (!contains(arr3, arr2[j])) {
                arr3[temp] = arr2[j];
                temp++;
            }
        }

        // Create a new array with the exact size of the union
        int[] result = Arrays.copyOf(arr3, temp);

        return result;
    }

    public static boolean contains(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {

        int[] arr1= {1,2,3};
        int[] arr2={2,3,4};

        System.out.println(Arrays.toString(Intersection(arr1,arr2)));

    }


}
