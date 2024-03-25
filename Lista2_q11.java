package Lista2_POO;
//Autor: Eric Melquíades
//Media de quantidade de alunos

import java.util.Scanner;
public class Lista2_q11 {
    public static void Questao11(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidades de turmas: ");
        int quantTurmas = teclado.nextInt();

        while (quantTurmas <= 0 ){
            System.out.println("Quantidade invalida, inserir turma válida");
            System.out.println("Digite a quantidade de turmas: ");
            quantTurmas = teclado.nextInt();
        }
        int totalAlunos = 0;

        for (int i = 1; i <= quantTurmas ; i++) {
            System.out.println("Digite a quantidade de alunos na turma " + i + ": ");
            int alunosturma = teclado.nextInt();

            while (alunosturma <=0 || alunosturma > 40 ){
                System.out.println("Quantidade invalida, inserir quantidade válida");
                System.out.println("Digite a quantidade de alunos: ");
                alunosturma = teclado.nextInt();
            }
            totalAlunos += alunosturma;
        }
        double mediaAlunos = (double) totalAlunos/quantTurmas;
        String mediaAlunosForm = String.format("%.1f", mediaAlunos);

        System.out.println("O número de alunos por turma é: "+ mediaAlunosForm);

        teclado.close();
    }
}