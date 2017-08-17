/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;

import segundoparcial.Personas.*;

/**
 *
 * @author usuario
 */
public class AppSegundoParcial {
    public static void main(String[] args) {
        //Asistente cliente=new Asistente("Juan","espol");
        //cliente.setRestaurante(new Restaurante("Restaurante1", "ave 1 direccion al azar", "28864551", "Sixto Ramirez"));
        Cliente cliente=new Cliente("Juan","espol");
        cliente.AgregarTarjeta();
        cliente.AgregarCarnet();
        cliente.imprimirMenu();
    }
}
