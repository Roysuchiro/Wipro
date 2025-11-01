//Question:
//Write a program that takes two boolean values as input and performs logical operations (AND, OR) on them using the logical operators& print the result.



import java.util.Scanner;
public class Question_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean input1 = scanner.nextBoolean();
        boolean input2 = scanner.nextBoolean();
        boolean res_and = input1 && input2;
        boolean res_or = input1 || input2;
        System.out.println(res_and);
        System.out.println(res_or);

    }
}