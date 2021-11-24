package lab2.structural.Decorator;

import lab2.structural.SimpleShapes.SimpleShape;

public abstract class SimpleShapeDecorator implements SimpleShape {
    protected SimpleShape decoratedSimpleShape;

    public SimpleShapeDecorator(SimpleShape decoratedSimpleShape){
        this.decoratedSimpleShape = decoratedSimpleShape;
    }

    public void draw(int x, int y, int z, int j){
        decoratedSimpleShape.draw(x, y, z, j);
    }
}
