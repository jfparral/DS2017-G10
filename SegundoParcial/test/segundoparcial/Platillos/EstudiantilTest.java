/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Platillos;

import org.junit.Test;
import static org.junit.Assert.*;
import segundoparcial.Restaurante;

/**
 *
 * @author hp
 */
public class EstudiantilTest {
    
    public EstudiantilTest() {
    }

    /**
     * Test of DatosPlatillo method, of class Estudiantil.
     */
    @Test
    public void testDatosPlatillo() {
        System.out.println("DatosPlatillo");
        Estudiantil instance = new Estudiantil("n", "d", "categoria", "te", "ti", new Restaurante("n", "d", "t", "d"));
        instance.DatosPlatillo();
    }

    /**
     * Test of PrecioPlatillo method, of class Estudiantil.
     */
    @Test
    public void testPrecioPlatillo() {
        System.out.println("PrecioPlatillo");
        Estudiantil instance = new Estudiantil("n", "d", "categoria", "te", "ti", new Restaurante("n", "d", "t", "d"));
        instance.PrecioPlatillo();
    }
    
}
