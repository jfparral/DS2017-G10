/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Platillos;

import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;
import segundoparcial.Personas.Cliente;
import segundoparcial.Personas.User;
import segundoparcial.Restaurante;

/**
 *
 * @author hp
 */
public class PlatilloTest {
    
    public PlatilloTest() {
    }

    /**
     * Test of getNombre method, of class Platillo.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", new Restaurante("n", "d", "te", "d"));
        String expResult = "ejecutivo";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Platillo.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "nuevo nombre";
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", new Restaurante("n", "d", "te", "d"));
        instance.setNombre(nombre);
    }

    /**
     * Test of getDescripcion method, of class Platillo.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", new Restaurante("n", "d", "te", "d"));
        String expResult = "d";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescripcion method, of class Platillo.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "nueva descripcion";
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", new Restaurante("n", "d", "te", "d"));
        instance.setDescripcion(descripcion);
    }

    /**
     * Test of getCategoria method, of class Platillo.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", new Restaurante("n", "d", "te", "d"));
        String expResult = "categoria";
        String result = instance.getCategoria();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCategoria method, of class Platillo.
     */
    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        String categoria = "nueva categoria";
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", new Restaurante("n", "d", "te", "d"));
        instance.setCategoria(categoria);
    }

    /**
     * Test of getTeperatura method, of class Platillo.
     */
    @Test
    public void testGetTeperatura() {
        System.out.println("getTeperatura");
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", new Restaurante("n", "d", "te", "d"));
        String expResult = "t";
        String result = instance.getTeperatura();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTeperatura method, of class Platillo.
     */
    @Test
    public void testSetTeperatura() {
        System.out.println("setTeperatura");
        String teperatura = "nueva temperatura";
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", new Restaurante("n", "d", "te", "d"));
        instance.setTeperatura(teperatura);
    }

    /**
     * Test of getTipo method, of class Platillo.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", new Restaurante("n", "d", "te", "d"));
        String expResult = "ti";
        String result = instance.getTipo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipo method, of class Platillo.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "nuevo tipo";
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", new Restaurante("n", "d", "te", "d"));
        instance.setTipo(tipo);
    }

    /**
     * Test of getRestaurante method, of class Platillo.
     */
    @Test
    public void testGetRestaurante() {
        System.out.println("getRestaurante");
        Restaurante restaurante = new Restaurante("n", "d", "te", "d");
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", restaurante);
        Restaurante expResult = restaurante;
        Restaurante result = instance.getRestaurante();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRestaurante method, of class Platillo.
     */
    @Test
    public void testSetRestaurante() {
        System.out.println("setRestaurante");
        Restaurante restaurante = new Restaurante("nuevo", "descripcion", "temp", "dueno");
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", new Restaurante("n", "d", "te", "d"));
        instance.setRestaurante(restaurante);
    }

    /**
     * Test of getPrecio method, of class Platillo.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", new Restaurante("n", "d", "te", "d"));
        instance.PrecioPlatillo();
        double expResult = 3.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPrecio method, of class Platillo.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 5.0;
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", new Restaurante("n", "d", "te", "d"));
        instance.setPrecio(precio);
    }

    /**
     * Test of imprimirPlatillo method, of class Platillo.
     */
    @Test
    public void testImprimirPlatillo() {
        System.out.println("imprimirPlatillo");
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", new Restaurante("n", "d", "te", "d"));
        instance.imprimirPlatillo();
    }

    /**
     * Test of listarCategoria method, of class Platillo.
     */
    @Test
    public void testListarCategoria() {
        System.out.println("listarCategoria");
        LinkedList<Platillo> lista = new LinkedList<>();
        lista.add(new Estudiantil("nombre", "descripcion", "categoria", "temperatura", "tipo", null));
        LinkedList<String> expResult = new LinkedList<>();
        expResult.add("categoria");
        LinkedList<String> result = Platillo.listarCategoria(lista);
        for (int i = 0; i < expResult.size(); i++) {
            assertEquals(expResult.get(i), result.get(i));
        }        
    }

    /**
     * Test of convertirOpcion method, of class Platillo.
     */
    @Test
    public void testConvertirOpcion() {
        System.out.println("convertirOpcion");
        User usuario = new Cliente("usuario", "contrasena");
        usuario.getPlatillos().add(new Estudiantil("nombre", "descripcion", "categoria", "teperatura", "tipo", new Restaurante("n", "d", "t", "d")));
        usuario.getPlatillos().add(new Ejecutivo("nombre2", "descripcion2", "categoria", "teperatura2", "tipo2", new Restaurante("n", "d", "t", "d")));
        int opcion = 1;
        String expResult = "categoria";
        String result = Platillo.convertirOpcion(usuario, opcion);
        assertEquals(expResult, result);
    }

    /**
     * Test of DatosPlatillo method, of class Platillo.
     */
    @Test
    public void testDatosPlatillo() {
        System.out.println("DatosPlatillo");
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", new Restaurante("n", "d", "te", "d"));
        instance.DatosPlatillo();
    }

    /**
     * Test of PrecioPlatillo method, of class Platillo.
     */
    @Test
    public void testPrecioPlatillo() {
        System.out.println("PrecioPlatillo");
        Platillo instance = new Ejecutivo("ejecutivo", "d", "categoria", "t", "ti", new Restaurante("n", "d", "te", "d"));
        instance.PrecioPlatillo();
    }

    public class PlatilloImpl extends Platillo {

        public PlatilloImpl() {
            super("", "", "", "", "", null);
        }

        public void DatosPlatillo() {
        }

        public void PrecioPlatillo() {
        }
    }
    
}
