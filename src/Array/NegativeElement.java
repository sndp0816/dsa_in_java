package Array;

import java.util.Arrays;

import static Array.reverse.SwapElement;

public class NegativeElement {

    static int[] SortNegativeEmenet(int[] arr){


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    SwapElement(arr,i,j);
                }
            }
        }


        return arr;
    }
    public static void swap(int[] ar, int i, int j)
    {
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }

    static int[] ShiftNegative(int[] arr){

        int low = 0;
        int high = arr.length -1;

        while (low <= high){

            if (arr[low]<= 0){
                low++;
            }
            else {
                swap(arr, low ,high--);
            }

        }



        return arr;
    }


    public static void main(String[] args) {

        int[] arr1 = {1,2,3,-1,-2,-3};



       // System.out.println(Arrays.toString(arr1));

        //System.out.println(Arrays.toString(SortNegativeEmenet(arr1)));

        System.out.println(Arrays.toString(ShiftNegative(arr1)));

    }
}
