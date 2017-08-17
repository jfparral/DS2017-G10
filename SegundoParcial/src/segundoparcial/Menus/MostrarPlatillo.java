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
public class MostrarPlatillo implements MenuDecorator{

    @Override
    public void AgregarMenu(User usuario) {
        String menu = "";
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Implementar(User usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return "Mostrar Platillo";
    }
    
}
