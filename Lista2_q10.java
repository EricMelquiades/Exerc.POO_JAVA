package Lista2_POO;
//Autor: Eric Melquíades
// Eleições.

import java.util.Scanner;
public class Lista2_q10 {
    public static void Questao10() {
        Scanner teclado = new Scanner(System.in);
        int vtCand1 = 0;
        int vtCand2 = 0;
        int vtCand3 = 0;
        int vtInvald = 0;

        System.out.println("Qual o total de eleitores? ");
        int totalEleit = teclado.nextInt();

        for (int i = 1; i <= totalEleit; i++) {
            System.out.println("Eleitor " + i +": ");
            System.out.println("1 - Pega Peso 1");
            System.out.println("2 - Felipe Lula 2");
            System.out.println("3 - BolsoDanDan 3");
            System.out.println("Digite o numero do seu candidato: ");
            int voto = teclado.nextInt();

            switch (voto) {
                case 1:
                    vtCand1++;
                    break;
                case 2:
                    vtCand2++;
                    break;
                case 3:
                    vtCand3++;
                    break;
                default:
                    vtInvald++;
                    System.out.println("Voto inválido.");
                    break;
            }
        }
        System.out.println("Resultado da eleição: ");
        System.out.println("Canditato 1: "+vtCand1+" votos." );
        System.out.println("Canditato 2: "+vtCand2+" votos." );
        System.out.println("Canditato 3: "+vtCand3+" votos." );
        System.out.println("Os votos invalidos são " +vtInvald+ " votos.");
        teclado.close();
    }
}
