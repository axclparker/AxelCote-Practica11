package mx.unam.fi.poo.g1.p11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practica11 {

    public Practica11() {
    }

    public static void main(String[] args) {
        String ruta1 = "C:\\Users\\axeld\\Desktop\\eda2\\Practica11\\test1.txt";
        String ruta2 = "C:\\Users\\axeld\\Desktop\\eda2\\Practica11\\test2.txt";
        String ruta3 = "C:\\Users\\axeld\\Desktop\\eda2\\Practica11\\test3.txt";
        String rutaSalida = "C:\\Users\\axeld\\Desktop\\eda2\\Practica11\\salida.txt";
        
        EscritorArchivo escritor = new EscritorArchivo();
        escritor.escribirArchivo(ruta1, ruta2, ruta3, rutaSalida);

        try (BufferedReader lector = new BufferedReader(new FileReader(rutaSalida))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de salida | " + e.getMessage());
        }
    }
}
