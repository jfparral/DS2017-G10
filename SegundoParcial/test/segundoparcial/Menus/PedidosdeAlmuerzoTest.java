/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Menus;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import segundoparcial.Personas.Cliente;
import segundoparcial.Personas.User;
import segundoparcial.Platillos.Platillo;

/**
 *
 * @author usuario
 */
public class PedidosdeAlmuerzoTest {
    
    public PedidosdeAlmuerzoTest() {
    }
    
    /**
     * Test of AgregarMenu method, of class PedidosdeAlmuerzo.
     */
    @Test
    public void testAgregarMenu() {
        System.out.println("AgregarMenu");
        User usuario = new Cliente("cliente1","contrasena");
        PedidosdeAlmuerzo instance = new PedidosdeAlmuerzo();
        instance.AgregarMenu(usuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Implementar method, of class PedidosdeAlmuerzo.
     */
//    @Test
//    public void testImplementar() {
//        System.out.println("Implementar");
//        User usuario = new Cliente("cliente1","contrasena");
//        PedidosdeAlmuerzo instance = new PedidosdeAlmuerzo();
//        instance.Implementar(usuario);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }


    /**
     * Test of getNombre method, of class PedidosdeAlmuerzo.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        PedidosdeAlmuerzo instance = new PedidosdeAlmuerzo();
        String expResult = "Pedido de almuerzo";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
