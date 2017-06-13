/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Asistente extends Usuario {
    Restaurante restaurante;
    
    public Asistente(String usuario, String contrasena) {
        super(usuario, contrasena);
        cargarTodo();
        for (Restaurante r : restaurantes) {
            if (r.getAsistentes().contains(this.getUsuario())) {
                this.setRestaurante(r);
                break;
            }
        }
    }
    
    public final void asignarRestaurante(Restaurante r) {
        this.restaurante = r;
    }
    
    public LinkedList<Platillo> mostrarPlatillos() {
        return this.restaurante.getPlatillos();
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public int tipo() {
        return 1;
    }

    @Override
    public void imprimirMenu() {
        System.out.println("1) Agregar platillo\n"
                + "2) Listar platillos\n"
                + "3) Listar categorias de platillos\n"
                + "4) Salir del sistema");
    }

    @Override
    public boolean opcion1() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del platillo: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la descripcion del platillo: ");
        String descripcion = sc.nextLine();
        System.out.println("Ingrese la categoria del platillo(plato de mar, tipico, bocadillo, internacional): ");
        String categoria = sc.nextLine();
        System.out.println("Ingrese la temperatura del platillo(frio, caliente, al ambiente): ");
        String temperatura = sc.nextLine();
        System.out.println("Ingrese el tipo del platillo(aperitivo, plato fuerte, postre, desayuno): ");
        String tipo = sc.nextLine();
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("Platillos.csv"), true), "UTF8"));
            bw.write("\n"+nombre+"\n"+descripcion+"\n"+categoria+"\n"+temperatura+"\n"+tipo+"\n"+this.restaurante.getNombre());
            bw.close();
            System.out.println("Platillo añadido con exito");
        } catch (Exception e) {
            System.out.println("No se encuentra el archivo Platillos.csv" + e);
        }
        return true;
    }

    @Override
    public boolean opcion2() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < restaurante.getPlatillos().size(); i++) {
            System.out.println((i+1)+") "+restaurante.getPlatillos().get(i).getNombre());
            int opcion = sc.nextInt();
        }
        return true;
    }

    @Override
    public boolean opcion3() {
        
        return true;
    }

    @Override
    public boolean opcion4() {
        System.exit(0);
        return false;
    }
}
