package lab2.structural.Adapter;

import lab2.structural.SimpleShapes.SimpleShape;

public class RectangleAdapter implements SimpleShape {
    private SimpleShape adaptee;

    public RectangleAdapter(SimpleShape rectangle)
    {
        this.adaptee = rectangle;

    }

    @Override
    public void draw(int x1, int y1, int x2, int y2){
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);

        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);

        adaptee.draw(x, y, width, height);
    }

    public String toString(){
        return("Rectangle");
    }
}
