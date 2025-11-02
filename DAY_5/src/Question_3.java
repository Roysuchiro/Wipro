//Exception Handling
//Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.
//
//
//
//Sample Output:
//
//Original string: Java handling and managing exceptions
//
//String contains vowels.
//
//
//
//Original string: Typy gyps fly.
//
//String does not contain any vowels


import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            String text = s.nextLine();
            System.out.println("Original string: " + text);
            checkVowels(text);
            System.out.println("String contains vowels.");
        }
        catch (NoVowelsException e) {
            System.out.println("String does not contain any vowels");
        }

        s.close();
    }

    public static void checkVowels(String text) throws NoVowelsException {
        if (!text.toLowerCase().matches(".*[aeiou].*")) {
            throw new NoVowelsException();
        }
    }
}
class NoVowelsException extends Exception {
    public NoVowelsException() {
        super("No vowels found");
    }
}
