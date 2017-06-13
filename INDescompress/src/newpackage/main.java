/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class main {
    
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            LinkedList<String> restaurantesString = new LinkedList<>();
            LinkedList<Restaurante> restaurantes;
            LinkedList<String> platillosString = new LinkedList<>();
            LinkedList<Platillo> platillos;
            LinkedList<String> usuariosString = new LinkedList<>();
            LinkedList<Usuario> usuarios;
            Usuario actual;

            try {
                Lector lUsuarios = new Lector("Usuarios.csv");
                usuariosString = lUsuarios.cargarArchivo();
                Lector lPlatillos = new Lector("Platillos.csv");
                platillosString = lPlatillos.cargarArchivo();
                Lector lRestaurantes = new Lector("Restaurantes.csv");
                restaurantesString = lRestaurantes.cargarArchivo();
            } catch (Exception ex) {
                System.out.println("No se encuentra el archivo");
            }
            restaurantes = cargarRestaurantes(restaurantesString);
            usuarios = cargarUsuarios(usuariosString);
            platillos = cargarPlatillos(platillosString, restaurantes);
            boolean bandera = true;
            actual = login(usuarios);
            while (bandera) {
                if (actual == null) {
                    System.out.println("No se encuentra ese usuario");
                } else {
                    actual.imprimirMenu();
                }


                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        bandera = actual.opcion1();
                        break;
                    case 2:
                        bandera = actual.opcion2();
                        break;
                    case 3:
                        bandera = actual.opcion3();
                        break;
                    case 4:
                        bandera = actual.opcion4();
                        break;
                    default:
                        System.out.println("No existe esa opcion\n"
                                + "Ingrese una opcion valida: ");
                        opcion = sc.nextInt();
                        break;
                }
            }
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

    private static LinkedList<Platillo> cargarPlatillos(LinkedList<String> p, LinkedList<Restaurante> r) {
        LinkedList<Platillo> platillos = new LinkedList<>();
        for (int i = 0; i < p.size(); i+=6) {
            int res = 0;
            for (int j = 0; j < r.size(); j++) {
                if (r.get(j).getNombre().equals(p.get(i+5))) {
                    res = j;
                    
                    break;
                }
            }
            Platillo platillo = new Platillo(p.get(i), p.get(i+1), p.get(i+2), p.get(i+3), p.get(i+4), r.get(res));
            r.get(res).agregarPlatillo(platillo);
            platillos.add(platillo);
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
//            String[] platillos = r.get(i+5).split(" ");
//            for (String plato : platillos) {
//                res.agregarPlatillo(new Platillo(plato, plato, plato, plato, plato, res));
//            }
            restaurantes.add(res);
        }
        
        return restaurantes;
    }
    
    
}
