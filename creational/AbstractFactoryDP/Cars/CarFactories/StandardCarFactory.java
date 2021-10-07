package creational.AbstractFactoryDP.Cars.CarFactories;

import creational.AbstractFactoryDP.CarComponents.CarType;
import creational.AbstractFactoryDP.CarComponents.Complectation;
import creational.AbstractFactoryDP.Cars.Car;
import creational.AbstractFactoryDP.Cars.CarFactory;

public class StandardCarFactory extends Car{

    public StandardCarFactory(CarType type){
        super(type, Complectation.STANDARD);
    }

    @Override
    public String construct() {
        return "Car produced: \n Model - "+ type + "; Complectation - " + complectation;
    }
}
