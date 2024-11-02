package mx.unam.fi.poo.g1.p11;

import mx.unam.fi.poo.g1.p11.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase LectorArchivo
 * Esta clase permite leer archivos y lanza una excepción personalizada en caso de error
 * @author Axel Cote
 * @version Octubre-2024
 **/

public class LectorArchivo {
  /**
   * Metodo leerArchivo
   * @param ruta -> Ruta del archivo a leer
   * @return BufferedReader para lectura del archivo
   * @throws ArchivoException si ocurre un error al abrir o leer el archivo
   */

  public BufferedReader leerArchivo(String ruta) throws ArchivoException {
    BufferedReader br = null;

    try {
      br = new BufferedReader(new FileReader(ruta));
    } catch (IOException e) { 
      throw new ArchivoException("Ocurrio un error al intentar abrir el archivo: " + e.getMessage());
    }
    
    return br;
  }
}
