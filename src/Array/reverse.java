package Array;


import java.util.Arrays;

public class reverse {


    public static void main(String[] args) {
//        int[] arr1 ={1,2,3,22,5,6,7,8};
////        printIntArray(arr1);
//        int[] arr2 ={0,1,2};
//        SwapElement(arr1,arr1[0],arr1[1]);
//        System.out.println(Arrays.toString(arr1));
//        printIntArray(arr2);

        int[][] arr2 ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        System.out.println(LengthOf2DArray(arr2));


    }

    //if you want to print array in then you have use array library [eg Array.toString]
    //in this method you can print array without support the outside method [mostly for integer values]
    public static void printIntArray(int[] arr){
        for (int i = 0; i < LengthOfArray(arr); i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //I'm counting the length of array without external function
    public static int LengthOfArray(int[] arr){
        int count=0;
        for (int i:arr) {
            count++;
        }
        return count;
    }

    public static int LengthOf2DArray(int[][] arr) {
        int rowCount = 0;
        for (int[] row : arr) {
            rowCount++;
        }
        return rowCount;
    }

    //Trying to reverse the array
    static int[] reverseArray(int[] arr){
        int[] ans = new int[LengthOfArray(arr)];
        int len = LengthOfArray(arr);
        for (int i = 0; i <LengthOfArray(arr); i++) {
            ans[len-1]=arr[i];
            len=len-1;
        }

        return ans;
    }




    //Finding the max element of an array
    static int maxElement(int[] arr){
        int max=arr[0];
        for (int i = 0; i < LengthOfArray(arr); i++) {
            if(max <=arr[i]){
                max=arr[i];
            }
        }
        
        
        return max;
    }

    //Finding the min element of an array
    static int minElement(int[] arr){
        int min = arr[0];
        for (int i = 0; i < LengthOfArray(arr); i++) {
            if(min>=arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    //swapping array elements
    public static void SwapElement(int[] arr,int n,int m){
        int temp = arr[n];
        arr[n]=arr[m];
        arr[m]=temp;
    }




}
