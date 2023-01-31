/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cjnicholson
 */
public class Triangle extends GeometricObject {

    private double sideA;
    private double sideB;
    private double sideC;
    
    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC; //To change body of generated methods, choose Tools | Templates.
    }
    
}
