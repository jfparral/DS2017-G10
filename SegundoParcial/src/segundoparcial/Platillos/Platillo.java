/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Platillos;

import java.util.LinkedList;
import segundoparcial.Personas.*;
import segundoparcial.*;

/**
 *
 * @author usuario
 */
public abstract class Platillo {
    private String nombre;
    private String descripcion;
    private String categoria;
    private String teperatura;
    private String tipo;
    private double precio;
    private Restaurante restaurante;

    public Platillo(String nombre, String descripcion, String categoria, String teperatura, String tipo, Restaurante restaurante) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.teperatura = teperatura;
        this.tipo = tipo;
        this.restaurante = restaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTeperatura() {
        return teperatura;
    }

    public void setTeperatura(String teperatura) {
        this.teperatura = teperatura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void imprimirPlatillo() {
        System.out.println("Nombre: " + this.nombre + "\n"
                + "Descripcion: " + this.descripcion + "\n"
                + "Categoria: " + this.categoria + "\n"
                + "Temperatura: " + this.teperatura + "\n"
                + "Tipo: " + this.tipo + "\n"
                + "Precio: " + this.precio + "\n"
                + "Restaurante: " + this.restaurante);
    }
    
    public static LinkedList<String> listarCategoria(LinkedList<Platillo> lista)
    {
        LinkedList<String> list_catg=new LinkedList<String>();
        for(int i=0;i<lista.size();i++)
        {
            if(!list_catg.contains(lista.get(i).getCategoria()))
            {
                list_catg.add(lista.get(i).getCategoria());
            }
        }
        return list_catg;
    }
    
    public static String convertirOpcion(User usuario, int opcion) {
        LinkedList<String> categorias = listarCategoria(usuario.getPlatillos());
        return categorias.get(opcion-1);
    }
    
    public abstract void DatosPlatillo();
    public abstract void PrecioPlatillo();
}
