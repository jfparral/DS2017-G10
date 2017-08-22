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
public class PostreTest {
    
    public PostreTest() {
    }

    /**
     * Test of Precio method, of class Postre.
     */
    @Test
    public void testPrecio() {
        System.out.println("Precio");
        Postre instance = new Postre("postre");
        instance.Precio();
    }

    /**
     * Test of Sabor method, of class Postre.
     */
    @Test
    public void testSabor() {
        System.out.println("Sabor");
        Postre instance = new Postre("postre");
        instance.Sabor();
    }
    
}
