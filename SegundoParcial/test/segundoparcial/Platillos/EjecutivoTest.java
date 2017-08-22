/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Platillos;

import org.junit.Test;
import static org.junit.Assert.*;
import segundoparcial.Extras.IExtras;
import segundoparcial.Extras.Jugo;
import segundoparcial.Restaurante;

/**
 *
 * @author hp
 */
public class EjecutivoTest {
    
    public EjecutivoTest() {
    }

    /**
     * Test of DatosPlatillo method, of class Ejecutivo.
     */
    @Test
    public void testDatosPlatillo() {
        System.out.println("DatosPlatillo");
        Ejecutivo instance = new Ejecutivo("nombre", "d", "categoria", "t", "tipo", new Restaurante("nombre", "d", "t", "d"));
        instance.DatosPlatillo();
    }

    /**
     * Test of AgregarExtras method, of class Ejecutivo.
     */
    @Test
    public void testAgregarExtras() {
        System.out.println("AgregarExtras");
        IExtras extra = new Jugo("jugo");
        Ejecutivo instance = new Ejecutivo("nombre", "d", "categoria", "t", "tipo", new Restaurante("nombre", "d", "t", "d"));
        instance.AgregarExtras(extra);
    }

    /**
     * Test of PrecioPlatillo method, of class Ejecutivo.
     */
    @Test
    public void testPrecioPlatillo() {
        System.out.println("PrecioPlatillo");
        Ejecutivo instance = new Ejecutivo("nombre", "d", "categoria", "t", "tipo", new Restaurante("nombre", "d", "t", "d"));
        instance.PrecioPlatillo();
    }
    
}
