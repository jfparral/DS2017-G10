/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Menus;

import segundoparcial.Personas.User;

/**
 *
 * @author usuario
 */
public class Salir implements MenuDecorator{

    @Override
    public void AgregarMenu(User usuario) {
        usuario.getMenus().add(this);
    }

    @Override
    public void Implementar(User usuario) {
        System.out.println("Se salio del sistema");
        System.exit(0);
    }

    @Override
    public String getNombre() {
        return "Salir";
    }
    
}
