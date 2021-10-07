package creational.FactoryDP;

public class SedanFactory implements CarFactory{

    @Override
    public Car createCarFactory() {
        return new Sedan();
    }
}
