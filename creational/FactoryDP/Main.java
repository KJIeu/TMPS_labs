package creational.FactoryDP;

public class Main {

    public static void main(String[] args) {
	CarFactory carFactory = createCarByType("sedan");
	Car createCar = carFactory.createCarFactory();
	createCar.produceCar();
    }

    public static CarFactory createCarByType(String carType){
        if (carType.equalsIgnoreCase("sedan"))
            return new SedanFactory();
            else if (carType.equalsIgnoreCase("hatchback"))
                return  new HatchbackFactory();
            else  throw new RuntimeException(carType + "is unknown");

    }
}
