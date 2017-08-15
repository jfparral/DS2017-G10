/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Cliente extends User{
    
    private TarjetadeCredito tarjeta;
    private CarnetInteligente carnet;
    private LinkedList<MenuDecorator> menus;
    public Cliente(String usuario, String contrasena) {
        super(usuario, contrasena);
        this.menus=new LinkedList<MenuDecorator>();
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
    
    public LinkedList<MenuDecorator> getMenus() {
        return menus;
    }

    public void setMenus(LinkedList<MenuDecorator> menus) {
        this.menus = menus;
    }
    
    
    @Override
    public void imprimirMenu() {
        Scanner sc=new Scanner(System.in);
        String opc="-1";
        for(int i=0;i<this.menus.size();i++)
        {
            System.out.println((i+1)+") "+this.menus.get(i).getNombre());
        }
        do{
            System.out.println("Escoja una opcion: \n");
            opc=sc.nextLine();
            this.menus.get(Integer.parseInt(opc)).Implementar();
        }while(Integer.parseInt(opc)>0 || Integer.parseInt(opc)<=this.menus.size());
        
    }
    
}
