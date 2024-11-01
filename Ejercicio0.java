import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio0 {
    public static void main(String[] args) {
        String strLine = "";
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\axeld\\Desktop\\eda2\\Practica11\\test.txt"));

            while (strLine != null) {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine); 
             }
             
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("No se encontro archivo");
        } catch (IOException ex) {
            System.err.println("No es posible leer");
        }
    }
}
