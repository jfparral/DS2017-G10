/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Menus;

import java.util.Scanner;
import segundoparcial.Personas.*;

/**
 *
 * @author usuario
 */
public class ListarPlatillos implements MenuDecorator{

    @Override
    public void AgregarMenu(User usuario) {
        usuario.getMenus().add(this);
        
    }

    @Override
    public void Implementar(User usuario) {
        usuario.cargarTodo();
        
        
        

        for (int i = 0; i < usuario.getPlatillos().size(); i++) {
            System.out.println(i+1 + ") " + usuario.getPlatillos().get(i).getNombre());
        }
        
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
        
        usuario.getPlatillos().get(opcion-1).DatosPlatillo();
    }

    @Override
    public String getNombre() {
        return "Listar platillos";
    }
    
    
}
