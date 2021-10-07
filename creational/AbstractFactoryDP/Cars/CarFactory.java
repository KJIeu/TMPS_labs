package creational.AbstractFactoryDP.Cars;

import creational.AbstractFactoryDP.CarComponents.CarType;
import creational.AbstractFactoryDP.CarComponents.Complectation;
import creational.AbstractFactoryDP.Cars.CarFactories.ComfortCarFactory;
import creational.AbstractFactoryDP.Cars.CarFactories.LuxuryCarFactory;
import creational.AbstractFactoryDP.Cars.CarFactories.StandardCarFactory;

public class CarFactory
{
    private CarFactory() {
        //Prevent instantiation
    }

    public static void buildCar(CarType type, Complectation complectation)
    {
        Car car;

        switch(complectation)
        {
            case STANDARD:
                car = new StandardCarFactory(type);
                System.out.println(car.construct());
                break;
            case COMFORT:
                car = new ComfortCarFactory(type);
                System.out.println(car.construct());
                break;
            case LUXURY:
                car = new LuxuryCarFactory(type);
                System.out.println(car.construct());
        }
    }
}
