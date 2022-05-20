package activities;

public class Activity1 {

    public static void main(String args[]) {
        Car carName = new Car();
        carName.make =2014;
        carName.color = "Black";
        carName.transmission = "Manual";
        carName.displayCharacteristics();
        carName.accelarate();
        carName.brake();
    }
}

class Car{
     String color;
     String transmission;
     int make;
     int tyres;
     int doors;

    Car(){
        this.tyres = 4;
        this.doors = 4;
    }
    void displayCharacteristics(){
        System.out.println("Car color is " + color);
        System.out.println("Transmission of Car is " + transmission);
        System.out.println("year of car make is " + make);
        System.out.println("No.of doors in car is " + doors);
        System.out.println("No.of doors in tyres is " + tyres);
    }
    void accelarate(){
        System.out.println("Car is moving forward.");
    }

    void brake(){
        System.out.println("Car has stopped.");
    }
}
