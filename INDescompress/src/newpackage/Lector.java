/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author hp
 */
public class Lector {
    private String archivo;

    public Lector(String archivo) {
        this.archivo = archivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public LinkedList<String> cargarArchivo() throws FileNotFoundException, IOException {
        BufferedReader br =new BufferedReader(new FileReader(this.archivo));
        LinkedList<String> l = new LinkedList<>();
        while (br.ready()) {
            String line = br.readLine();
            l.add(line);
        }
        br.close();
        return l;   
    }
    
}
