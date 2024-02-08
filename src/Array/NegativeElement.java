package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    public static boolean containsDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int i:arr) {
            if(!seen.add(i)){
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        int length = nums.length;

        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return true;
            } else{
                set.add(i);
            }
        }
        return false;
    }

    public static boolean isAnagram(String str1,String str2){

        if(str1.length()!=str2.length()){
            return false;
        }
        int[] count = new int[26];
        for (char c : str1.toCharArray()){
            ++count[c-'a'];
        }
        for (char c : str2.toCharArray()) {
            if (count[c - 'a'] == 0)
                return false;
            --count[c - 'a'];
        }
        return true;

    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,-1,-2,-3};

        int[] nums = {1,2,3,1};
        int[] num2 = {1,2,3,4};

       // System.out.println(Arrays.toString(arr1));

        //System.out.println(Arrays.toString(SortNegativeEmenet(arr1)));

       // System.out.println(Arrays.toString(ShiftNegative(arr1)));

        //System.out.println(containsDuplicate(nums));

        String str1 = "dish",str2="fish";
        String str3 = "bear",str4="bare";

        System.out.println(isAnagram(str3,str4));




    }
}
