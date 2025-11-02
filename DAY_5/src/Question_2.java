//Multiple Catch Blocks
//You are required to catch Arithmetic or number format exceptions if present using multiple catch blocks in the code for finding of 99 with the number entered by user, else print "n is a factor of 99" or "n is not a factor of 99".
//
//Sample Input
//
//5
//
//Output Format
//
//5 is a not a factor of 99
//
//
//Input
//
//        hi
//
//Output
//
//Number Format Exception java.lang.NumberFormatException: For input string: "hi"
//


import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            int n = Integer.parseInt(input);
            if (99 % n == 0)
                System.out.println(n + " is a factor of 99");
            else
                System.out.println(n + " is a not a factor of 99");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception " + e);
        }
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception " + e);
        }
        sc.close();
    }
}
