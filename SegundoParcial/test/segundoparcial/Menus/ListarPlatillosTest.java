/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Menus;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import segundoparcial.Personas.Cliente;
import segundoparcial.Personas.User;

/**
 *
 * @author usuario
 */
public class ListarPlatillosTest {
    
    public ListarPlatillosTest() {
    }

    /**
     * Test of AgregarMenu method, of class ListarPlatillos.
     */
    @Test
    public void testAgregarMenu() {
        System.out.println("AgregarMenu");
        User usuario = new Cliente("cliente1","contrasena");
        ListarPlatillos instance = new ListarPlatillos();
        instance.AgregarMenu(usuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Implementar method, of class ListarPlatillos.
     */
//    @Test
//    public void testImplementar() {
//        System.out.println("Implementar");
//        User usuario = new Cliente("cliente1","contrasena");
//        ListarPlatillos instance = new ListarPlatillos();
//        instance.Implementar(usuario);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of getNombre method, of class ListarPlatillos.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        ListarPlatillos instance = new ListarPlatillos();
        String expResult = "Listar platillos";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
