package DAY_6;
// Sort the Collection
// students are provided with a challenge to sort the given arraylist in the lesser lines of code. Student with minimum lines will win , try to write a code for it in less lines and win

// Input

// An arraylist of integers

// Output

// Sorted list

// Sample input

// 1
// 4
// 5
// 0

// output

// List before sort: [1, 4, 5, 0]
// List after sort: [0, 1, 4, 5]

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class question_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (s.hasNextInt()) list.add(s.nextInt());
        System.out.println("List before sort: " + list);
        Collections.sort(list);
        System.out.println("List after sort: " + list);
    }
}