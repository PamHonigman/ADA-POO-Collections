import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Integer> listaNumeros = new ArrayList<Integer>();

        listaNumeros.add(34);
        listaNumeros.add(433);
        listaNumeros.add(3);
        listaNumeros.add(5);
        listaNumeros.add(6);
        listaNumeros.add(475);
        listaNumeros.add(21);

        for (Integer elemento : listaNumeros){
            System.out.println(elemento);
        }

        System.out.println("");

        List<Integer> listaNumeros2 = new ArrayList<Integer>();

        System.out.println("Ingrese la cantidad de números que tendrá la lista");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un número para la posición " + i + ": ");
            int numero = in.nextInt();
            listaNumeros2.add(numero);
        }

        for (Integer elemento : listaNumeros2) {
            System.out.println(elemento);
        }
    }
}