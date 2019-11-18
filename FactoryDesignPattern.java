package com.designpatterns.creational;

/**
 * Factory design pattern is a creational design pattern which facilitates the loosely coupled
 * way of object creation.
 * Factory design pattern abstracts the object creation from client and offers client input based required object creation.
 */
public abstract class FactoryDesignPattern {
    public GeometricShape getShape(String shapeType) {
        GeometricShape geometricShape = null;

        switch (shapeType) {
            case "CIRCLE":
                geometricShape = new CircleShape();
                break;
            case "LINE":
                geometricShape = new CircleShape();
                break;
            case "RECTANGLE":
                geometricShape = new RectangleShape();
                break;
        }
        return geometricShape;
    }
}

interface GeometricShape {
    public void draw();
}

class LineShape implements GeometricShape {

    @Override
    public void draw() {
        System.out.println("Line is drawn");
    }
}

class RectangleShape implements GeometricShape {

    @Override
    public void draw() {
        System.out.println("Rectangle is drawn");
    }
}

class CircleShape implements GeometricShape {

    @Override
    public void draw() {
        System.out.println("Circle is drawn");
    }
}
