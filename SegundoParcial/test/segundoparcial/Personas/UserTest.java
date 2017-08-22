/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Personas;

import java.util.HashMap;
import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;
import segundoparcial.Menus.MenuDecorator;
import segundoparcial.Platillos.Ejecutivo;
import segundoparcial.Platillos.Platillo;
import segundoparcial.Restaurante;

/**
 *
 * @author hp
 */
public class UserTest {
    
    public UserTest() {
    }

    /**
     * Test of getUsuario method, of class User.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        User instance = new Cliente("usuario", "contrasena");
        String expResult = "usuario";
        String result = instance.getUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsuario method, of class User.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String usuario = "usuario";
        User instance = new Cliente("cliente", "contrasena");
        instance.setUsuario(usuario);
    }

    /**
     * Test of getContrasena method, of class User.
     */
    @Test
    public void testGetContrasena() {
        System.out.println("getContrasena");
        User instance = new Cliente("usuario", "contrasena");
        String expResult = "contrasena";
        String result = instance.getContrasena();
        assertEquals(expResult, result);
    }

    /**
     * Test of setContrasena method, of class User.
     */
    @Test
    public void testSetContrasena() {
        System.out.println("setContrasena");
        String contrasena = "nueva";
        User instance = new Cliente("contrasena", "contrasena");
        instance.setContrasena(contrasena);
    }

    /**
     * Test of getRestaurantes method, of class User.
     */
    @Test
    public void testGetRestaurantes() {
        System.out.println("getRestaurantes");
        User instance = new Cliente("usuario", "contrasena");
        LinkedList<Restaurante> restaurantes = new LinkedList<>();
        instance.setRestaurantes(restaurantes);
        LinkedList<Restaurante> expResult = restaurantes;
        LinkedList<Restaurante> result = instance.getRestaurantes();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRestaurantes method, of class User.
     */
    @Test
    public void testSetRestaurantes() {
        System.out.println("setRestaurantes");
        LinkedList<Restaurante> restaurantes = new LinkedList<>();
        User instance = new Cliente("usuario", "contrasena");
        instance.setRestaurantes(restaurantes);
    }

    /**
     * Test of getPlatillos method, of class User.
     */
    @Test
    public void testGetPlatillos() {
        System.out.println("getPlatillos");
        User instance = new Cliente("usuario", "contrasena");
        LinkedList<Platillo> platillos = new LinkedList<>();
        instance.setPlatillos(platillos);
        LinkedList<Platillo> expResult = platillos;
        LinkedList<Platillo> result = instance.getPlatillos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlatillos method, of class User.
     */
    @Test
    public void testSetPlatillos() {
        System.out.println("setPlatillos");
        LinkedList<Platillo> platillos = new LinkedList<>();
        User instance = new Cliente("usuario", "contrasena");
        instance.setPlatillos(platillos);
    }

    /**
     * Test of getMenus method, of class User.
     */
    @Test
    public void testGetMenus() {
        System.out.println("getMenus");
        User instance = new Cliente("usuario", "contrasena");
        LinkedList<MenuDecorator> menus = new LinkedList<>();
        instance.setMenus(menus);
        LinkedList<MenuDecorator> expResult = menus;
        LinkedList<MenuDecorator> result = instance.getMenus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMenus method, of class User.
     */
    @Test
    public void testSetMenus() {
        System.out.println("setMenus");
        LinkedList<MenuDecorator> menus = new LinkedList<>();
        User instance = new Cliente("usuario", "contrasena");
        instance.setMenus(menus);
    }

    /**
     * Test of imprimirMenu method, of class User.
     */
    @Test
    public void testImprimirMenu() {
        System.out.println("imprimirMenu");
        User instance = new Cliente("usuario", "contrasena");
    }

    /**
     * Test of cargarTodo method, of class User.
     */
    @Test
    public void testCargarTodo() {
        System.out.println("cargarTodo");
        User instance = new Cliente("usuario", "contrasena");
        instance.cargarTodo();
    }

    /**
     * Test of mostrarPlatillo method, of class User.
     */
    @Test
    public void testMostrarPlatillo() {
        System.out.println("mostrarPlatillo");
        HashMap<String, LinkedList<Platillo>> cat = new HashMap<>();
        Platillo platillo = new Ejecutivo("nombre", "descripcion", "categoria", "teperatura", "tipo", null);
        LinkedList<Platillo> platillos = new LinkedList<>();
        cat.put("categoria", platillos);
        String categoria = "categoria";
        User.mostrarPlatillo(cat, categoria);
    }

    public class UserImpl extends User {

        public UserImpl() {
            super("usuario", "contrasena");
        }
    }
    
}
