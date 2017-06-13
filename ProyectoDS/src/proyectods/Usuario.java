/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectods;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


/**
 *
 * @author hp
 */
public abstract class Usuario {
    private String usuario;
    private String contrasena;
    LinkedList<Restaurante> restaurantes;
    LinkedList<Platillo> platillos;

    public Usuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        
        
    }
    
    public void cargarTodo() {
        LinkedList<String> restaurantesString = new LinkedList<>();
        LinkedList<String> platillosString = new LinkedList<>();
        
        try {
            Lector lPlatillos = new Lector("Platillos.csv");
            platillosString = lPlatillos.cargarArchivo();
            Lector lRestaurantes = new Lector("Restaurantes.csv");
            restaurantesString = lRestaurantes.cargarArchivo();
        } catch (Exception ex) {
            System.out.println("No se encuentra el archivo");
        }
        
        this.restaurantes = cargarRestaurantes(restaurantesString);
        this.platillos = cargarPlatillos(platillosString, restaurantes);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public LinkedList<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(LinkedList<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public LinkedList<Platillo> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(LinkedList<Platillo> platillos) {
        this.platillos = platillos;
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
            restaurantes.add(res);
        }
        return restaurantes;
    }
    
    public static void imprimirPlatillo(Platillo p) {
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Descripcion: " + p.getDescripcion());
        System.out.println("Categoria: " + p.getCategoria());
        System.out.println("Temperatura: " + p.getTeperatura());
        System.out.println("Tipo: " + p.getTipo());
        System.out.println("Restaurante: " + p.getRestaurante().getNombre());
    }
    
    public static String convertirOpcion(int opcion) {
        switch (opcion) {
            case 1:
                return "plato de mar";
            case 2:
                return "tipico";
            case 3:
                return "bocadillo";
            case 4:
                return "internacional";
            default:
                System.out.println("No existe esa opcion");
                return "";
        }
    }
    
    public static int mostrarPlatillo(HashMap<String, LinkedList<Platillo>> cat, int categoria) {
        Scanner sc = new Scanner(System.in);
        if (cat.get(convertirOpcion(categoria)) == null || cat.get(convertirOpcion(categoria)).isEmpty()) {
            System.out.println("No existen platillos en esa categoria");
            return 0;
        }
        for (int i = 0; i < cat.get(convertirOpcion(categoria)).size(); i++) {
            System.out.println((i+1)+") "+cat.get(convertirOpcion(categoria)).get(i).getNombre()
                    + " Restaurante: " +cat.get(convertirOpcion(categoria)).get(i).getRestaurante().getNombre());
        }
        
        int op = sc.nextInt();
        if (cat.get(convertirOpcion(categoria)).size() > op-1) {
            Platillo platillo = cat.get(convertirOpcion(categoria)).get(op-1);
            imprimirPlatillo(platillo);
        } else {
            System.out.println("Ya no se encuentra disponible ese platillo");
        }
        return op;
    }
    
    public abstract int tipo();
    
    public abstract void imprimirMenu();

    public abstract boolean opcion1();

    public abstract boolean opcion2();

    public abstract boolean opcion3();

    public abstract boolean opcion4();
}
