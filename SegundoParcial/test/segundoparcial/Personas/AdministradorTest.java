/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Personas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class AdministradorTest {
    
    public AdministradorTest() {
    }

    @Test
    public void testConstructor() {
        Administrador admin = new Administrador("admin", "contrasena");        
        assertEquals("admin", admin.getUsuario());
        assertEquals("contrasena", admin.getContrasena());
    }
    
}
