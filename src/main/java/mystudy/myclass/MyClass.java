package mystudy.myclass;

import lombok.Getter;

public class MyClass {
    public static void main(String[] args) {
        Car car = new Car("white", "4");
        System.out.println("car.colorWheels() = " + car.colorWheels());
        System.out.println("car.howManySeater() = " + car.howManySeater(new Seat("4")));
        car.changeColor("white black");
        System.out.println("car.colorWheels() = " + car.colorWheels());
        System.out.println();

        Airplane airplane = new Airplane("blue", "3");
        System.out.println("airplane.colorWheels() = " + airplane.colorWheels());
        System.out.println("airplane.howManySeater() = " + airplane.howManySeater(new Seat("3")));
        System.out.println();


        Vehicle vehicle = new Car("black", "2");
        System.out.println("vehicle.colorWheels() = " + vehicle.colorWheels());
        System.out.println("vehicle.howManySeater() = " + vehicle.howManySeater(new Seat("0")));
        System.out.println();


        MiniAirplane miniAirplane = new MiniAirplane("3");
        System.out.println("miniAirplane.colorWheels() = " + miniAirplane.colorWheels());
        System.out.println("miniAirplane.howManySeater() = " + miniAirplane.howManySeater(new Seat("3")));
        System.out.println();


    }

}

abstract class Vehicle implements Seater {
    protected String color;
    protected final String wheels;


    public Vehicle(String wheels) {
        this.wheels = wheels;
    }

    public Vehicle(String color, String wheels) {
        this.color = color;
        this.wheels = wheels;
    }

    public String colorWheels() {
        return "color : " + color + ", wheels : " + wheels;
    }

}

class Car extends Vehicle {

    public Car(String color, String wheels) {
        super(color, wheels);
    }

    @Override
    public String howManySeater(Seat seat) {
        return seat.getSeat() + " 인승";
    }

    public void changeColor(String color) {
        this.color = color;
    }
}

class Airplane extends Vehicle {

    public Airplane(String color, String wheels) {
        super(color, wheels);
    }

    @Override
    public String howManySeater(Seat seat) {
        return seat.getSeat() + "인승";
    }
}

class MiniAirplane extends Airplane {

    public MiniAirplane(String wheels) {
        super("white", wheels);
    }

}

interface Seater {
    String howManySeater(Seat seat);
}

class Seat {
    String seat;
    public Seat(String seat) {
        this.seat = seat;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}