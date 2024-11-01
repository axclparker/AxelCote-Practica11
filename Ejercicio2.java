import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";

        List<String> list = new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\axeld\\Desktop\\eda2\\Practica11\\test.txt"));

            while (strLine != null) {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();

                if(strLine==null){
                    break;
                }

                list.add(strLine);
            }
            System.out.println(Arrays.toString(list.toArray()));
            
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("No se encontro archivo");
        } catch (IOException ex) {
            System.err.println("No es posible leer");
        }
    }
}
