package lab2.structural.RoundedShapes;

import lab2.structural.Bridge.DrawAPI;

public class Circle extends RoundedShape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw(){
        drawAPI.drawCircle(radius, x, y);
    }

    public String toString(){
        return("Circle");
    }

}
