package lab2.structural.RoundedShapes;

import lab2.structural.Bridge.DrawAPI;

public abstract class RoundedShape {
    protected DrawAPI drawAPI;

    protected RoundedShape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();


}
