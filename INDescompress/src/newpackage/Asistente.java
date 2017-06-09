/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.LinkedList;

/**
 *
 * @author hp
 */
public class Asistente extends Usuario {
    Restaurante restaurante;
    
    public Asistente(String usuario, String contrasena) {
        super(usuario, contrasena);
    }
    
    public final void asignarRestaurante(Restaurante r) {
        this.restaurante = r;
    }
    
    public LinkedList<Platillo> mostrarPlatillos() {
        return this.restaurante.getPlatillos();
    }
}
