/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Personas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import segundoparcial.Pagos.Carnet;
import segundoparcial.Pagos.CreditCard;

/**
 *
 * @author hp
 */
public class ClienteTest {
    
    public ClienteTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getTarjeta method, of class Cliente.
     */
    @Test
    public void testGetTarjeta() {
        System.out.println("getTarjeta");
        Cliente instance = new Cliente("cliente", "contrasena");
        CreditCard expResult = new CreditCard(instance, 50);
        instance.setTarjeta(expResult);
        CreditCard result = instance.getTarjeta();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTarjeta method, of class Cliente.
     */
    @Test
    public void testSetTarjeta() {
        System.out.println("setTarjeta");
        CreditCard tarjeta = new CreditCard(new Cliente("usuario", "contrasena"), 50);
        Cliente instance = new Cliente("usuario", "contrasena");
        instance.setTarjeta(tarjeta);
    }

    /**
     * Test of getCarnet method, of class Cliente.
     */
    @Test
    public void testGetCarnet() {
        System.out.println("getCarnet");
        Cliente instance = new Cliente("usuario", "contrasena");
        Carnet expResult = new Carnet(instance, 50);
        instance.setCarnet(expResult);
        Carnet result = instance.getCarnet();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCarnet method, of class Cliente.
     */
    @Test
    public void testSetCarnet() {
        System.out.println("setCarnet");
        Carnet carnet = new Carnet(new Cliente("usuario", "contrasena"), 50);
        Cliente instance = new Cliente("usuario", "contrasena");
        instance.setCarnet(carnet);
    }

    /**
     * Test of AgregarCarnet method, of class Cliente.
     */
    @Test
    public void testAgregarCarnet() {
        System.out.println("AgregarCarnet");
        Cliente instance = new Cliente("usuario", "contrasena");
        instance.AgregarCarnet();
    }

    /**
     * Test of AgregarTarjeta method, of class Cliente.
     */
    @Test
    public void testAgregarTarjeta() {
        System.out.println("AgregarTarjeta");
        Cliente instance = new Cliente("usuario", "contrasena");
        instance.AgregarTarjeta();
    }
    
}
