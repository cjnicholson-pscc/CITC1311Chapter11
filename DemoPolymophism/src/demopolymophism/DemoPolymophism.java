/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopolymophism;

import java.util.ArrayList;

/**
 *
 * @author nicho
 */
public class DemoPolymophism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList arrayList = new ArrayList();
        
        arrayList.add(new Circle(3));
        
        for(Object obj: arrayList) {
            
            if(obj instanceof Circle) {
                Circle circle = (Circle) obj;
                circle.printCircle();
            }
        }
       

    }

}
