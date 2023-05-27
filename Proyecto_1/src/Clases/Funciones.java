/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interface.Ventana1;
import Interface.VentanaMenu;
import java.io.File;
import javax.swing.JOptionPane;




/**
 *
 * @author andre
 */
public class Funciones {

    public static boolean ArchivoExiste(File archivo) {
        return archivo.isFile();
    }
    
    public static void VerificarEntrada(boolean r, String y){
        String a = "test\\Data\\usuarios.txt";
        File f = new File(a);
        if (Funciones.ArchivoExiste(f) == r) {
            JOptionPane.showInternalMessageDialog(null, y);
            VentanaMenu v = new VentanaMenu();
            v.setVisible(true);
            v.setLocationRelativeTo(null);

        } else {
            Ventana1 v2 = new Ventana1();
            v2.setVisible(true);
            v2.setLocationRelativeTo(null);
        }
    }

    public static void borrartxt() {
        // Ruta del archivo a borrar
        String rutaArchivo = "test\\Data\\usuarios.txt";

        // Crear un objeto File con la ruta del archivo
        File archivo = new File(rutaArchivo);

        archivo.delete(); // Borrar el archivo
    }
}
