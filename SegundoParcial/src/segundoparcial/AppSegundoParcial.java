/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;

import java.util.LinkedList;
import java.util.Scanner;
import segundoparcial.Personas.*;
import segundoparcial.Lector;
import segundoparcial.Restaurante;
import segundoparcial.CargarSistema.*;
import segundoparcial.Platillos.*;

/**
 *
 * @author usuario
 */
public class AppSegundoParcial {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            LinkedList<String> restaurantesString = new LinkedList<>();
            LinkedList<Restaurante> restaurantes;
            LinkedList<String> platillosString = new LinkedList<>();
            LinkedList<Platillo> platillosejecu=new LinkedList<>();
            LinkedList<Platillo> platillosestud= new LinkedList<>();
            LinkedList<String> usuariosString = new LinkedList<>();
            LinkedList<User> usuarios;
            User actual = null;

            try {
                usuariosString=new Lector("Usuarios.csv").cargarArchivo();
                platillosString = new Lector("Platillos.csv").cargarArchivo();
                restaurantesString = new Lector("Restaurantes.csv").cargarArchivo();
            } catch (Exception ex) {
                System.out.println("No se encuentra el archivo");
            }
            restaurantes = new Loader().cargarRestaurantes(restaurantesString);
            usuarios = new Loader().cargarUsuarios(usuariosString);
            platillosejecu = new Loader().cargarPlatillosEjecutivos(platillosString, restaurantes);
            platillosestud= new Loader().cargarPlatillosEjecutivos(platillosString, restaurantes);
            boolean bandera = true;
            while (actual == null) {
                actual = new Loader().Login(usuarios);
            }
            
            while (bandera) {
                if (actual == null) {
                    System.out.println("No se encuentra ese usuario");
                } else {
                    actual.imprimirMenu();
                }
            }
        }    
    }
}
