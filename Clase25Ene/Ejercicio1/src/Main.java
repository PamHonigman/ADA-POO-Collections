import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in).useDelimiter("\n");

        List<String> listaNombres = new ArrayList<>();

        System.out.println("Ingrese la cantidad de nombres que tendrá la lista");
        int n = in.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Ingrese un nombre: ");
            String nombre = in.next();
            listaNombres.add(nombre);
        }

        System.out.println("");

        for (String nombres : listaNombres) {
            System.out.println(nombres);
        }

        System.out.println("");

        listaNombres.remove(2);

        System.out.println("Se eliminó el nombre ubicado en la posición 2");

        System.out.println("");

        Collections.sort(listaNombres);
        System.out.println("Lista ordenada alfabéticamente: ");

        for (String nombres : listaNombres) {
            System.out.println("\u2726" + " " + nombres);
        }
    }
}