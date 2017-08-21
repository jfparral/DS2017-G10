/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Personas;

import java.util.*;
import segundoparcial.Menus.MenuDecorator;
import segundoparcial.Menus.Salir;

/**
 *
 * @author usuario
 */
public class Administrador extends User{

    public Administrador(String usuario, String contrasena) {
        super(usuario, contrasena);
        this.menus=new LinkedList<>();
        this.menus.add(new Salir());
    }
    

}
