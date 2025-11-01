//Question:
//Write a program in java to check whether the given number is an even number or not using if else statement.


import java.util.Scanner;
public class Question_4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("No is Even");
        } else {
            System.out.println("No is Odd");
        }

        sc.close();

    }
}
