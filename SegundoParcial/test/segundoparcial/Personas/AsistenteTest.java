/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Personas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import segundoparcial.Restaurante;

/**
 *
 * @author hp
 */
public class AsistenteTest {
    
    public AsistenteTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getRestaurante method, of class Asistente.
     */
    @Test
    public void testGetRestaurante() {
        System.out.println("getRestaurante");
        Asistente instance = new Asistente("asis", "contrasena");
        Restaurante expResult = new Restaurante("restaurante de prueba", "direccion", "telefono", "dueno");
        instance.setRestaurante(expResult);        
        Restaurante result = instance.getRestaurante();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRestaurante method, of class Asistente.
     */
    @Test
    public void testSetRestaurante() {
        System.out.println("setRestaurante");
        Restaurante restaurante = new Restaurante("restaurante de prueba", "direccion1", "0948623", "Juan");
        Asistente instance = new Asistente("asis", "contrasena");
        instance.setRestaurante(restaurante);
        assertEquals(instance.getRestaurante(), restaurante);
    }
    
}
