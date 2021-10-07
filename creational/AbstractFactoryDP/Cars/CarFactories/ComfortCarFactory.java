package creational.AbstractFactoryDP.Cars.CarFactories;

import creational.AbstractFactoryDP.CarComponents.CarType;
import creational.AbstractFactoryDP.CarComponents.Complectation;
import creational.AbstractFactoryDP.Cars.Car;

public class ComfortCarFactory extends Car {
    public ComfortCarFactory(CarType type){
        super(type, Complectation.COMFORT);
    }

    @Override
    public String construct() {
        return "Car produced: \n Model - "+ type + "; Complectation - " + complectation;
    }
}
