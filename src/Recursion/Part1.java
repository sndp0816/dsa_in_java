package Recursion;

public class Part1 {
    public static void main(String[] args) {

        /*

        Recursion means "defining a problem in terms of itself".
        This can be a very powerful tool in writing algorithms.
        Recursion comes directly from Mathematics,
        where there are many examples of expressions written in terms of themselves.
        For example, the Fibonacci sequence is defined as: F(i) = F(i-1) + F(i-2)


        while the function not finishing the execution process it will remain in stack.
        when the function is completed its task then it will automatically remove form the stack.

        In recursion condition is compulsory otherwise it will keep going until stack overflow
        or memory crash.

         */

//        number1(10);

//        number2(5);

        System.out.println( fibbo(5));

    }

    //print number 1 to 5 using recursion
    public static void number1(int n){

        if (n!=1){
            number1(n-1);
            System.out.println(n);
        }
        else {
            System.out.println(n);
        }
    }

    //print number 5 to 1 using recursion

    public static void number2(int n){

        if(n!=1){
            System.out.println(n);
            number2(n-1);
        }
        else {
            System.out.println(n);
        }

    }

    //find the n th number in fibbonacci number

    public static int fibbo(int n){

        if(n==0){
            return 0;
        } else if (n == 1 || n==2) {
            return 1;
        }

        return fibbo(n-1)+fibbo(n-2);

    }



}
