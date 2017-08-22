/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Extras;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class JugoTest {
    
    public JugoTest() {
    }

    /**
     * Test of Precio method, of class Jugo.
     */
    @Test
    public void testPrecio() {
        System.out.println("Precio");
        Jugo instance = new Jugo("jugo");
        instance.Precio();
    }

    /**
     * Test of Sabor method, of class Jugo.
     */
    @Test
    public void testSabor() {
        System.out.println("Sabor");
        Jugo instance = new Jugo("jugo");
        instance.Sabor();
    }
    
}
