/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

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
    public void opcion1() {     
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
        
        
    }

    @Override
    public void opcion2() {

    }

    @Override
    public void opcion3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void opcion4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            System.out.println((i+1)+") "+cat.get(convertirOpcion(categoria)).get(i).getNombre());
        }
        
        int op = sc.nextInt();
        if (cat.get(convertirOpcion(categoria)).size() > op-1) {
            Platillo platillo = cat.get(convertirOpcion(categoria)).get(op-1);
            System.out.println("Nombre: " + platillo.getNombre());
            System.out.println("Descripcion: " + platillo.getDescripcion());
            System.out.println("Categoria: " + platillo.getCategoria());
            System.out.println("Temperatura: " + platillo.getTeperatura());
            System.out.println("Tipo: " + platillo.getTipo());
            System.out.println("Restaurante: " + platillo.getRestaurante().getNombre());
        } else {
            System.out.println("Ya no se encuentra disponible ese platillo");
        }
        
    }
}
