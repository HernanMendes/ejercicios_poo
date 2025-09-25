import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManejoArchivo {
    public static void main (String[] args)
    {
        String ruta = "secuencia.txt";
        int cont = procesarArch(ruta);
        System.out.println ("El archivo contiene "+ cont +" líneas");
    }

    public static int procesarArch (String ruta){
        int cont=0;
        String str;
        try {
            FileReader fr = new FileReader (ruta);
            BufferedReader br= new BufferedReader(fr);
            while ((str = br.readLine())!= null) {
                cont++;
                System.out.println("==|Linea"+cont+" )"+str);
            }
        }
        catch (IOException err) {
            System.out.println ("Error al leer el archivo");
        }
        return cont;
    }
}
