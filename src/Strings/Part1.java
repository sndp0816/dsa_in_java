package Strings;

public class Part1 {

//    A defanged IP address replaces every period "." with "[.]".

    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

//    You are given a string s and an integer array indices of the same length.
//    The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
    public static String restoreString(String s, int[] indices) {


        char[] array = new char[indices.length];
        for(int i = 0 ; i < indices.length ; i++){
            array[indices[i]] = s.charAt(i);
        }
        return new String(array);

    }

//    You own a Goal Parser that can interpret a string command.
//    The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
//    The Goal Parser will interpret "G" as the string "G", "()" as the string "o",
//    and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

    public String interpret(String command) {

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < command.length(); i++){
            if (command.charAt(i) == 'G'){
                sb.append("G");
            }else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
                sb.append("o");
                i++;
            }
            else{
                sb.append("al");
                i +=3;
            }

        }
        return sb.toString();
    }

//     return the string after replacing every uppercase letter with the same lowercase letter.
    public static String toLowerCase(String str) {
        final int diff = 'A' - 'a';

        char[] ans = str.toCharArray();

        for (int i = 0; i < ans.length; ++i)
            if (ans[i] >= 'A' && ans[i] <= 'Z')
                ans[i] -= diff;

        return new String(ans);
    }

    public static void main(String[] args) {

//        String address = "1.1.1.1";
//        System.out.println(defangIPaddr(address));

//        String s = "codeleet";
//        int[] arr = {4,5,6,7,0,2,1,3};
//
//       String result = restoreString(s,arr);
//        System.out.println(result);
//
//
//        String str = "SANDEEP";
//        System.out.println(toLowerCase(str));



    }
}
