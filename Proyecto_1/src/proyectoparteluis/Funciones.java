/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparteluis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author luisr
 */
public class Funciones {
    
    /**
     *
     * @return 
     */
    @SuppressWarnings("empty-statement"  )
    public Nodo leer_txt_usuario () {
        File archivo = new File("test\\usuarios.txt");
        try {
            try (Scanner scanner = new Scanner(archivo)) {
                while (scanner.hasNextLine()) {
                    String[] linea = scanner.nextLine().split(",");
                    // Procesar la línea de texto
                    int numeroid = Integer.parseInt(linea[0]);
                    Nodo usuario = new Nodo(linea[1], numeroid);
                    listaSimple lista = new listaSimple();
                    lista.insert(usuario);
                    lista.recorrerLista();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
        return null;
        
    }
    
    @SuppressWarnings("empty-statement")
    public Relaciones leer_txt_relaciones(){
        File archivo = new File("test\\relaciones.txt");
        try {
            try (Scanner scanner = new Scanner(archivo)) {
                while (scanner.hasNextLine()) {
                    String[] linea = scanner.nextLine().split(",");
                    // Procesar la línea de texto
                    
                    int usuario1 = Integer.parseInt(linea[0].replace(" ",""));
                    int usuario2 = Integer.parseInt(linea[1].replace(" ",""));
                    int años = Integer.parseInt(linea[2]);
                    Relaciones relacion = new Relaciones(usuario1, usuario2, años);
                    listaSimpler listarelaciones = new listaSimpler();
                    listarelaciones.insertRelacion(relacion);
                    listarelaciones.recorrerListaRelaciones();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
        return null;
        
    }
    

    
    
}
