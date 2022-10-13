package Homework;

public class Homework_05_10_2022_1 {


    public static class Vehicle {
        int numberOfPassengers;

        public void testDrive() {
            System.out.println("TestDrive is successful!");
        }
    }

    public static class Motorcycle extends Vehicle {

        public void description() {
            int numberOfPassengers = 2;
            System.out.println("has 2 wheels");
            System.out.println("Number of passengers = " + numberOfPassengers);
        }
    }

    public static class Car extends Vehicle {
        public void description() {
            int numberOfPassengers = 4;
            System.out.println("has 4 wheels");
            System.out.println("Number of passengers = " + numberOfPassengers);
        }
    }

    public static class setMotorcycle extends Motorcycle {
        public static void main(String[] args) {
            setMotorcycle honda = new setMotorcycle();
            honda.description();
            honda.testDrive();
        }

    }

    public static class setCar extends Car {
        public static void main(String[] args) {
            setCar Opel = new setCar();
            Opel.description();
            Opel.testDrive();
        }
    }
}
