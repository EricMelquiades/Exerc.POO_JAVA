package Lista2_POO;
//Autor: Eric Melquíades
//Valor gasto em CDs

import java.util.Scanner;
public class Lista2_q12 {
    public static void Questao12() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos CDs você possui na coleçao? ");
        int quantCD = teclado.nextInt();
        while (quantCD <= 0) {
            System.out.println("Quantidade inválida. Por favor, insira um número positivo.");
            System.out.print("Quantos CDs você possui na coleção? ");
            quantCD = teclado.nextInt();
        }

        double valorTotal = 0;

        for (int i = 1; i <quantCD ; i++) {
            System.out.println("Digite o valor do CD " + i + ": R$ ");
            double valorCD = teclado.nextInt();

            while (valorCD<=0){
                System.out.println("Valor inválido. Por favor, insira um valor positivo.");
                System.out.print("Digite o valor do CD " + i + ": R$ ");
                valorCD = teclado.nextDouble();
            }
           valorTotal += valorCD;
        }
        double valorMedioCD = valorTotal/quantCD;

        System.out.println("O valor total de CDs é: R$ " +valorTotal);
        System.out.println("O valor médio gasto em cada CD é: R$ "+valorMedioCD);

        teclado.close();
    }


}
