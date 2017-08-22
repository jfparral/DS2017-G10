/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Menus;

import java.io.IOException;
import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import segundoparcial.CargarSistema.Loader;
import segundoparcial.Lector;
import segundoparcial.Personas.Cliente;
import segundoparcial.Personas.User;
import segundoparcial.Platillos.Ejecutivo;
import segundoparcial.Platillos.Platillo;
import segundoparcial.Restaurante;

/**
 *
 * @author usuario
 */
public class ListarPorCategoriaTest {
    
    public ListarPorCategoriaTest() {
    }
  
    /**
     * Test of AgregarMenu method, of class ListarPorCategoria.
     */
    @Test
    public void testAgregarMenu() {
        System.out.println("AgregarMenu");
        User usuario = new Cliente("cliente1","contrasena");
        ListarPorCategoria instance = new ListarPorCategoria();
        instance.AgregarMenu(usuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Implementar method, of class ListarPorCategoria.
     */
    @Test
    public void testImplementar() {
        System.out.println("Implementar");
        User usuario = new Cliente("cliente1","contrasena");
        ListarPorCategoria instance = new ListarPorCategoria();
        instance.Implementar(usuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class ListarPorCategoria.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        ListarPorCategoria instance = new ListarPorCategoria();
        String expResult = "Listar platillos por categorias";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarCategoria method, of class ListarPorCategoria.
     */
    @Test
    public void testListarCategoria() throws IOException {
        System.out.println("listarCategoria");
        LinkedList<Restaurante> p = new LinkedList<>();
        Restaurante r = new Restaurante("Restaurante1","ave 1 direccion al azar","28864551","Sixto Ramirez");
        p.add(r);
        Platillo expResult = new Ejecutivo("arroz con menestra","solo es arroz con menestra","ejecutivo","caliente","plato fuerte",r);
        LinkedList<Platillo> lista = Loader.cargarPlatillosEjecutivos(new Lector("PlatillosEjecutivoTest.csv").cargarArchivo(), p);
        ListarPorCategoria instance = new ListarPorCategoria();
        LinkedList<String> result = instance.listarCategoria(lista);
        LinkedList<String> list_catg=new LinkedList<String>();
        for(int i=0;i<lista.size();i++)
        {
            if(!list_catg.contains(lista.get(i).getCategoria()))
            {
                list_catg.add(lista.get(i).getCategoria());
            }
        }
        assertEquals(list_catg.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
