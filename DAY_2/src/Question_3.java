//Reverse each word in a string
//Write a function to reverse each word in a string.
//
//Description :- A method has to be created that takes a string as input and extracts each word from that string and then reverse each word individually and gives the output as a reversed string.
//
//        Example :-
//
//Input:- great learning
//
//output :- taerg gninrael
//
//input :- hello guys how are you
//
//output :- olleh syug woh era uoy
//
//
//
//Explanations :- As the input string is great learning, each word has to be extracted i.e. great and learning then individually each word has to be reversed so it will be taerg and gninrael. after combining these two words into as single string the final output will be taerg gninrael.


public class Question_3 {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        String input = "Great Learning";

        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            result.append(reversedWord).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
