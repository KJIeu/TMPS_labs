package lab2.structural.Flyweight;

import lab2.structural.RoundedShapes.Circle;
import lab2.structural.Bridge.DrawAPI;
import lab2.structural.RoundedShapes.RoundedShape;

import java.util.HashMap;

public class CircleFactory {
    private static final HashMap circleMap = new HashMap();

    public static RoundedShape getCircle(int radius, DrawAPI drawAPI){
        Circle circle = (Circle) circleMap.get(radius);

        if(circle == null){
            circle = new Circle(10, 10, radius, drawAPI);
            circleMap.put(radius, circle);
            System.out.println("Creating circle with radius: " + radius);
        }
        return circle;
    }
}
