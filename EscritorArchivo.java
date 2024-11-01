package mx.unam.fi.poo.g1.p11;

import mx.unam.fi.poo.g1.p11.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase EscritorArchivo
 * @author Axel Cote 
 * @version Octubre-2024
**/

public class EscritorArchivo {
  /**
   * Metodo para escribir un archivo de texto
   * @param ruta1 Ruta del primer archivo a leer
   * @param ruta2 Ruta del segundo archivo a leer
   * @param ruta3 Ruta del tercer archivo a leer
   * @param rutaArchivoSalida Ruta del archivo donde se escribira el contenido
  **/

  public void escribirArchivo(String ruta1, String ruta2, String ruta3, String rutaArchivoSalida) {
    LectorArchivo le = new LectorArchivo();
    StringBuilder sb = new StringBuilder();

    for (String ruta : new String[]{ruta1, ruta2, ruta3}) {
      try (BufferedReader br = le.leerArchivo(ruta)) {
        String strLine =  "";
        while ((strLine = br.readLine()) != null) {
          sb.append(strLine).append(System.lineSeparator());
        }
      } catch (FileNotFoundException e) {
        System.err.println("No se encontro el archivo | " + e.getMessage());
      } catch (IOException ex) {
        System.err.println("Error al leer el archivo | " + ex.getMessage());
      }
    }

    try (FileWriter fw = new FileWriter(rutaArchivoSalida, false)) {
      fw.write(sb.toString());
      System.out.println("Contenido escrito exitosamente");
    } catch (IOException e) {
      System.err.println("Error, no se pudo escribir en el archivo de salida |" + e.getMessage());
    }
  }
}
