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

    public static void main(String[] args) {
//        System.out.println(Fact(0));

        System.out.println(Sum(5));

    }
}
