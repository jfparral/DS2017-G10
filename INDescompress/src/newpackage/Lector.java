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

    public void cargarArchivo() throws FileNotFoundException, IOException {
        BufferedReader br =new BufferedReader(new FileReader(this.archivo));
        String line = br.readLine();
        System.out.println(line);
        br.close();
        
    }
    
}
