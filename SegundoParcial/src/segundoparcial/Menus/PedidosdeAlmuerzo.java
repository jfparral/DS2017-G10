/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Menus;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import segundoparcial.Extras.*;
import segundoparcial.Personas.*;
import segundoparcial.Platillos.*;

/**
 *
 * @author usuario
 */
public class PedidosdeAlmuerzo implements MenuDecorator{

    @Override
    public void AgregarMenu(User usuario) {
        usuario.getMenus().add(this);
    }

    @Override
    public void Implementar(User usuario) {
        System.out.println("Ha elegido pedir un almuerzo" + "\n"
                + "Elija la categoria");
        usuario.cargarTodo();
        LinkedList<String> categorias = listarCategoria(usuario.getPlatillos());
        System.out.println("Escoja una categoria");
        for (int i = 0; i < categorias.size(); i++) {
            System.out.println(i+1 + ") " + categorias.get(i));
        }
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion <= 0) {
            try {
                opcion = sc.nextInt();
            } catch  (Exception e) {
                System.out.println("Error no debe ingresar letras");
                sc.nextLine();
            }
        }
        
        
        HashMap<String, LinkedList<Platillo>> cat = new HashMap();
        for (Platillo pla : usuario.getPlatillos()) {
            LinkedList<Platillo> l = new LinkedList<>();
            if (!cat.containsKey(pla.getCategoria())) {
                l.add(pla);
                cat.put(pla.getCategoria(), l);
            } else {
                cat.get(pla.getCategoria()).add(pla);
            }
        }
        
        int numPlatillo = usuario.mostrarPlatillo(cat, categorias.get(opcion-1));
        
        
        
        Platillo platillo = cat.get(categorias.get(opcion-1)).get(numPlatillo-1);
        
        if (categorias.get(opcion-1).equals("estudiantil")) {
            System.out.println("Se realizo la compra el precio es " + platillo.getPrecio() +"\nMuchas gracias");
            return;
        }
        Ejecutivo ejecutivo = (Ejecutivo) platillo;
        System.out.println("Desea agregar un postre: \n"
                + "1) Si\n 2) No");
        int postre = sc.nextInt();
        sc.nextLine();
        System.out.println("Desea agregar un jugo: \n"
                + "1) Si\n 2) No");
        int jugo = sc.nextInt();
        sc.nextLine();
        if (postre == 1) {
            Postre pos = new Postre("postre");
            ejecutivo.AgregarExtras(pos);
            ejecutivo.setPrecio(ejecutivo.getPrecio()+pos.getPrecio());
        }
        if (jugo == 1) {
            Jugo jug = new Jugo("jugo");
            ejecutivo.AgregarExtras(jug);
            ejecutivo.setPrecio(ejecutivo.getPrecio()+jug.getPrecio());
        }
        System.out.println("Se realizo la compra el precio es " + platillo.getPrecio() +"\nMuchas gracias");
        return;
        
        
    }

    public LinkedList<String> listarCategoria(LinkedList<Platillo> lista)
    {
        LinkedList<String> list_catg=new LinkedList<String>();
        for(int i=0;i<lista.size();i++)
        {
            if(!list_catg.contains(lista.get(i).getCategoria()))
            {
                list_catg.add(lista.get(i).getCategoria());
            }
        }
        return list_catg;
    }
    
    @Override
    public String getNombre() {
        return "Pedido de almuerzo";
    }
    
}