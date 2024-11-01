import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        String strLine = "";
        String str_data = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\axeld\\Desktop\\eda2\\Practica11\\test.txt"));

            while (strLine != null) {
                if (strLine == null) {
                    break;
                }

                str_data += strLine;
                strLine = br.readLine();
            }
            
            System.out.println(str_data);

            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("No se encontro archivo");
        } catch (IOException ex) {
            System.err.println("No es posible leer");
        }
    }
}
