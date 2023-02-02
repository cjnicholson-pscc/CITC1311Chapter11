/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopolymophism;

/**
 *
 * @author cjnicholson
 */
public class Triangle extends GeometricObject {

    private double base;
    private double height;
    private double side1, side2, side3;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getHeight() {
        return height;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public Triangle(double base, double side1, double side2, double side3) {
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double base, double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    
    
    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
}
