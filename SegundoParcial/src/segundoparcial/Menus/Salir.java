/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Menus;

import segundoparcial.Menus.MenuDecorator;
import segundoparcial.Personas.User;

/**
 *
 * @author usuario
 */
public class Salir implements MenuDecorator{

    @Override
    public void AgregarMenu(User usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Implementar(User usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return "Salir";
    }
    
}
