package mx.unam.fi.poo.g1.p11;

/**
 * Clase ArchivoException extends Exception
 * @author Axel Cote 
 * @version Octubre-2024
**/

public class ArchivoException extends Exception {
  /**
   * Metodo Constructor
   * @param mensaje -> Atributo del mensaje que arrojara Exception
  **/

  public ArchivoException(String mensaje) {
    super(mensaje);
  }

  /**
   * Metodo getMensaje
   * @return mensaje -> Regresa el atributo mensaje
  **/

  public String getMensaje() {
    return super.getMessage();
  }
}