/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopolymophism;

/**
 *
 * @author nicho
 */
public class DemoPolymophism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Circle circle = new Circle(4, "red", false);
       Rectangle rectangle = new Rectangle(4,5,"orange",true);
       
       System.out.println(rectangle.getArea());
       circle.printCircle();
       
       GeometricObject geometricObjects[] = new GeometricObject[2];
       geometricObjects[0] = circle;
       geometricObjects[1] = rectangle;
       
       for(GeometricObject geo: geometricObjects) {
           System.out.println(geo.getArea());
           
           if(geo instanceof Circle) {
               Circle c = (Circle) geo;
               System.out.println("This is the magic");
               c.printCircle();
           }
       } 
    }
    
}
