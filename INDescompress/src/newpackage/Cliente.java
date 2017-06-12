/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author hp
 */
public class Cliente extends Usuario {
    
    public Cliente(String usuario, String contrasena) {
        super(usuario, contrasena);
    }

    @Override
    public int tipo() {
        return 2;
    }

    @Override
    public void imprimirMenu() {
        System.out.println("1) Listar categorias de platos\n"
                + "2) Buscar plato\n"
                + "3) Cerrar sesion");
    }
    
}
