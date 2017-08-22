/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Pagos;

import org.junit.Test;
import static org.junit.Assert.*;
import segundoparcial.Personas.Cliente;

/**
 *
 * @author hp
 */
public class CarnetTest {
    
    public CarnetTest() {
    }

    /**
     * Test of Validar method, of class Carnet.
     */
    @Test
    public void testValidar() {
        System.out.println("Validar");
        Carnet instance = new Carnet(new Cliente("usuario", "contrasena"), 50);
        boolean expResult = true;
        boolean result = instance.Validar();
        assertEquals(expResult, result);
    }

    /**
     * Test of RealizarPago method, of class Carnet.
     */
    @Test
    public void testRealizarPago() {
        System.out.println("RealizarPago");
        double costo = 3.0;
        Carnet instance = new Carnet(new Cliente("usuario", "contrasena"), 50);
        instance.RealizarPago(costo);
    }
    
}
