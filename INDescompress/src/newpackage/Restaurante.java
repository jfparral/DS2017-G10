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
    private LinkedList<String> asistentes;
    private LinkedList<Platillo> platillos;

    public Restaurante(String nombre, String direccion, String telefono, String dueno, LinkedList<String> asistentes, LinkedList<Platillo> platillos) {
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
        this.asistentes = new LinkedList<>();
        this.platillos = new LinkedList<>();
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

    public LinkedList<String> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(LinkedList<String> asistentes) {
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
    
    public void agregarAsistente(String a) {
        this.asistentes.add(a);
    }
    
    public LinkedList<Platillo> buscarPlatillo(String parametro, LinkedList<Platillo> lista)
    {
        LinkedList<Platillo> nueva=new LinkedList<Platillo>();
        for(Platillo i:lista)
        {
            if(i.getNombre().contains(parametro) || i.getDescripcion().contains(parametro))
            {
                nueva.add(i);
            }
        }
        return nueva;
    }
//    public static void main(String[] args) {
//     Restaurante FIEC=new Restaurante("","","","");
//     Platillo p1=new Platillo("Seco de pollo","plato ecuatoriano","Segundo","frio","almuerzo",FIEC);   
//     Platillo p2=new Platillo("Seco de carne","plato ecuatoriano","Segundo","frio","almuerzo",FIEC);
//     Platillo p3=new Platillo("Seco de chancho","plato ecuatoriano","Segundo","frio","almuerzo",FIEC);
//     LinkedList<Platillo> plat=new LinkedList<Platillo>();
//     LinkedList<Platillo> plat1=new LinkedList<Platillo>();
//     plat.add(p1);
//     plat.add(p2);
//     plat.add(p3);
//     plat1=FIEC.buscarPlatillo("Seco", plat);
//     System.out.println(plat1);
//    }
   
}
