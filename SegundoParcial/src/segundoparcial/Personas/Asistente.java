/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Personas;

import segundoparcial.Personas.User;
import java.util.*;
import segundoparcial.Menus.*;

/**
 *
 * @author usuario
 */
public class Asistente extends User{
    public Asistente(String usuario, String contrasena) {
        super(usuario, contrasena);
        this.menus=new LinkedList<MenuDecorator>();
        this.menus.add(new ListarPlatillos());
        this.menus.add(new ListarPorCategoria());
        this.menus.add(new PedidosdeAlmuerzo());
    }

    
}
