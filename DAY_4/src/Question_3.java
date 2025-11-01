//bicycle and mountain bike
//your task is to implement two classes as shown in the diagram
//

import java.util.Scanner;

// Base class
class Bicycle {
    public int gear;
    public int speed;

    // Constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // Decrease speed
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    // Increase speed
    public void speedUp(int increment) {
        speed += increment;
    }

    // Display info
    public String toString() {
        return "No of gears are " + gear + "\n" +
                "Speed of bicycle is " + speed;
    }
}

// Derived class
class MountainBike extends Bicycle {
    public int seatHeight;

    // Constructor
    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        this.seatHeight = startHeight;
    }

    // Set seat height
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    // Override toString
    @Override
    public String toString() {
        return super.toString() + "\nSeat height is " + seatHeight;
    }
}

// Driver class
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // gear
        int y = sc.nextInt(); // speed
        int z = sc.nextInt(); // seat height

        MountainBike mb = new MountainBike(x, y, z);
        System.out.println(mb.toString());
    }
}