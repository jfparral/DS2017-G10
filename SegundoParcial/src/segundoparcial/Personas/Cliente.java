/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Personas;

import segundoparcial.Pagos.*;
import java.util.LinkedList;
import segundoparcial.Menus.*;

/**
 *
 * @author usuario
 */
public class Cliente extends User{    
    private CreditCard tarjeta;
    private Carnet carnet;
    
    public Cliente(String usuario, String contrasena) {
        super(usuario, contrasena);
        this.menus=new LinkedList<>();
        this.menus.add(new ListarPlatillos());
        this.menus.add(new ListarPorCategoria());
        this.menus.add(new PedidosdeAlmuerzo());
        this.menus.add(new Salir());
        this.AgregarCarnet();
        this.AgregarTarjeta();
    }

    public CreditCard getTarjeta() {
        return tarjeta;
    }
    
    public void setTarjeta(CreditCard tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Carnet getCarnet() {
        return carnet;
    }

    public void setCarnet(Carnet carnet) {
        this.carnet = carnet;
    }
    
    public void AgregarCarnet()
    {
        this.carnet=new Carnet(this,50);
    }
    
    public void AgregarTarjeta()
    {
        this.tarjeta=new CreditCard(this,50);
    }

}
