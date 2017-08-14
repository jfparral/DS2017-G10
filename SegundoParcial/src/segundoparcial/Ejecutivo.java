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
public class Ejecutivo extends Platillo{
    private LinkedList<IExtras> extras;
    public Ejecutivo(String nombre, String descripcion, String categoria, String teperatura, String tipo, Restaurante restaurante) {
        super(nombre, descripcion, categoria, teperatura, tipo, restaurante);
        this.extras=new LinkedList<IExtras>();
    }

    @Override
    public void DatosPlatillo() {
        System.out.println("Nombre: "+super.getNombre()+"\nDescripcion: "+super.getDescripcion()+
                "\nTemperatura: "+super.getTeperatura()+"\nTipo: "+super.getTipo());
    }

    public void AgregarExtras(IExtras extra){
        this.extras.add(extra);
        super.setPrecio(super.getPrecio()+extra.getPrecio());
    }

    @Override
    public void PrecioPlatillo() {
        super.setPrecio(3.00);
    }
    
}
