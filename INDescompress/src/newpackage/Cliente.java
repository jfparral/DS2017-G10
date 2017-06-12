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
        System.out.println("1) Plato de mar\n"
                + "2) Tipico\n"
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

}
