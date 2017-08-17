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
public class AgregarPlatillo implements MenuDecorator{

    @Override
    public void AgregarMenu(User usuario) {
        usuario.getMenus().add(this);
    }

    @Override
    public void Implementar(User usuario) {

    }

    @Override
    public String getNombre() {
        return "Agregar platillos";
    }
    
}
