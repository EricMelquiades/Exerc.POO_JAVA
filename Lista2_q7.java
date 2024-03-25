package Lista2_POO;
//Autor: Eric Melquíades
// números primos

import java.util.Scanner;
public class Lista2_q7 {
    public static void Questao7() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = teclado.nextInt();
        boolean ehPrimo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                System.out.println(numero + " não é um número primo. Ele é divisível por " + i + ".");
                break;
            }
        }
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        }
        teclado.close();
    }
}
