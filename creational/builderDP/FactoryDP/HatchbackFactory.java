package creational.FactoryDP;

public class HatchbackFactory implements CarFactory{
    @Override
    public Car createCarFactory() {
        return new Hatchback();
    }
}
