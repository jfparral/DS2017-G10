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
        int opcion = sc.nextInt();
        
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
        
        for (int i = 0; i < p.size(); i++) {
            System.out.println((i+1)+") "+p.get(i).getNombre());
        }
        int op = sc.nextInt();
        
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

    public static String convertirOpcion(int opcion) {
        switch (opcion) {
            case 1:
                return "plato de mar";
            case 2:
                return "tipicos";
            case 3:
                return "bocadillo";
            case 4:
                return "internacional";
            default:
                System.out.println("No existe esa opcion");
                return "";
        }
    }
    
    public static void mostrarPlatillo(HashMap<String, LinkedList<Platillo>> cat, int categoria) {
        Scanner sc = new Scanner(System.in);
        if (cat.get(convertirOpcion(categoria)) == null || cat.get(convertirOpcion(categoria)).isEmpty()) {
            System.out.println("No existen platillos en esa categoria");
            return;
        }
        for (int i = 0; i < cat.get(convertirOpcion(categoria)).size(); i++) {
            System.out.println((i+1)+") "+cat.get(convertirOpcion(categoria)).get(i).getNombre()
                    + " Restaurante: " +cat.get(convertirOpcion(categoria)).get(i).getRestaurante().getNombre());
        }
        
        int op = sc.nextInt();
        if (cat.get(convertirOpcion(categoria)).size() > op-1) {
            Platillo platillo = cat.get(convertirOpcion(categoria)).get(op-1);
            imprimirPlatillo(platillo);
        } else {
            System.out.println("Ya no se encuentra disponible ese platillo");
        }
        
    }
    
    
}
