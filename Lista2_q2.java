package Lista2_POO;

import java.util.Scanner;

//Autor: Eric Melquíades
// Sequancia de Fibonacci até maior que 500

public class Lista2_q2 {
    public static void Questao2() {

        Scanner teclado = new Scanner(System.in);


        int PrimeiroTermo = 1;
        int SegundoTermo = 1;
        System.out.print( " 0 "+ PrimeiroTermo + " " + SegundoTermo + " ");

        while (SegundoTermo <= 500) {
            int ProximoTermo = PrimeiroTermo + SegundoTermo;
            System.out.print(ProximoTermo + " " );

            PrimeiroTermo = SegundoTermo;
            SegundoTermo = ProximoTermo;

        }
        teclado.close();

    }
}
