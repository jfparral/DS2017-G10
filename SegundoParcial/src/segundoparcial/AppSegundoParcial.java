/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;

import segundoparcial.Personas.Cliente;
import segundoparcial.Personas.User;

/**
 *
 * @author usuario
 */
public class AppSegundoParcial {
    public static void main(String[] args) {
        User cliente=new Cliente("Juan","espol");
        cliente.imprimirMenu();
    }
}
