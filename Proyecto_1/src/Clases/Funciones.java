/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author andre
 */
public class Funciones {

    public void leer() {

        FileReader archivo;
        BufferedReader leer;

        try {
            archivo = new FileReader("test\\Data\\nuevo_amazon.txt");
            if (archivo.ready()) {
                leer = new BufferedReader(archivo);
                String cadena;
                while ((cadena = leer.readLine()) != null) {            
                    System.out.println(cadena);
                    
                }
                
            } else {
                System.out.println("el archivo esta vacio");
            }
        } catch (IOException e) {
            System.out.println("error:"+ e.getMessage());
        }

    }
}
