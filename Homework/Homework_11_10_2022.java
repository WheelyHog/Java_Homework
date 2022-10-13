package Homework;

class Homework_11_10_2022 {
    private static class Motorcycle {
        private String color = "Red";
        private int typeEngine;
        private double volumeEngine = 1500;
        private boolean sideCar = false;

        public Motorcycle() {
            color = "Red";
            typeEngine = 2;
        }

        public String getColor() {
            return color;
        }


        public int getTypeEngine() {
            return typeEngine;
        }

        public void setTypeEngine(int typeEngine) {
            this.typeEngine = typeEngine;
        }

        public double getVolumeEngine() {
            return volumeEngine;
        }

        public void setVolumeEngine(double volumeEngine) {
            this.volumeEngine = volumeEngine;
        }

        public boolean isSideCar() {
            return sideCar;
        }

        public void setSideCar(boolean sideCar) {
            this.sideCar = sideCar;
        }

        public Motorcycle(int typeEngine, double volumeEngine, boolean sideCar) { //constuctor has 3 parameters
            this.typeEngine = typeEngine;
            this.volumeEngine = volumeEngine;
            this.sideCar = sideCar;


        }


    }

    public static void main(String[] args) {
        Motorcycle honda = new Motorcycle(2, 1100, true);
        Motorcycle suzuki = new Motorcycle(4, 1500, false);
        String hondaColor = honda.getColor();
        System.out.println("suzuki :" + suzuki.typeEngine + " " + suzuki.volumeEngine);
        System.out.println("honda :" + honda.typeEngine + " " + honda.volumeEngine + " " + honda.sideCar + " " + hondaColor);
    }

    // Loops
    private static class Loops {
        static int a = 20, b = 18;

        private static void loop1() {
            if (a > b) {
                System.out.println("20 is greater than 18");
            } else {
                System.out.println("Have a Good Day!");
            }
        }

        private static void loop2() {
            switch (a) {
                case 6 -> System.out.println("not a");
                case 15 -> System.out.println("not a");
                case 20 -> System.out.println("YES");
            }
        }

        private static void whileLoop() {
            while (a > b) {
                System.out.println(b);
                b++;
            }
        }

        private static void forLoop() {
            for (int i = 0; i < 5; i++) {
                System.out.println("a: " + a * i);
            }
        }

        private static void forEachLoop() {
            String[] motorcycles = {"Honda", "Suzuki", "BMW", "Yamaha"};
            for (String i : motorcycles) {
                System.out.println(i);
            }
        }

        public static void main(String[] args) {
            loop1();
            loop2();
            whileLoop();
            forLoop();
            forEachLoop();
        }
    }

}
