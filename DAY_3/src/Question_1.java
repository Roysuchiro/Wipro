//Classes & Objects in Java
//
//
//Instructions:
//
//Write a program that takes input from the user and creates an object of a class named 'Person'. The 'Person' class should have two member variables: 'name' and 'age'. The program should prompt the user to enter their name and age, create a 'Person' object with the entered values, and then display the name and age of the person.
//
//Sample Input & Output:
//
//Sample Input:
//John
//25
//
//Sample Output:
//Name: John
//Age: 25
//Hints:
//        1. Use the 'Scanner' class to read input from the user.
//        2. Create a class named 'Person' with two member variables: 'name' and 'age'.
//        3. Use the 'new' keyword to create an object of the 'Person' class.
//        4. Use the dot operator to access the member variables of the 'Person' object.
//5. Print the name and age of the person using the 'System.out.println()' method.
//


import java.util.Scanner;

public class Question_1 {
    // TODO: Define the 'Person' class with 'name' and 'age' member variables
    String name;
    int age;

    Question_1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        // TODO: Write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();

        Question_1 p1 = new Question_1(s,n);
        System.out.println("Name: "+s);
        System.out.println("Age: "+n);
    }
}
