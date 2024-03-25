package Lista2_POO;
//Autor: Eric Melquíades
//fatorial modificado

import java.util.Scanner;
public class Lista2_q6 {
    public static void Questao6(){

        Scanner teclado = new Scanner(System.in);
        int N;
        do {
            System.out.println("Escolha o número interio e menor que 16 (Digite -1 para finalizar)");
            N = teclado.nextInt();
            int fatora = 1;
            System.out.print(N + "! =");

            if (N >= 0 && N < 16) {
                for (int cont = N; cont > 0; cont--) {
                    System.out.print(cont + ".");
                }

                for (int i = 1; i <= N; i++) {
                    fatora *= i;
                }
                System.out.println("= " + fatora);
            } else if (N != -1) {
                System.out.println("Número invalido");

            }
        }    while (N != -1) ;
            teclado.close();
    }
}
