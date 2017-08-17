/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Personas;

import java.util.LinkedList;
import segundoparcial.Menus.*;
import segundoparcial.*;

/**
 *
 * @author usuario
 */
public class Cliente extends User{
    
    private TarjetadeCredito tarjeta;
    private CarnetInteligente carnet;
    public Cliente(String usuario, String contrasena) {
        super(usuario, contrasena);
        this.menus=new LinkedList<MenuDecorator>();
        this.menus.add(new ListarPlatillos());
        this.menus.add(new ListarPorCategoria());
        this.menus.add(new PedidosdeAlmuerzo());
    }

    public TarjetadeCredito getTarjeta() {
        return tarjeta;
    }
    
    public void setTarjeta(TarjetadeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public CarnetInteligente getCarnet() {
        return carnet;
    }

    public void setCarnet(CarnetInteligente carnet) {
        this.carnet = carnet;
    }
    
    public void AgregarCarnet()
    {
        this.carnet=new CarnetInteligente(5000);
    }
    
    public void AgregarTarjeta()
    {
        this.tarjeta=new TarjetadeCredito(5000);
    }

    
}
