/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indescompress;

import java.util.*;

public class Cliente {
    private String nom,matri;
    private int cantidad;
    private double total;
    private Date fecha;

    public Cliente(String nom, String matri, int cantidad, double total, Date fecha) {
        this.nom = nom;
        this.matri = matri;
        this.cantidad = cantidad;
        this.total = total;
        this.fecha = fecha;
    }

    public String getNom() {
        return nom;
    }

    public String getMatri() {
        return matri;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }

    public Date getFecha() {
        return fecha;
    }
    
    
}
