// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // ==> just checking everythin working is fine
        System.out.println("Hello sndp");

        //now check for program
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            checkPrime(i);
        }

        //everything working now i can move to the dsa
        //for make everything crystal clear i will try to make separate file and folder as much as i can
        //so it's easy for me to check my code
    }
    static void checkPrime(int n){
        boolean flag=false;
        for (int i=2;i<=n/2; i++){
            if (n%i==0){
                    flag = true;
                    break;
            }

        }
        if(!flag){
            System.out.println("it is prime num");
        }
        else {
            System.out.println("it not prime");
        }
    }
}