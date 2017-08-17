/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Personas;

import java.util.*;
import segundoparcial.Menus.*;
import segundoparcial.*;

/**
 *
 * @author usuario
 */
public class Asistente extends User{
    private Restaurante restaurante;
    
    public Asistente(String usuario, String contrasena) {
        super(usuario, contrasena);
        this.menus=new LinkedList<>();
        this.menus.add(new AgregarPlatillo());
        this.menus.add(new ListarPlatillos());
        this.menus.add(new ListarPorCategoria());
        this.menus.add(new Salir());
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    
}
