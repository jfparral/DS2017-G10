/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Menus;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import segundoparcial.Personas.*;

/**
 *
 * @author usuario
 */
public class AgregarPlatillo implements MenuDecorator{

    @Override
    public void AgregarMenu(User usuario) {
        usuario.getMenus().add(this);
    }

    @Override
    public void Implementar(User usuario) {
        Asistente asistente = (Asistente)usuario;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del platillo: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la descripcion del platillo: ");
        String descripcion = sc.nextLine();
        System.out.println("Ingrese la categoria del platillo(ejecutivo, estudiantil): ");
        String categoria = sc.nextLine();
        System.out.println("Ingrese la temperatura del platillo(frio, caliente, al ambiente): ");
        String temperatura = sc.nextLine();
        System.out.println("Ingrese el tipo del platillo(aperitivo, plato fuerte, postre, desayuno): ");
        String tipo = sc.nextLine();
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("Platillos.csv"), true), "UTF8"));
            bw.write("\n"+nombre+"\n"+descripcion+"\n"+categoria+"\n"+temperatura+"\n"+tipo+"\n"+asistente.getRestaurante().getNombre());
            bw.close();
            System.out.println("Platillo añadido con exito");
        } catch (Exception e) {
            System.out.println("No se encuentra el archivo Platillos.csv" + e);
        }

    }

    @Override
    public String getNombre() {
        return "Agregar platillos";
    }
    
}
