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
public class CreditCardTest {
    
    public CreditCardTest() {
    }

    /**
     * Test of Validar method, of class CreditCard.
     */
    @Test
    public void testValidar() {
        System.out.println("Validar");
        CreditCard instance = new CreditCard(new Cliente("usuario", "contrasena"), 50);
        boolean expResult = true;
        boolean result = instance.Validar();
        assertEquals(expResult, result);
    }

    /**
     * Test of RealizarPago method, of class CreditCard.
     */
    @Test
    public void testRealizarPago() {
        System.out.println("RealizarPago");
        double costo = 3.0;
        CreditCard instance = new CreditCard(new Cliente("usuario", "contrasena"), 50);
        instance.RealizarPago(costo);
    }
    
}
