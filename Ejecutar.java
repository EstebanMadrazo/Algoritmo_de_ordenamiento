import java.io.IOException;
import java.util.Scanner;

import Modelo.ArchivoCSV;
import Modelo.DoubleLinkList;
import Modelo.Ordenador;

public class Ejecutar {

    public static void main(String[] args) throws IOException {
        ArchivoCSV movieCSV = new ArchivoCSV("Movie.csv");
        DoubleLinkList movies = movieCSV.leerCSV();
        Ordenador ordenador = new Ordenador();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while(opcion != 3){
            System.out.println("Si quiere ordenar de mayor a menor precione 1");
            System.out.println("Si quiere ordenar de menor a mayor precione 2");
            System.out.println("Si quiere salir presione 3");
            opcion = teclado.nextInt();

            switch(opcion){
                case 1:
                    ordenador.insertionSortMayorMenor(movies);
                    movies.displayList();
                    break;
                case 2:
                    ordenador.insertionSortMenorMayor(movies);
                    movies.displayList();
                    break;
                default:
                    break;
            }
        }

    }
}