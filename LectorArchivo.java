package mx.unam.fi.poo.g1.p11;

import mx.unam.fi.poo.g1.p11.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase LectorArchivo
 * @author Axel Cote 
 * @version Octubre-2024
**/

public class LectorArchivo {
  /**
   * Metodo leerArchivo
   * @return BufferedReader para lectura del archivo
   * @throws FileNotFoundException si el archivo no se encuentra
   */

   public BufferedReader leerArchivo(String ruta) throws FileNotFoundException {
    BufferedReader br = null;

    try {
      br = new BufferedReader(new FileReader(ruta));
    } catch (FileNotFoundException e) {
      System.err.println("No se encontró el archivo: " + e.getMessage());
    }
    
    return br;
  }
}
