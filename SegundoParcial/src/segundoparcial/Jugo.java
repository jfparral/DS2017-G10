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
public class Jugo extends IExtras{
    private String sabor;
    public Jugo(String jugo)
    {
        this.sabor=jugo;
    }
    
    @Override
    public void Precio(){
        super.setPrecio(0.50);
    }

    @Override
    public void Sabor() {
        super.setTipoExtra(this.sabor);
    }
    
}
