/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class main {
    
    public static void main(String[] args) {
        LinkedList<String> usuariosString = new LinkedList<>();
        LinkedList<Usuario> usuarios = new LinkedList<>();
        
        try {
            Lector l = new Lector("Usuarios.csv");
            usuariosString = l.cargarArchivo();
        } catch (Exception ex) {
            System.out.println("No se encuentra el archivo");
        }
        
        usuarios = cargarUsuarios(usuariosString);
        login();
    }

    private static LinkedList<Usuario> cargarUsuarios(LinkedList<String> lista) {
        LinkedList<Usuario> usuarios = new LinkedList<>();
        
        
        for (int i = 0; i < lista.size(); i+=3) {
            Usuario u;
            switch (lista.get(i)) {
                case "Administrador":
                    u = new Administrador(lista.get(i+1), lista.get(i+2));
                    usuarios.add(u);
                    break;
                case "Asistente":
                    u = new Asistente(lista.get(i+1), lista.get(i+2));
                    usuarios.add(u);
                    break;
                case "Cliente":
                    u = new Cliente(lista.get(i+1), lista.get(i+2));
                    usuarios.add(u);
                    break;
                default:
                    break;
            }
        }
        return usuarios;
    }

    private static void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Contraseña: ");
        String contrasena = sc.nextLine();

    }
    
    
}
