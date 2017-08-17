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
        
            System.out.println("Escoja una opcion: \n");
            opc=sc.nextLine();
            this.menus.get(Integer.parseInt(opc)-1).Implementar(this);
        }while(Integer.parseInt(opc)>0 || Integer.parseInt(opc)<=this.menus.size());
    }
    
    public static LinkedList<Platillo> cargarPlatillos(LinkedList<String> p, LinkedList<Restaurante> r) {
        LinkedList<Platillo> platillos = new LinkedList<>();
        for (int i = 0; i < p.size(); i+=6) {
            int res = 0;
            for (int j = 0; j < r.size(); j++) {
                if (r.get(j).getNombre().equals(p.get(i+5))) {
                    res = j;
                    
                    break;
                }
            }
            Platillo platillo = null;
            switch(p.get(i+2)) {
                case "ejecutivo":
                    platillo = new Ejecutivo(p.get(i), p.get(i+1), p.get(i+2), p.get(i+3), p.get(i+4), r.get(res));
                    break;
                case "estudiantil":
                    platillo = new Estudiantil(p.get(i), p.get(i+1), p.get(i+2), p.get(i+3), p.get(i+4), r.get(res));
                    break;
            }
            if (platillo != null) {
                r.get(res).agregarPlatillo(platillo);
                platillos.add(platillo);
            }      
        }
        
        return platillos;
    }
    
    public static LinkedList<Restaurante> cargarRestaurantes(LinkedList<String> r) {
        LinkedList<Restaurante> restaurantes = new LinkedList<>();
        for (int i = 0; i < r.size(); i+=6) {
            Restaurante res = new Restaurante(r.get(i), r.get(i+1), r.get(i+2), r.get(i+3));
            String[] asistentes = r.get(i+4).split(" ");
            for (String nombre : asistentes) {
                res.agregarAsistente(nombre);
            }
//            String[] platillos = r.get(i+5).split(" ");
//            for (String plato : platillos) {
//                res.agregarPlatillo(new Platillo(plato, plato, plato, plato, plato, res));
//            }
            restaurantes.add(res);
        }
        
        return restaurantes;
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
        
        this.restaurantes = cargarRestaurantes(restaurantesString);
        this.platillos = cargarPlatillos(platillosString, restaurantes);
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
                op = sc.nextInt();
            } catch  (Exception e) {
                System.out.println("Error no debe ingresar letras");
                sc.nextLine();
            }
        }
        if (cat.get(categoria).size() > op-1) {
            Platillo platillo = cat.get(categoria).get(op-1);
            platillo.DatosPlatillo();
        } else {
            System.out.println("Ya no se encuentra disponible ese platillo");
        }
        return op;
    }
  
    
}
