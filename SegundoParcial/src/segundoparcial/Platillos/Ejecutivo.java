/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Platillos;

import segundoparcial.Extras.IExtras;
import java.util.LinkedList;
import segundoparcial.Restaurante;

/**
 *
 * @author usuario
 */
public class Ejecutivo extends Platillo{
    private LinkedList<IExtras> extras;
    public Ejecutivo(String nombre, String descripcion, String categoria, String teperatura, String tipo, Restaurante restaurante) {
        super(nombre, descripcion, categoria, teperatura, tipo, restaurante);
        this.extras=new LinkedList<IExtras>();
        PrecioPlatillo();
    }

    @Override
    public void DatosPlatillo() {
        System.out.println("Nombre: "+super.getNombre()+"\nDescripcion: "+super.getDescripcion()+
                "\nTemperatura: "+super.getTeperatura()+"\nTipo: "+super.getTipo());
        if(this.extras.isEmpty())
            System.out.println("No tiene bebida o postre\n");
        else
        {
            for(IExtras i:this.extras)
            {
                System.out.println(i.getTipoExtra()+" con el valor de $"+i.getPrecio()+"\n");
            }
        }
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
