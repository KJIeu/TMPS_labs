package creational.AbstractFactoryDP.Cars;


import creational.AbstractFactoryDP.CarComponents.CarType;
import creational.AbstractFactoryDP.CarComponents.Complectation;

public abstract class Car {

        public Car(CarType type, Complectation complectation){
            this.type = type;
            this.complectation = complectation;
        }


        protected CarType type;
        protected Complectation complectation;
        //getters and setters

        public String construct() {
            return "Model - "+ type + "; Complectation - " + complectation;
        }
}