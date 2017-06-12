/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.LinkedList;

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
            Restaurante res = null;
            for (Restaurante restaurante : r) {
                if (restaurante.getNombre().equals(p.get(i+5))) {
                    res = restaurante;
                    break;
                }
            }
            Platillo platillo = new Platillo(p.get(i), p.get(i+1), p.get(i+2), p.get(i+3), p.get(i+4), res);
            platillos.add(platillo);
        }
        
        return platillos;
    }

    public static LinkedList<Restaurante> cargarRestaurantes(LinkedList<String> r) {
        LinkedList<Restaurante> restaurantes = new LinkedList<>();
        for (int i = 0; i < r.size(); i+=6) {
            Restaurante res = new Restaurante(r.get(i), r.get(i+1), r.get(i+2), r.get(i+3));
            restaurantes.add(res);
        }
        
        return restaurantes;
    }
    
    public abstract int tipo();
    
    public abstract void imprimirMenu();

    public abstract void opcion1();

    public abstract void opcion2();

    public abstract void opcion3();

    public abstract void opcion4();
}
