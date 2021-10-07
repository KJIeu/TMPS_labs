package creational.FactoryDP;

public class Sedan implements Car{

    @Override
    public void produceCar(){
        System.out.println("Sedan factory produced one sedan");
    }
}
