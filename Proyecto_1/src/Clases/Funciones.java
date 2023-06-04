/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interface.Ventana1;
import Interface.VentanaMenu;
import Grafo.Grafo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Funciones {

    public static boolean ArchivoExiste(File archivo) {
        return archivo.isFile();
    }

    public static void eliminarLineasConTresPalabras(String archivo, String palabra1, String palabra2, String palabra3) {
        try {
            // Definir el archivo de entrada y salida
            File file = new File(archivo);

            // Crear objetos temporales para leer y escribir en el archivo
            File tempFile = new File(file.getAbsolutePath() + ".tmp");
            BufferedReader lector = new BufferedReader(new FileReader(file));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(tempFile));

            // Leer el archivo línea por línea
            String linea;
            while ((linea = lector.readLine()) != null) {
                // Contar el número de palabras separadas por comas en la línea
                String[] palabras = linea.split(",");
                int numPalabras = palabras.length;

                // Verificar si la línea contiene al menos tres palabras separadas por comas
                boolean contienePalabras = false;
                for (String palabra : palabras) {
                    if (palabra.trim().equals(palabra1) || palabra.trim().equals(palabra2) || palabra.trim().equals(palabra3)) {
                        contienePalabras = true;
                        break;
                    }
                }

                if (numPalabras < 3 || !contienePalabras) {
                    escritor.write(linea);
                    escritor.newLine();
                }
            }

            // Cerrar los objetos de lectura y escritura del archivo original
            lector.close();
            escritor.close();

            // Reemplazar el archivo original con el archivo temporal
            if (!tempFile.renameTo(file)) {
                throw new IOException("No se pudo reemplazar el archivo original.");
            }

            System.out.println("El archivo se ha procesado correctamente.");

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al procesar el archivo.");
            e.printStackTrace();
        }
    }

  public static String leerRelaciones() throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader("test\\Data\\usuarios.txt"));
        String linea;
        boolean encontrado = false;
        StringBuilder relaciones = new StringBuilder();
        while ((linea = lector.readLine()) != null) {
            if (encontrado) {
                relaciones.append(linea);
                relaciones.append("\n"); // Agregar salto de línea
                
            } else if (linea.trim().equals("Relaciones")) {
                encontrado = true;
                System.out.println(relaciones);
            }
        }
        lector.close();
        return relaciones.toString();
    }

    public static void agregarAristaAlFinal(String archivo, String numero1, String numero2, String numero3) {
        try {
            BufferedWriter salida = new BufferedWriter(new FileWriter(archivo, true));
            salida.write(numero1 + "," + numero2 + "," + numero3);
            salida.newLine();
            salida.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo " + archivo + ": " + e.getMessage());
        }
    }

    public static int numno() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("test\\Data\\usuarios.txt"));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Funciones.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        boolean relacionesEncontradas = false;
        int numNodos = 0;
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine().trim();
            if (linea.equals("Relaciones")) {
                relacionesEncontradas = true;
                continue;
            }
            if (relacionesEncontradas && !linea.equals("")) {
                String[] datos = linea.split("\\s*,\\s*");
                int usuario1 = Integer.parseInt(datos[0]);
                int usuario2 = Integer.parseInt(datos[1]);
                int tiempo = Integer.parseInt(datos[2]);
                numNodos = Math.max(numNodos, Math.max(usuario1, usuario2) + 1);
                // Agregar arista al grafo
            }
        }
        return numNodos;
    }

    public static void CargarGrafo() {
        try {
            Scanner scanner = new Scanner(new File("test\\Data\\usuarios.txt"));
            boolean relacionesEncontradas = false;
            int numNodos = 0;
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine().trim();
                if (linea.equals("Relaciones")) {
                    relacionesEncontradas = true;
                    continue;
                }
                if (relacionesEncontradas && !linea.equals("")) {
                    String[] datos = linea.split("\\s*,\\s*");
                    int usuario1 = Integer.parseInt(datos[0]);
                    int usuario2 = Integer.parseInt(datos[1]);
                    int tiempo = Integer.parseInt(datos[2]);
                    numNodos = Math.max(numNodos, Math.max(usuario1, usuario2) + 1);
                    // Agregar arista al grafo
                }
            }
            scanner.close();

            Grafo grafo = new Grafo(numNodos);
            scanner = new Scanner(new File("test\\Data\\usuarios.txt"));
            relacionesEncontradas = false;
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine().trim();
                if (linea.equals("Relaciones")) {
                    relacionesEncontradas = true;
                    continue;
                }
                if (relacionesEncontradas && !linea.equals("")) {
                    String[] datos = linea.split("\\s*,\\s*");
                    int usuario1 = Integer.parseInt(datos[0]);
                    int usuario2 = Integer.parseInt(datos[1]);
                    int tiempo = Integer.parseInt(datos[2]);

                    grafo.agregarArista(usuario1, usuario2, tiempo);

                }
            }
            scanner.close();
            grafo.eliminarNodosSinAristas();
            grafo.imprimirGrafo();

        } catch (FileNotFoundException e) {
        }
    }

    public static void VerificarEntrada(boolean r, String y) {
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

    public static void Entrada(boolean r, String y, JFrame h) {
        String a = "test\\Data\\usuarios.txt";
        File f = new File(a);
        if (Funciones.ArchivoExiste(f) != true) {
            JOptionPane.showInternalMessageDialog(null, y);
            VentanaMenu v = new VentanaMenu();
            v.setVisible(true);
            v.setLocationRelativeTo(null);

        } else {
            h.setVisible(true);
            h.setLocationRelativeTo(null);
        }
    }

    public static void BorraG() {
        Grafo g = new Grafo(0);
        g.borrarGrafo();
    }

    public static void borrartxt() {
        // Ruta del archivo a borrar
        String rutaArchivo = "test\\Data\\usuarios.txt";

        // Crear un objeto File con la ruta del archivo
        File archivo = new File(rutaArchivo);

        archivo.delete(); // Borrar el archivo
    }

    public static void ContarVertices() {
        String archivo = "test\\Data\\usuarios.txt";
        int contadorDeLineas = 0;
        boolean omitirPrimeraLinea = true;
        boolean detenerConteo = false;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // Omitir la primera línea
                if (omitirPrimeraLinea) {
                    omitirPrimeraLinea = false;
                    continue;
                }

                // Detener el conteo cuando se encuentra la palabra "Relaciones"
                if (linea.contains("Relaciones")) {
                    detenerConteo = true;
                    continue;
                }

                // Contar las líneas que no se han omitido ni detenido
                if (!omitirPrimeraLinea && !detenerConteo) {
                    contadorDeLineas++;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }

    }

}
