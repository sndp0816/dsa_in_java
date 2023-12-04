package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import static Array.reverse.*;

public class TwoArrayOperations {
    public static void main(String[] args) {

        int arr1[]={1,2,3,4};
        int arr2[]={5,3,2,8};

        //System.out.println(Arrays.toString(MergeArray(arr1,arr2)));
        //System.out.println(UnionOfArray(arr1,arr2));
        TreeSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(4);
        //System.out.println(set);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(55);
        arr.add(2);
        arr.add(100);
        arr.add(55);
        System.out.println(arr);
    }

    static int[] MergeArray(int arr1[],int arr2[]){
        int x,y;
        x= LengthOfArray(arr1);
        y = LengthOfArray(arr2);

        int[] ans = new int[x+y];

        for (int i = 0; i < x; i++) {
            ans[i]=arr1[i];
        }
        for (int i = 0; i < y; i++) {
            ans[x+i]=arr2[i];
        }

        return ans;

    }

    static ArrayList<Integer> UnionOfArray(int arr1[], int arr2[]){

        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr1)
            set.add(i);

        // Remove duplicates from arr2[]
        for (int i : arr2)
            set.add(i);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : set) {
            list.add(i);
        }
        return list;
    }

    static ArrayList<Integer> UnionOfArrayAdv(int arr1[], int arr2[]){

        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr1)
            set.add(i);

        // Remove duplicates from arr2[]
        for (int i : arr2)
            set.add(i);

        return new ArrayList<>(set);
    }

}
