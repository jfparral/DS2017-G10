/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Personas;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import segundoparcial.Menus.*;
import segundoparcial.Platillos.*;
import segundoparcial.*;
import segundoparcial.CargarSistema.Loader;

/**
 *
 * @author usuario
 */
public abstract class User {
    private String usuario;
    private String contrasena;
    private LinkedList<Restaurante> restaurantes;
    private LinkedList<Platillo> platillos;
    protected LinkedList<MenuDecorator> menus;

    public User(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public LinkedList<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(LinkedList<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public LinkedList<Platillo> getPlatillos() {
        return platillos;
    }

    public void setPlatillos(LinkedList<Platillo> platillos) {
        this.platillos = platillos;
    }
    
    public LinkedList<MenuDecorator> getMenus() {
        return menus;
    }

    public void setMenus(LinkedList<MenuDecorator> menus) {
        this.menus = menus;
    }
    
    public void imprimirMenu() {
        Scanner sc=new Scanner(System.in);
        String opc="-1";
        do{
            for(int i=0;i<this.menus.size();i++)
            {
                System.out.println((i+1)+") "+this.menus.get(i).getNombre());
            }
            System.out.print("Escoja una opcion: ");
            opc=sc.nextLine();
            this.menus.get(Integer.parseInt(opc)-1).Implementar(this);
            System.out.println("\n");
        }while(Integer.parseInt(opc)>0 || Integer.parseInt(opc)<=this.menus.size());
    }
    
   
    
    public void cargarTodo() {
        LinkedList<String> restaurantesString = new LinkedList<>();
        LinkedList<String> platillosString = new LinkedList<>();
        try {
            Lector lPlatillos = new Lector("Platillos.csv");
            platillosString = lPlatillos.cargarArchivo();
            Lector lRestaurantes = new Lector("Restaurantes.csv");
            restaurantesString = lRestaurantes.cargarArchivo();
        } catch (Exception ex) {
            System.out.println("No se encuentra el archivo");
        }
        this.restaurantes = new Loader().cargarRestaurantes(restaurantesString);
        this.platillos = new Loader().cargarPlatillosEjecutivos(platillosString, restaurantes);
    }
    
    public static int mostrarPlatillo(HashMap<String, LinkedList<Platillo>> cat, String categoria) {
        Scanner sc = new Scanner(System.in);
        if (cat.get(categoria) == null || cat.get(categoria).isEmpty()) {
            System.out.println("No existen platillos en esa categoria");
            return 0;
        }
        for (int i = 0; i < cat.get(categoria).size(); i++) {
            System.out.println((i+1)+") "+cat.get(categoria).get(i).getNombre()
                    + " Restaurante: " +cat.get(categoria).get(i).getRestaurante().getNombre());
        }
        int op = 0;
        while (op == 0) {
            try {
                System.out.print("Escoja un platillo: ");
                op = sc.nextInt();
            } catch  (Exception e) {
                System.out.println("Error no debe ingresar letras");
                sc.nextLine();
            }
        }
        if (cat.get(categoria).size() > op-1) {
            cat.get(categoria).get(op-1).DatosPlatillo();
        } else {
            System.out.println("Ya no se encuentra disponible ese platillo");
        }
        return op;
    }
}
