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
public class Postre extends IExtras{

    private String nombre;
    public Postre(String nombre)
    {
        this.nombre=nombre;
    }
    @Override
    public void Precio() {
        super.setPrecio(0.75);
    }

    @Override
    public void Sabor() {
        super.setTipoExtra(this.nombre);
    }
    
}
