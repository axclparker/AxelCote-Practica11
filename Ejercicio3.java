import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";

        try {
            String fileName = "C:\\Users\\axeld\\Desktop\\eda2\\Practica11\\archivo.txt";
            FileWriter fr = new FileWriter(fileName, false);

            fr.write("No escribire nada");
            fr.close();

            BufferedReader br = new BufferedReader(new FileReader(fileName));

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
