/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> usuariosString = new LinkedList<>();
        LinkedList<Usuario> usuarios;
        Usuario actual;
        
        try {
            Lector l = new Lector("Usuarios.csv");
            usuariosString = l.cargarArchivo();
        } catch (Exception ex) {
            System.out.println("No se encuentra el archivo");
        }
        
        usuarios = cargarUsuarios(usuariosString);
        actual = login(usuarios);
        if (actual == null) {
            System.out.println("No se encuentra ese usuario");
        } else {
            actual.imprimirMenu();
        }
        
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                actual.opcion1();
                break;
            case 2:
                actual.opcion2();
                break;
            case 3:
                actual.opcion3();
                break;
            case 4:
                actual.opcion4();
                break;
            default:
                System.out.println("No existe esa opcion\n"
                        + "Ingrese una opcion valida: ");
                opcion = sc.nextInt();
                break;
        }
        
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

    private static Usuario login(LinkedList<Usuario> lista) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Contraseña: ");
        String contrasena = sc.nextLine();
        
        for (Usuario u : lista) {
            if (u.getUsuario().equals(usuario)) {
                //validar aqui la contraseña
                return u;
            }
        }
        return null;
    }
    
    
}
