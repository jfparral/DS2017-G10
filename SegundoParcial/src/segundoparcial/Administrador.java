/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial;

import java.util.*;

/**
 *
 * @author usuario
 */
public class Administrador extends User{
    
    private LinkedList<MenuDecorator> menus;
    public Administrador(String usuario, String contrasena) {
        super(usuario, contrasena);
        this.menus=new LinkedList<MenuDecorator>();
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
