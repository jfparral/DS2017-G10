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
public class Restaurante {
    private String nombre;
    private String direccion;
    private String telefono;
    private String dueno;
    private LinkedList<Usuario> asistentes;
    private LinkedList<Platillo> platillos;

    public Restaurante(String nombre, String direccion, String telefono, String dueno, LinkedList<Usuario> asistentes, LinkedList<Platillo> platillos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dueno = dueno;
        this.asistentes = asistentes;
        this.platillos = platillos;
    }

    public Restaurante(String nombre, String direccion, String telefono, String dueno) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dueno = dueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public LinkedList<Usuario> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(LinkedList<Usuario> asistentes) {
        this.asistentes = asistentes;
    }

    public LinkedList<Platillo> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(LinkedList<Platillo> platillos) {
        this.platillos = platillos;
    }
    
    public void agregarPlatillo(Platillo p) {
        this.platillos.add(p);
    }
    
    public void agregarAsistente(Asistente a) {
        this.asistentes.add(a);
    }
}
