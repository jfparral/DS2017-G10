/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectods;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Cliente extends Usuario {
    
    public Cliente(String usuario, String contrasena) {
        super(usuario, contrasena);
    }

    @Override
    public int tipo() {
        return 2;
    }

    @Override
    public void imprimirMenu() {
        System.out.println("1) Listar categorias de platos\n"
                + "2) Buscar plato\n"
                + "3) Cerrar sesion");
    }

    @Override
    public boolean opcion1() {     
        this.cargarTodo();
        System.out.println("Categorias:");
        System.out.println("1) Plato de mar\n"
                + "2) Tipicos\n"
                + "3) Bocadillo\n"
                + "4) Internacional");
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion == 0) {
            try {
                opcion = sc.nextInt();
            } catch  (Exception e) {
                System.out.println("Error no debe ingresar letras");
                sc.nextLine();
            }
        }
         
        
        HashMap<String, LinkedList<Platillo>> cat = new HashMap();
        for (Platillo pla : this.platillos) {
            LinkedList<Platillo> l = new LinkedList<>();
            if (!cat.containsKey(pla.getCategoria())) {
                l.add(pla);
                cat.put(pla.getCategoria(), l);
            } else {
                cat.get(pla.getCategoria()).add(pla);
            }
        }
        
        mostrarPlatillo(cat, opcion);
        
        return true;
    }

    @Override
    public boolean opcion2() {
        this.cargarTodo();
        LinkedList<Platillo> p = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre o parte del nombre: ");
        String buscar = sc.nextLine();
        for (int i = 0; i < this.platillos.size(); i++) {
            if (platillos.get(i).getNombre().contains(buscar)) {
                p.add(platillos.get(i));
            }
        }
        if (p.size() == 0) {
            return true;
        }
        
        for (int i = 0; i < p.size(); i++) {
            System.out.println((i+1)+") "+p.get(i).getNombre());
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
        
        if (p.size() > op-1) {
            imprimirPlatillo(p.get(op-1));
        } else {
            System.out.println("Ese platillo no se encuentra disponible");
        }    
        return true;
    }

    @Override
    public boolean opcion3() {        
        System.out.println("Sesion cerrada");
        return false;
    }

    @Override
    public boolean opcion4() {
        System.out.println("No existe ese metodo para cliente");
        return true;
    }
}
