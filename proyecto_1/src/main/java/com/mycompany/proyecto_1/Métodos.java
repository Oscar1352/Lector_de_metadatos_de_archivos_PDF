package com.mycompany.proyecto_1;

// Librería a utilizar

import javax.swing.*;
import java.io.*;

public class Métodos {

    // Método para crear el archivo
    public static void crearArchivo(String Archivo) {
        File f1 = new File(Archivo);
        PrintWriter pw;


        try {
            pw = new PrintWriter(f1);
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    // Método para escribir en el archivo
    public static void escribirArchivo(String Archivo, String texto) {
        File f1 = new File(Archivo);

        // Capturar errores
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(f1, true));
            pw.println(texto);
            pw.close();

            // Mensaje para indicar que se creó el archivo con éxito
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    // Método para leer el archivo
    public static String leerArchivo(String Archivo) {
        File f1 = new File(Archivo);

        // Capturar errores
        try {
            BufferedReader br = new BufferedReader(new FileReader(Archivo));
            String leer = br.readLine();
            while (leer != null) {
                System.out.println(leer);
                leer = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

        return null;
    }

    // Método para leer los archivos que están en  la carpeta
    public static void ArchivosCarpeta(String carpeta) {
        File f1 = new File(carpeta);
        String[] archivos = f1.list();

        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }
    }

    // Método para buscar un archivo
    public static void buscarArchivo(String archivo) {
        File f1 = new File(archivo);

        if (f1.exists()) {
            System.out.println("El archivo existe");
        } else {
            System.out.println("El archivo no existe");
        }
    }

    // Método para Buscar una palabra
    public static void BuscarPalabra(String archivo) throws IOException {
        String palabra = JOptionPane.showInputDialog(null, "Ingrese un cadena: ");

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String leer = "";
            int i = 0;
            while ((leer = br.readLine()) != null) {
                i++;
                if (leer.contains(palabra)) {
                    JOptionPane.showMessageDialog(null, "La palabra " + palabra + " fue encontrada en la línea " + i);
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }


    static String línea;
    static String[] líneaLeida = null;

    // Método para leer archivos CSV
    public static void leerCSV(String archivo) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            while ((línea = br.readLine()) != null) {
                líneaLeida = línea.split(",");
                imprimirLinea();
                System.out.println();
            }
            br.close();
            línea = null;
            líneaLeida = null;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Método para imprimir la línea
    public static void imprimirLinea() {
        for (int i = 0; i < líneaLeida.length; i++) {
            System.out.print(líneaLeida[i] + ",");
        }
    }

}
