import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<String> listaNombres = new ArrayList<>();

        for (int i = 0; i <= 4; i++) {
            System.out.println("Ingrese el nombre para la posición " + i + ": ");
            String nombre = in.nextLine();
            listaNombres.add(nombre);
        }

        for (String elemento : listaNombres) {
            System.out.println(elemento);
        }
    }
}