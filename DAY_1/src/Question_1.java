//Question 1
//Marks: 0/1
//
//Arithmetic Operators in Java
//Instructions:
//
//Write a program that takes two numbers as input from the user and performs arithmetic operations on them using the arithmetic operators (sum, difference, product, quotient, remainder) in Java.
//
//
//
import java.util.Scanner;
public class Question_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1+num2;
        int Difference = num1-num2;
        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+Difference);
        System.out.println("Product: "+num1*num2);
        System.out.println("Quotient: "+num1/num2);
        System.out.println("Remainder: "+num1%num2);
        scanner.close();
    }
}
