package Array;

import java.util.ArrayList;
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

    public static int SearchInString(String[] arr1,String name){
        int temp=0;
        for (String i:arr1) {
            if(i.equals(name)){
                break;
            }
            temp++;
        }
        //give the index of the String
       return temp;
    }

    public static int[] RemovingZeroInArray(int[] arr){
        ArrayList<Integer> nonNull = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                nonNull.add(arr[i]);
            }
        }
        int[] result = nonNull.stream().mapToInt(Integer::intValue).toArray();
        return result;

    }

    public static String[] RemovingNull(String[] arr){
        ArrayList<String> nonNull = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                nonNull.add(arr[i]);
            }
        }
        String[] result = nonNull.toArray(new String[nonNull.size()]);
        return result;
    }

    public static void main(String[] args) {

        int[] arr1= {1,2,3};
        int[] arr2={2,3,4};

        //System.out.println(Arrays.toString(Intersection(arr1,arr2)));


        //search in Stirngs

//        String[] cars = {"Volvo", "BMW", "Ford", "Mustang"};
//        System.out.println(SearchInString(cars,"Mustang"));
//        for (String i:cars) {
//            System.out.println(i);
//        }

        int[] arr3 = {1,0,3,0,4,5,0};
        System.out.println(Arrays.toString(RemovingZeroInArray(arr3)));

        String[] name = {null,"sandeep","Ramesh",null,"mohit"};
        System.out.println(Arrays.toString(RemovingNull(name)));




    }


}
