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
public interface MenuDecorator {
    public void AgregarMenu(User usuario);
    public void Implementar(User usuario);
    public String getNombre();
}
