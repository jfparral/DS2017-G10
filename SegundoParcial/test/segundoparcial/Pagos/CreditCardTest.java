/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Pagos;

import org.junit.Test;
import static org.junit.Assert.*;
import segundoparcial.Personas.Cliente;
import segundoparcial.Platillos.Ejecutivo;
import segundoparcial.Platillos.Estudiantil;
import segundoparcial.Platillos.Platillo;

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
    
    @Test
    public void testCompra1() {
        System.out.println("Compra1");
        Platillo platillo = new Estudiantil("nombre", "descripcion", "categoria", "teperatura", "tipo", null);
        platillo.PrecioPlatillo();        
        CreditCard instance = new CreditCard(new Cliente("usuario", "contrasena"), 50);
        instance.RealizarPago(platillo.getPrecio());
        CreditCard instance2 = new CreditCard(new Cliente("usuario", "contrasena"), 1);
        instance2.RealizarPago(platillo.getPrecio());        
    }
    
    @Test
    public void testCompra2() {
        System.out.println("Compra2");
        Platillo platillo = new Ejecutivo("nombre", "descripcion", "categoria", "teperatura", "tipo", null);
        platillo.PrecioPlatillo();        
        CreditCard instance = new CreditCard(new Cliente("usuario", "contrasena"), 50);
        instance.RealizarPago(platillo.getPrecio());
        CreditCard instance2 = new CreditCard(new Cliente("usuario", "contrasena"), 1);
        instance2.RealizarPago(platillo.getPrecio());        
    }
    
    @Test
    public void testCompra3() {
        System.out.println("Compra3");
        Platillo platillo = new Ejecutivo("nombre", "descripcion", "categoria", "teperatura", "tipo", null);
        platillo.setPrecio(3.5);
        CreditCard instance = new CreditCard(new Cliente("usuario", "contrasena"), 50);
        instance.RealizarPago(platillo.getPrecio());
        CreditCard instance2 = new CreditCard(new Cliente("usuario", "contrasena"), 1);
        instance2.RealizarPago(platillo.getPrecio());        
    }
    
    @Test
    public void testCompra4() {
        System.out.println("Compra4");
        Platillo platillo = new Ejecutivo("nombre", "descripcion", "categoria", "teperatura", "tipo", null);
        platillo.setPrecio(3.75);
        CreditCard instance = new CreditCard(new Cliente("usuario", "contrasena"), 50);
        instance.RealizarPago(platillo.getPrecio());
        CreditCard instance2 = new CreditCard(new Cliente("usuario", "contrasena"), 1);
        instance2.RealizarPago(platillo.getPrecio());        
    }
    
    @Test
    public void testCompra5() {
        System.out.println("Compra5");
        Platillo platillo = new Ejecutivo("nombre", "descripcion", "categoria", "teperatura", "tipo", null);
        platillo.setPrecio(4.25);
        CreditCard instance = new CreditCard(new Cliente("usuario", "contrasena"), 50);
        instance.RealizarPago(platillo.getPrecio());
        CreditCard instance2 = new CreditCard(new Cliente("usuario", "contrasena"), 1);
        instance2.RealizarPago(platillo.getPrecio());        
    }
}
