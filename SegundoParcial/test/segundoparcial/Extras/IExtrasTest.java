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
public class IExtrasTest {
    
    public IExtrasTest() {
    }

    /**
     * Test of getTipoExtra method, of class IExtras.
     */
    @Test
    public void testGetTipoExtra() {
        System.out.println("getTipoExtra");
        IExtras instance = new Jugo("jugo");
        String expResult = "jugo";
        String result = instance.getTipoExtra();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipoExtra method, of class IExtras.
     */
    @Test
    public void testSetTipoExtra() {
        System.out.println("setTipoExtra");
        String tipoExtra = "nuevo tipo";
        IExtras instance = new Jugo("jugo");
        instance.setTipoExtra(tipoExtra);
    }

    /**
     * Test of getPrecio method, of class IExtras.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        IExtras instance = new Jugo("jugo");
        double expResult = 0.5;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPrecio method, of class IExtras.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 0.9;
        IExtras instance = new Jugo("jugo");
        instance.setPrecio(precio);
    }

    /**
     * Test of Precio method, of class IExtras.
     */
    @Test
    public void testPrecio() {
        System.out.println("Precio");
        IExtras instance = new Jugo("jugo");
        instance.Precio();
    }

    /**
     * Test of Sabor method, of class IExtras.
     */
    @Test
    public void testSabor() {
        System.out.println("Sabor");
        IExtras instance = new Jugo("jugo");
        instance.Sabor();
    }

    public class IExtrasImpl extends IExtras {

        public IExtrasImpl() {
            super("tipo");
        }

        public void Precio() {
        }

        public void Sabor() {
        }
    }
    
}
