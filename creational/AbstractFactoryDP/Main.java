package creational.AbstractFactoryDP;

import creational.AbstractFactoryDP.CarComponents.CarType;
import creational.AbstractFactoryDP.CarComponents.Complectation;
import creational.AbstractFactoryDP.Cars.CarFactory;

public class Main {

    public static void main(String[] args) {
        CarFactory.buildCar(CarType.HATCHBACK, Complectation.COMFORT);
        CarFactory.buildCar(CarType.SEDAN, Complectation.STANDARD);
        CarFactory.buildCar(CarType.CUOPE, Complectation.LUXURY);
    }
}
