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
import segundoparcial.Platillos.Estudiantil;
import segundoparcial.Platillos.Platillo;

/**
 *
 * @author usuario
 */
public class RestauranteTest {
    
    public RestauranteTest() {
    }
 
    /**
     * Test of getNombre method, of class Restaurante.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Restaurante instance = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        String expResult = "Restaurante1";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Restaurante.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Restaurante2";
        Restaurante instance = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Restaurante.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Restaurante instance = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        String expResult = "ave 1 direccion al azar";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class Restaurante.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "Salinas";
        Restaurante instance = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Restaurante.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Restaurante instance = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        String expResult = "28864551";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Restaurante.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "2576618";
        Restaurante instance = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDueno method, of class Restaurante.
     */
    @Test
    public void testGetDueno() {
        System.out.println("getDueno");
        Restaurante instance = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        String expResult = "Sixto Ramirez";
        String result = instance.getDueno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDueno method, of class Restaurante.
     */
    @Test
    public void testSetDueno() {
        System.out.println("setDueno");
        String dueno = "Juan Perez";
        Restaurante instance = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        instance.setDueno(dueno);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlatillos method, of class Restaurante.
     */
    @Test
    public void testGetPlatillos() {
        System.out.println("getPlatillos");
        Restaurante instance = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        LinkedList<Platillo> expResult = new LinkedList<>();
        
        LinkedList<Platillo> result = instance.getPlatillos();
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPlatillos method, of class Restaurante.
     */
    @Test
    public void testSetPlatillos() {
        System.out.println("setPlatillos");
        LinkedList<Platillo> platillos = new LinkedList<>();
        Restaurante instance = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        instance.setPlatillos(platillos);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getAsistentes method, of class Restaurante.
     */
    @Test
    public void testGetAsistentes() {
        System.out.println("getAsistentes");
        Restaurante instance = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        LinkedList<String> expResult = new LinkedList<>();
        LinkedList<String> result = instance.getAsistentes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAsistentes method, of class Restaurante.
     */
    @Test
    public void testSetAsistentes() {
        System.out.println("setAsistentes");
        LinkedList<String> asistentes = new LinkedList<>();
        Restaurante instance = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        instance.setAsistentes(asistentes);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of agregarPlatillo method, of class Restaurante.
     */
    @Test
    public void testAgregarPlatillo() {
        System.out.println("agregarPlatillo");
        LinkedList<Restaurante> p = new LinkedList<>();
        Restaurante r = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        p.add(r);
        Platillo expResult = new Estudiantil("pescado apanado","","","","",r);
        r.agregarPlatillo(expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of agregarAsistente method, of class Restaurante.
     */
    @Test
    public void testAgregarAsistente() {
        System.out.println("agregarAsistente");
        String a = "";
        Restaurante instance = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        instance.agregarAsistente(a);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
