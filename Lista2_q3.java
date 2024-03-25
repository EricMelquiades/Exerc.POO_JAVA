package Lista2_POO;
//Autor: Eric Melquíades
// Calcula fatorial de um numero.

import java.util.Scanner;

public class Lista2_q3 {

    public static void Questao3(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha o número que será fatorado");
        int N = teclado.nextInt();
        int fatora = 1;
        System.out.print(N + "! =");

        for (int cont = N; cont > 0; cont--) {
            System.out.print(cont + ".");
        }

        for (int i = 1; i <= N; i++) {
            fatora *= i;
        }
            System.out.println("= " + fatora);

        teclado.close();

    }
}
