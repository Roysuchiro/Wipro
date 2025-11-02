//Generic Data Analysis using JAVA
//Description:
//You are working on a data analysis module that needs to process different types of data. Implement a class named Question_4 with the following requirements:
//
//
//Constructor:
//
//The class should have a constructor that takes an array of type T as its parameter and initializes an internal data structure to store the provided array.
//
//Calculate Average Method:
//
//Implement a method named calculateAverage that calculates and returns the average of the elements in the array.
//Ensure that the method works for numeric types (e.g., Integer, Double) and does not require a separate implementation for each type.
//Find Maximum Method:
//
//Implement a method named findMaximum that finds and returns the maximum element in the array.
//Ensure that the method works for comparable types (e.g., Integer, String) and does not require a separate implementation for each type.
//Data Summary Method: (Pre-Implemented as a Boiler Plate Code)
//
//Implement a method named dataSummary that prints a summary of the data, including the average and maximum values.
//
//
//Sample Input:
//
//        2
//
//        4
//
//        45.9
//
//        46.8
//
//        57.3
//
//        37.8
//
//Sample Output:
//
//Data Summary:
//
//Average: 46.95
//
//Maximum: 57.3
//


import java.util.*;

public class Question_4<T extends Number & Comparable<T>> {
    private T[] data;

    // Constructor
    public Question_4(T[] data) {
        this.data = data;
    }

    // Method to calculate average
    public double calculateAverage() {
        double sum = 0.0;
        for (T element : data) {
            sum += element.doubleValue();
        }
        return sum / data.length;
    }

    // Method to find maximum
    public T findMaximum() {
        T max = data[0];
        for (T element : data) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    // Pre-implemented method
    public void dataSummary() {
        System.out.println("Data Summary:");
        System.out.println("Average: " + calculateAverage());
        System.out.println("Maximum: " + findMaximum());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        int size = sc.nextInt();

        if (ch == 1) {
            Integer[] integerData = new Integer[size];
            for (int i = 0; i < size; i++) {
                integerData[i] = sc.nextInt();
            }
            Question_4<Integer> integerAnalyzer = new Question_4<>(integerData);
            integerAnalyzer.dataSummary();
        } else if (ch == 2) {
            Double[] doubleData = new Double[size];
            for (int i = 0; i < size; i++) {
                doubleData[i] = sc.nextDouble();
            }
            Question_4<Double> doubleAnalyzer = new Question_4<>(doubleData);
            doubleAnalyzer.dataSummary();
        } else if (ch == 3) {
            Short[] shortData = new Short[size];
            for (int i = 0; i < size; i++) {
                shortData[i] = sc.nextShort();
            }
            Question_4<Short> shortAnalyzer = new Question_4<>(shortData);
            shortAnalyzer.dataSummary();
        } else if (ch == 4) {
            Float[] floatData = new Float[size];
            for (int i = 0; i < size; i++) {
                floatData[i] = sc.nextFloat();
            }
            Question_4<Float> floatAnalyzer = new Question_4<>(floatData);
            floatAnalyzer.dataSummary();
        }

        sc.close();
    }
}