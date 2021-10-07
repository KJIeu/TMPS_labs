package creational.AbstractFactoryDP.Cars.CarFactories;

import creational.AbstractFactoryDP.CarComponents.CarType;
import creational.AbstractFactoryDP.CarComponents.Complectation;
import creational.AbstractFactoryDP.Cars.Car;

public class LuxuryCarFactory extends Car {

    public LuxuryCarFactory(CarType type){
        super(type, Complectation.LUXURY);
    }

    @Override
    public String construct() {
        return "Car produced: \n Model - "+ type + "; Complectation - " + complectation;
    }
}
