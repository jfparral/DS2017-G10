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
public class Administrador extends Usuario {
    
    public Administrador(String usuario, String contrasena) {
        super(usuario, contrasena);
    }

    @Override
    public int tipo() {
        return 0;
    }

    @Override
    public void imprimirMenu() {
        System.out.println("1) Agregar restaurante desde XML\n"
                + "2) Listar restaurante\n"
                + "3) Agregar usuario\n"
                + "4) Salir del sistema");
    }

    @Override
    public boolean opcion1() {
        return true;
    }

    @Override
    public boolean opcion2() {
        return true;
    }

    @Override
    public boolean opcion3() {
        return true;
    }

    @Override
    public boolean opcion4() {
        System.exit(0);
        return false;
    }
    
}
