/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;

/**
 *
 * @author usuario
 */
public class Estudiantil extends Platillo{

    public Estudiantil(String nombre, String descripcion, String categoria, String teperatura, String tipo, Restaurante restaurante) {
        super(nombre, descripcion, categoria, teperatura, tipo, restaurante);
    }

    @Override
    public void DatosPlatillo() {
        System.out.println("Nombre: "+super.getNombre()+"\nDescripcion: "+super.getDescripcion()+
                "\nTemperatura: "+super.getTeperatura()+"\nTipo: "+super.getTipo());
    }  

    @Override
    public void PrecioPlatillo() {
        super.setPrecio(2.00);
    }
}
