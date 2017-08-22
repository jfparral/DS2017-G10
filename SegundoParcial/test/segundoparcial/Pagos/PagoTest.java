/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Pagos;

import org.junit.Test;
import static org.junit.Assert.*;
import segundoparcial.Personas.Cliente;
import segundoparcial.Personas.User;

/**
 *
 * @author hp
 */
public class PagoTest {
    
    public PagoTest() {
    }

    /**
     * Test of getEstudiante method, of class Pago.
     */
    @Test
    public void testGetEstudiante() {
        System.out.println("getEstudiante");
        Cliente cliente = new Cliente("usuario", "contrasena");
        Pago instance = new CreditCard(cliente, 50);
        User expResult = cliente;
        User result = instance.getEstudiante();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEstudiante method, of class Pago.
     */
    @Test
    public void testSetEstudiante() {
        System.out.println("setEstudiante");
        User estudiante = new Cliente("usuario", "contrasena");
        Pago instance = new CreditCard(new Cliente("otro usuario", "contrasena"), 50);
        instance.setEstudiante(estudiante);
    }

    /**
     * Test of getSaldo method, of class Pago.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Pago instance = new Carnet(new Cliente("usuario", "contrasena"), 50);
        double expResult = 50.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setSaldo method, of class Pago.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        double saldo = 1.0;
        Pago instance = new Carnet(new Cliente("usuario", "contrasena"), 50);
        instance.setSaldo(saldo);
    }

    /**
     * Test of Validar method, of class Pago.
     */
    @Test
    public void testValidar() {
        System.out.println("Validar");
        Pago instance = new Carnet(new Cliente("usuario", "contrasena"), 50);
        boolean expResult = true;
        boolean result = instance.Validar();
        assertEquals(expResult, result);
    }

    /**
     * Test of RealizarPago method, of class Pago.
     */
    @Test
    public void testRealizarPago() {
        System.out.println("RealizarPago");
        double costo = 3.0;
        Pago instance = new Carnet(new Cliente("usuario", "contrasena"), 50);
        instance.RealizarPago(costo);
    }

    public class PagoImpl extends Pago {

        public PagoImpl() {
            super(null, 0.0);
        }

        public boolean Validar() {
            return false;
        }

        public void RealizarPago(double costo) {
        }
    }
    
}
