//Sum of All Numbers
//Find the sum of the digits using recursion
//
//
//
//Input:
//
//        4246
//
//Output:
//
//        16
//
//Explanation:
//
//        4+2+4+6 is 16
//
//
//
//
//
//
//
//Input:
//
//        -32
//
//Output:
//
//        5
//
//Explanation:
//
//        3+2
//
//
//
//Input value ranges in the range of Integer data type.


import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {

        //write your answer here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(sumOfDig(n));
    }
    static int sumOfDig(int n){
        if(n== 0){
            return 0;
        }
        return (n%10)+sumOfDig(n/10);

    }
}
