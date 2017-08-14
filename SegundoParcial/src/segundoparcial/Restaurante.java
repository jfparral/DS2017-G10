/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;

import java.util.LinkedList;

/**
 *
 * @author usuario
 */
public class Restaurante {
    private String nombre,direccion,telefono,dueno;
    private LinkedList<Platillo>platillos;
    private LinkedList<Asistente>asistentes;

    public Restaurante(String nombre, String direccion, String telefono, String dueno, LinkedList<Platillo> platillos, LinkedList<Asistente> asistentes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dueno = dueno;
        this.platillos = platillos;
        this.asistentes = asistentes;
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

    public LinkedList<Platillo> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(LinkedList<Platillo> platillos) {
        this.platillos = platillos;
    }

    public LinkedList<Asistente> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(LinkedList<Asistente> asistentes) {
        this.asistentes = asistentes;
    }
    
    
}
