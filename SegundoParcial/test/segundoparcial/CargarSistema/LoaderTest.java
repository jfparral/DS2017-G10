/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.CargarSistema;

import java.io.IOException;
import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import segundoparcial.Lector;
import segundoparcial.Personas.Cliente;
import segundoparcial.Personas.User;
import segundoparcial.Platillos.Ejecutivo;
import segundoparcial.Platillos.Estudiantil;
import segundoparcial.Platillos.Platillo;
import segundoparcial.Restaurante;

/**
 *
 * @author usuario
 */
public class LoaderTest {
    
    public LoaderTest() {
    }

    /**
     * Test of cargarUsuarios method, of class Loader.
     */
    @Test
    public void testCargarUsuarios() throws IOException {
        System.out.println("cargarUsuarios");
        LinkedList<User> expResult = new LinkedList<>();
        expResult.add(new Cliente("cliente1","contrasena"));
        LinkedList<User> result = Loader.cargarUsuarios(new Lector("UsuariosTest.csv").cargarArchivo());
        assertEquals(expResult.get(0).getUsuario(), result.get(0).getUsuario());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Login method, of class Loader.
     */
    @Test
    public void testLogin() throws IOException {
        System.out.println("Login");
        LinkedList<User> lista = Loader.cargarUsuarios(new Lector("UsuariosTest.csv").cargarArchivo());
        User expResult = new Cliente("cliente1","contrasena");
        User result = Loader.Login(lista);
        //assertEquals(null, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //NO se ejecuta ya que pide datos por entrada de teclado
    }

    /**
     * Test of cargarPlatillosEjecutivos method, of class Loader.
     */
    @Test
    public void testCargarPlatillosEjecutivos() throws IOException {
        System.out.println("cargarPlatillosEjecutivos");
        LinkedList<Restaurante> p = new LinkedList<>();
        Restaurante r = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        p.add(r);
        Platillo expResult = new Ejecutivo("arroz con menestra","solo es arroz con menestra","ejecutivo","caliente","plato fuerte",r);
        LinkedList<Platillo> result = Loader.cargarPlatillosEjecutivos(new Lector("PlatillosEjecutivoTest.csv").cargarArchivo(), p);
        assertEquals(expResult.getNombre(), result.get(0).getNombre());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarPlatillosEstudiantil method, of class Loader.
     */
    @Test
    public void testCargarPlatillosEstudiantil() throws IOException {
        System.out.println("cargarPlatillosEstudiantil");
        LinkedList<Restaurante> p = new LinkedList<>();
        Restaurante r = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        p.add(r);
        Platillo expResult = new Estudiantil("pescado apanado","","","","",r);
        LinkedList<Platillo> result = Loader.cargarPlatillosEstudiantil(new Lector("PlatillosEstudiantilTest.csv").cargarArchivo(), p);
        assertEquals(expResult.getNombre(), result.get(0).getNombre());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarRestaurantes method, of class Loader.
     */
    @Test
    public void testCargarRestaurantes() throws IOException {
        System.out.println("cargarRestaurantes");
        LinkedList<Restaurante> expResult = new LinkedList<>();
        Restaurante r= new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        expResult.add(r);
        LinkedList<Restaurante> result = Loader.cargarRestaurantes(new Lector("Restaurantes.csv").cargarArchivo());
        assertEquals(expResult.get(0).getDireccion(), result.get(0).getDireccion());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
