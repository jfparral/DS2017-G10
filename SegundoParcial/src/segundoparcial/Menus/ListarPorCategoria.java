/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Menus;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import segundoparcial.Personas.*;
import segundoparcial.Platillos.*;

/**
 *
 * @author usuario
 */
public class ListarPorCategoria implements MenuDecorator{

    @Override
    public void AgregarMenu(User usuario) {
        usuario.getMenus().add(this);
    }

    @Override
    public void Implementar(User usuario) {
        usuario.cargarTodo();
        LinkedList<String> categorias = listarCategoria(usuario.getPlatillos());
        
        for (int i = 0; i < categorias.size(); i++) {
            System.out.println(i+1 + ") " + categorias.get(i));
        }
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion == 0) {
            try {
                System.out.print("Escoja una categoria: ");
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
        
        usuario.mostrarPlatillo(cat, categorias.get(opcion-1));
    }

    @Override
    public String getNombre() {
        return "Listar platillos por categorias";
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
 
}
