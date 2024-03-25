package Lista2_POO;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int escolha;

        do {

            System.out.println("Escolha a resposta que deseja executar:");
            System.out.println("1. Questão 1");
            System.out.println("2. Questão 2");
            System.out.println("3. Questão 3");
            System.out.println("4. Questão 4");
            System.out.println("5. Questão 5");
            System.out.println("6. Questão 6");
            System.out.println("7. Questão 7");
            System.out.println("8. Questão 8");
            System.out.println("9. Questão 9");
            System.out.println("10. Questão 10");
            System.out.println("11. Questão 11");
            System.out.println("12. Questão 12");
            System.out.println("13. Questão 13");
            System.out.println("14. Questão 14");
            System.out.println("0. Sair");

            System.out.print("Digite o número da opção desejada: ");
            escolha = teclado.nextInt();


            switch (escolha) {
                case 1:
                    Lista2_q1.Questao1();
                    break;
                case 2:
                    Lista2_q2.Questao2();
                    break;
                case 3:
                    Lista2_q3.Questao3();
                    break;
                case 4:
                    Lista2_q4.questao4();
                    break;
                case 5:
                    Lista2_q5.questao5();
                    break;
                case 6:
                    Lista2_q6.Questao6();
                    break;
                case 7:
                    Lista2_q7.Questao7();
                    break;
                case 8:
                    Lista2_q8.Questao8();
                    break;
                case 9:
                    Lista2_q9.Questao9();
                    break;
                case 10:
                    Lista2_q10.Questao10();
                    break;
                case 11:
                    Lista2_q11.Questao11();
                    break;
                case 12:
                    Lista2_q12.Questao12();
                    break;
                case 13:
                    Lista2_q13.Questao13();
                    break;
                case 14:
                    Lista2_q14.Questao14();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            System.out.println();

        } while (escolha != 0);
        teclado.close();


    }
}