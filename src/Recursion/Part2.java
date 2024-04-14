package Recursion;

public class Part2 {

    //factorial using recursion
    public static int Fact(int n){

        if (n==1 || n==0){
            return 1;
        }
        return n * Fact(n-1);
    }

    // 5 => 15 exp 5+4+3+2+1
    public static int Sum(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return n + Sum(n-1);
    }

    //(123) => 6 || (432) => 9
    public static int Sum2(int n){

        if (n==0){
            return 0;
        }
        return (n%10)+Sum2(n/10);

    }

    //(123) => 6 || (22) => 4
    public static int Product(int n){

        if (n%10==n){
            return n;
        }
        return (n%10)*Product(n/10);

    }

    //(123) => 321 || (4356) => 6534 reverse the number
    static int temp = 0;
    public static void Rev(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        temp = temp * 10 + rem;
       Rev(n/10);
    }

    /*
    A man want to cross the river. the river is 12 meter long and man can swim 4 meter per day but the flow of
    river take the man backward 1 meter then how many days man take to cross the river.
     */
    public static int riddle(int river,int man,int day){
        if(man>river){
            return day;
        }
        return riddle(river,man+3,day+1);
    }



    public static int maxValueFor(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (temp<arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }

    public static int maxValue(int[] arr,int index,int max){
        int temp = max;
        if(arr.length==index){
            return temp;
        }
        else if(arr[index]>max){
            max = arr[index];
            return maxValue(arr,+1,max);
        }
        return maxValue(arr,index+1,max);
    }

    public static int minValue(int[] arr,int index,int min){
        int temp = min;
        if(arr.length==index){
            return temp;
        }
        else if(arr[index]<min){
            min = arr[index];
            return minValue(arr,index+1,min);
        }
        return minValue(arr,index+1,min);
    }

    public static  int minMax(int[] arr,int index,int value,boolean isMax){
        if(arr.length==index){
            return value;
        } else if (isMax) {
            if(arr[index]>value){
                value = arr[index];
                return minMax(arr,index+1,value,isMax);
            }
            return minMax(arr,index+1,value,isMax);
        }
        else if(arr[index]<value){
            value = arr[index];
            return minMax(arr,index+1,value,isMax);
        }
        return minMax(arr,index+1,value,isMax);

    }

    public static void main(String[] args) {
//        System.out.println(Fact(0));

//        System.out.println(Product(22));

//        Rev(123);
        int[] arr1 = {7,5,91,1,42};
//        int result = maxValue(arr1,0,arr1[0]);
//        System.out.println(result);


//        System.out.println(minValue(arr1,0,arr1[0]));
        System.out.println(minMax(arr1,0,arr1[0],true ));
    }
}
