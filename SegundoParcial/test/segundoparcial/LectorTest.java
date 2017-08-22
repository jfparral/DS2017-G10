/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import segundoparcial.CargarSistema.Loader;

/**
 *
 * @author usuario
 */
public class LectorTest {
    
    public LectorTest() {
    }

    /**
     * Test of getArchivo method, of class Lector.
     */
    @Test
    public void testGetArchivo() {
        System.out.println("getArchivo");
        Lector instance = new Lector("Restaurantes.csv");
        String expResult = "Restaurantes.csv";
        String result = instance.getArchivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setArchivo method, of class Lector.
     */
    @Test
    public void testSetArchivo() {
        System.out.println("setArchivo");
        String archivo = "Prueba2.csv";
        Lector instance = new Lector("Prueba.csv");
        instance.setArchivo(archivo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarArchivo method, of class Lector.
     */
    @Test
    public void testCargarArchivo() throws Exception {
        System.out.println("cargarArchivo");
        Lector instance = new Lector("Restaurantes.csv");
        LinkedList<String> expResult = new Lector("Restaurantes.csv").cargarArchivo();
        LinkedList<String> result = instance.cargarArchivo();
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
