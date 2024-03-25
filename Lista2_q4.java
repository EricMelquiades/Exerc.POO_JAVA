package Lista2_POO;

//Autor: Eric Melquíades
//Determina maiores números

import java.util.Scanner;

public class Lista2_q4 {
    public static void questao4(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos números deseja informar?");
        int quant = teclado.nextInt();
        int menor =  Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;
        for (int i = 1; i <= quant ; i++) {
            System.out.println("Digite o número: ");
            int numero = teclado.nextInt();

            menor = Math.min(menor, numero);
            maior = Math.max(maior, numero);

            soma += numero;
        }

        System.out.println("Este é o menor número informado: " +menor );
        System.out.println("Este é o maior número informado: " +maior );
        System.out.println("Está é a soma de todos os números: " +soma);

        teclado.close();
    }
}
