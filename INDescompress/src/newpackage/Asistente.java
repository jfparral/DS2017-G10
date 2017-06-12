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

    @Override
    public int tipo() {
        return 1;
    }

    @Override
    public void imprimirMenu() {
        System.out.println("1) Agregar platillo\n"
                + "2) Listar platillos\n"
                + "3) Listar categorias de platillos\n"
                + "4) Salir del sistema");
    }
}
