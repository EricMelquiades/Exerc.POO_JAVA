package Lista2_POO;
//Autor: Eric Melquíades
//Media de Idade da turma.

import java.util.Scanner;
public class Lista2_q9 {
    public static void Questao9(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos alunos tem na turma?");
        int quantAluno = teclado.nextInt();
        int somaIdade = 0;

        for (int i = 1; i <= quantAluno; i++) {
            System.out.println("Digite a idade da pessoa " + i + ": ");
            int idade = teclado.nextInt();
            somaIdade += idade;

        }
        double mediaIdade = (double) somaIdade/quantAluno;

        String divisao, mediaIdadeFomr;

        mediaIdadeFomr = String.format("%.2f", mediaIdade);

        if (mediaIdade >= 0 && mediaIdade <= 25) {
            divisao = "Jovem.";
        } else if (mediaIdade <= 60) {
            divisao = "Adulta.";
        } else {
            divisao = "Idosa.";
        }

        System.out.println("A média de idade da turma é " + mediaIdadeFomr+ " e a turma é majoritariamente " + divisao );
        teclado.close();
    }

}
