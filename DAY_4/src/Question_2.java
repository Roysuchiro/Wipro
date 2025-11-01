//SuperClass
//Create a superClass Vehicle that has a method noOfWheels() of return type void and accepts no parameters. Create two subclasses Scooter and Car which has method noOfWheels()
//
//noOfWheels() of Vehicle should display “No of wheels undefined”.
//
//noOfWheels() of Scooter should display “No of wheels 2”.
//
//noOfWheels() of Car should display “No of wheels 4”.

public class Question_2 {
    public static void main(String[] args) {

        //write your answer here
        Vehicle v1 = new Vehicle();
        Scooter s1 = new Scooter();
        Car c1 = new Car();

        v1.noOfWheels();
        s1.noOfWheels();
        c1.noOfWheels();
    }
}
class Vehicle{
    void noOfWheels(){
        System.out.println("No of wheels undefined");
    }
}
class Scooter extends Vehicle{
    void noOfWheels(){
        System.out.println("No of wheels 2");
    }
}

class Car extends Vehicle{
    void noOfWheels(){
        System.out.println("No of wheels 4");
    }
}

