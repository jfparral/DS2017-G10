/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.CargarSistema;

import java.util.*;
import segundoparcial.Lector;
import segundoparcial.Personas.*;
import segundoparcial.Platillos.*;
import segundoparcial.Restaurante;

/**
 *
 * @author usuario
 */
public class Loader {
    Lector s;
    public Loader()
    {
     
    }
    public static LinkedList<User> cargarUsuarios(LinkedList<String> lista) {
        LinkedList<User> usuarios = new LinkedList<>();
        
        for (int i = 0; i < lista.size(); i+=3) {
            User u;
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

    public static User Login(LinkedList<User> lista) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = sc.nextLine();
        System.out.println("\n");
        
        for (User u : lista) {
            if (u.getUsuario().equals(usuario) && u.getContrasena().equals(contrasena)) {
                    return u;
             } 
        }
        System.out.println("Contraseña incorrecta");
        return null;
    }

    public static LinkedList<Platillo> cargarPlatillosEjecutivos(LinkedList<String> p, LinkedList<Restaurante> r) {
        LinkedList<Platillo> platillos = new LinkedList<>();
        for (int i = 0; i < p.size(); i+=6) {
            int res = 0;
            for (int j = 0; j < r.size(); j++) {
                if (r.get(j).getNombre().equals(p.get(i+5))) {
                    res = j;
                    
                    break;
                }
            }
            Platillo ejecutivo = new Ejecutivo(p.get(i), p.get(i+1), p.get(i+2), p.get(i+3), p.get(i+4), r.get(res));
            r.get(res).agregarPlatillo(ejecutivo);
            platillos.add(ejecutivo);
        }
        
        return platillos;
    }
    
    public static LinkedList<Platillo> cargarPlatillosEstudiantil(LinkedList<String> p, LinkedList<Restaurante> r) {
        LinkedList<Platillo> platillos = new LinkedList<>();
        for (int i = 0; i < p.size(); i+=6) {
            int res = 0;
            for (int j = 0; j < r.size(); j++) {
                if (r.get(j).getNombre().equals(p.get(i+5))) {
                    res = j;
                    
                    break;
                }
            }
            Platillo estudiantil = new Estudiantil(p.get(i), p.get(i+1), p.get(i+2), p.get(i+3), p.get(i+4), r.get(res));
            r.get(res).agregarPlatillo(estudiantil);
            platillos.add(estudiantil);
        }
        
        return platillos;
    }
    public static LinkedList<Restaurante> cargarRestaurantes(LinkedList<String> r) {
        LinkedList<Restaurante> restaurantes = new LinkedList<>();
        for (int i = 0; i < r.size(); i+=6) {
            Restaurante res = new Restaurante(r.get(i), r.get(i+1), r.get(i+2), r.get(i+3));
            String[] asistentes = r.get(i+4).split(" ");
            for (String nombre : asistentes) {
                res.agregarAsistente(nombre);
            }
            restaurantes.add(res);
        }
        
        return restaurantes;
    }
}
