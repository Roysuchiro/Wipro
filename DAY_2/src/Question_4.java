//Equal character in string
//You are given a string s. In one move you can change any character to another character.
//
//You have to make a string which consists of the same character. Find the minimum move to do this task.
//
//        Constraints:
//
//        1 <= s.length <= 1000
//
//s consists only of lowercase characters .
//
//Input Format
//
//First line contains string s.
//
//        Output format
//
//Print the minimum move to this task.
//
//        Input
//
//        aabbbcccc
//
//output
//
//5
//
//Explanation
//
//Since  character ‘c’ has maximum frequency in string s.
//
//So we will make all other character to ‘c’so the minimum move is 5 (convert 2 ‘a’ into ‘c’ and 3 ‘b’into ‘c’).
//


import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxFreq = 0;
        for (int count : freq) {
            if (count > maxFreq) {
                maxFreq = count;
            }
        }

        int minMoves = s.length() - maxFreq;
        System.out.println(minMoves);

    }
}
