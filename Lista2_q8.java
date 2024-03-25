package Lista2_POO;
//Autor: Eric Melquíades
//Media de Notas

import java.util.Scanner;
public class Lista2_q8 {
    public static void Questao8() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas notas você deseja inserir? ");
        int quantidadeNotas = teclado.nextInt();
        while (quantidadeNotas <= 0) {
            System.out.println("Quantidade inválida. Por favor, insira um número positivo.");
            System.out.print("Quantas notas você deseja inserir? ");
            quantidadeNotas = teclado.nextInt();
        }
        double soma = 0;
        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = teclado.nextDouble();
            soma += nota;
        }
        double media = soma / quantidadeNotas;
        System.out.println("A média aritmética das " + quantidadeNotas + " notas é: " + media);

        teclado.close();
    }
}









