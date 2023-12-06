package StarPatterns;

public class one_ten {
    public static void main(String[] args) {

        //follow the StarPattern.pdf i attach to doct folder the file represent the graphical view
        //or use the following link
        // https://docs.google.com/document/d/1O4QIgCE-QbR70gFToLgc5xdhfeowHIqq7GYu8iRwOf4/edit?usp=sharing



        //calling the pattern function
        pattern10(5);
    }

    static void pattern1(int n){
        //this outer line for rows
        for (int i = 1; i <= n; i++) {
            //this is for column
            for (int j = 1; j <= i; j++) {
                //removing the new line from the println
                System.out.print(" * ");
            }
            //printing the new line only for new rows
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i==1 || j==1 || i==n || j==n){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {

                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%2==0){
                    System.out.print(" 0 ");
                }else {
                    System.out.print(" 1 ");
                }
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==0){
                    System.out.print(" 0 ");
                }else {
                    System.out.print(" 1 ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern10(int n)
    {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}


