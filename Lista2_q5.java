package Lista2_POO;
//Autor: Eric Melquíades
//Determina maiores números modificado

import java.util.Scanner;

public class Lista2_q5 {

    public static void questao5() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos números deseja informar, todos os numeros deverão ser entre 0 e 1000?");

        int quant = teclado.nextInt();
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        for (int i = 1; i <= quant; i++) {
            int numero;
            do {
                // Solicita ao usuário para inserir um número entre 0 e 1000
                System.out.print("Digite o número " + i + " (entre 0 e 1000): ");
                numero = teclado.nextInt();

                if (numero < 0 || numero > 1000) {
                    System.out.println("Número inválido. Por favor, insira um número entre 0 e 1000.");
                }
            } while (numero < 0 || numero > 1000);


            menor = Math.min(menor, numero);
            maior = Math.max(maior, numero);

            soma += numero;
        }

        System.out.println("Este é o menor número informado: " + menor);
        System.out.println("Este é o maior número informado: " + maior);
        System.out.println("Está é a soma de todos os números: " + soma);

        teclado.close();
    }
}