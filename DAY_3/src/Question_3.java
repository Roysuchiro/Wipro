//Book Class
//Create a Java class named Book to represent a book. The class should have the following features:
//
//Instance Variables:
//
//title (String): to store the title of the book.
//
//author (String): to store the name of the author.
//
//year (int): to store the publication year of the book.
//
//
//
//Constructors:
//
//A default constructor that initializes the title, author, and year to default values ("Not specified", "Unknown", and 0, respectively).
//
//A parameterized constructor that takes values for title, author, and year and initializes the corresponding instance variables.
//
//
//
//Methods: A method named displayInfo that prints the details of the book (title, author, and year).
//
//
//
//Application: In the main method, create two instances of the Book class using both the default constructor and the parameterized constructor.
//
//Call the displayInfo method on each instance to display the details of the books. Your goal is to implement the Book class with appropriate constructors and methods as described.
//
//Sample Output:
//
//Book 1:
//Title: Not specified
//Author: Unknown
//Year: 0
//
//
//Book 2:
//Title: "Java Programming"
//Author: "Sakshi"
//Year: 2024
//


public class Question_3 {
    String title;
    String author;
    int year;
    Question_3(){
        this.title = "Not specified";
        this.author = "Unknown";
        this.year = 0;
    }
    Question_3(String title,String author,int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public static void main(String[] args) {

        //write your answer here
        Question_3 b1 = new Question_3();
        System.out.println("Book 1:");
        // call displayInfo();
        b1.displayInfo();
        Question_3 b2 = new Question_3("Java Programming","Sakshi",2024);
        System.out.println("Book 2:");
        // call displayInfo();
        b2.displayInfo();
    }
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println();
    }
}
